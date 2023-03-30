/**
 * @kind problem
 */
import java

from MethodAccess ma
where ma.getMethod().hasQualifiedName("io.ast.vulns.service.jdbc", "HookRuleService", "queryRule")
select ma.getMethod(), "this is queryRule."
