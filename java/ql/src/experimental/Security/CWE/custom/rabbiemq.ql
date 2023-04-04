/**
 * @kind problem
 */

import java
import semmle.code.java.dataflow.TaintTracking
import semmle.code.java.dataflow.DataFlow
import semmle.code.java.frameworks.RabbitMQ


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

from Parameter m
where m.getCallable() instanceof RabbitListenerMethod
select m

// from Method m, SpringRabbitListenerAnnotationType at, Annotation a
// where a instanceof at and m.getAnAnnotation() instanceof a
// select m
