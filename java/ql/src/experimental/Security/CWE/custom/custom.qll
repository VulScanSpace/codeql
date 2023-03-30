
import java
private import semmle.code.java.dataflow.DataFlow

abstract class CustomSink extends DataFlow::Node{}

private class DefaultCustomSink extends CustomSink{
    // DefaultCustomSink() { exists(MethodAccess ma | ma.getMethod().hasQualifiedName("io.ast.vulns.service.jdbc", "HookRuleService", "queryRule") and this.asExpr() = ma) }
    DefaultCustomSink() {
        exists(MethodAccess ma, QueryRule m | ma.getQualifier()=this.asExpr() and ma.getMethod()=m )
    }
}

class QueryRule extends Method{
    QueryRule(){
        exists(Method m | this = m and m.hasName("queryRule") and m.getDeclaringType().getASourceSupertype*().hasQualifiedName("io.ast.vulns.service.jdbc", "HookRuleService")
        )
    }
}

/** A call to `XQPreparedExpression.executeQuery`. */
class QueryRuleCall extends MethodAccess {
    QueryRuleCall() {
      exists(Method m |
        this.getMethod() = m and
        m.hasName("queryRule") and
        m.getDeclaringType()
            .getASourceSupertype*()
            .hasQualifiedName("io.ast.vulns.service.jdbc", "HookRuleService")
      )
    }
  
    /** Return this prepared expression. */
    Expr getPreparedExpression() { result = this.getQualifier() }
  }

private class RuleService extends Interface{
    RuleService(){this.hasQualifiedName("io.ast.vulns.service.jdbc", "HookRuleService")}
}
