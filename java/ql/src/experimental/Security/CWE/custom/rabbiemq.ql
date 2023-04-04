/**
 * @kind problem
 */

import java
import semmle.code.java.dataflow.TaintTracking
import semmle.code.java.dataflow.DataFlow
import semmle.code.java.frameworks.RabbitMQ
import semmle.code.java.dataflow.FlowSources


// from Method m, Annotation a
// where
//   m.hasAnnotation(a) and
//   a.getType().getQualifiedName() = "org.springframework.amqp.rabbit.annotation.RabbitListener" and
//   exists(PathNode sourceNode |
//     sourceNode.asExpr().getValue() instanceof rabbitmq::Message and
//     isTainted(sourceNode.asExpr())
//   )
// select m, "RabbitMQ message source"

// class RabbitListenerMethod extends Method{
//   RabbitListenerMethod(){
//     this.getAnAnnotation() instanceof SpringRabbitListenerType
//   }
// }

// from Method m, SpringRabbitListenerType a
// where m.hasAnnotation(a)

// from RabbitListenerMethod m
// select m, "rabbitma"

// from Method m, AnnotationType a
// where (m.getAnAnnotation() instanceof a) and a.hasQualifiedName("org.springframework.amqp.rabbit.annotation", "RabbitListener")
// select m

// from SpringRabbitListenerAnnotationType a
// select a

/**
 * A taint-tracking configuration for unvalidated user input that is used to run an external process.
 */
class RabbitMqInputToArgumentToExecFlowConfig extends TaintTracking::Configuration {
  RabbitMqInputToArgumentToExecFlowConfig() {
    this = "ExecCommon::RabbitMqInputToArgumentToExecFlowConfig"
  }

  override predicate isSource(DataFlow::Node src) { src instanceof RabbitListenerParameterSource }

  override predicate isSink(DataFlow::Node sink) { sink.asExpr() instanceof ArgumentToExec }
}

/**
 * Implementation of `ExecTainted.ql`. It is extracted to a QLL
 * so that it can be excluded from `ExecUnescaped.ql` to avoid
 * reporting overlapping results.
 */
predicate execTainted(DataFlow::PathNode source, DataFlow::PathNode sink, ArgumentToExec execArg) {
  exists(RabbitMqInputToArgumentToExecFlowConfig conf |
    conf.hasFlowPath(source, sink) and sink.getNode() = DataFlow::exprNode(execArg)
  )
}


from DataFlow::PathNode source, DataFlow::PathNode sink, ArgumentToExec execArg
where execTainted(source, sink, execArg)
select execArg, source, sink, "This command line depends on a $@.", source.getNode(),
  "user-provided value"

// from Method m, SpringRabbitListenerAnnotationType at, Annotation a
// where a instanceof at and m.getAnAnnotation() instanceof a
// select m
