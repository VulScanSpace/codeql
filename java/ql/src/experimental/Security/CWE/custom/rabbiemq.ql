import java
import semmle.code.java.dataflow.TaintTracking
import semmle.code.java.dataflow.DataFlow
import semmle.code.java.dataflow.DataFlow::isTainted
import semmle.code.java.dataflow.PathGraph
import semmle.code.java.dataflow.PathNode
import semmle.code.java.dataflow.PropagationStep
import semmle.code.java.dataflow.Sanitizer
import semmle.code.java.dataflow.Source
import semmle.code.java.dataflow.Variable
import semmle.code.java.dataflow.VariableAccess
import semmle.code.java.dataflow.VariableDeclaration
import semmle.code.java.dataflow.VariableInitializer
import semmle.code.java.dataflow.ExpressionStatement
import semmle.code.java.dataflow.Statement
import semmle.code.java.dataflow.ReturnStmt
import semmle.code.java.dataflow.IfStmt
import semmle.code.java.dataflow.WhileStmt
import semmle.code.java.dataflow.ForStmt
import semmle.code.java.dataflow.ForEachStmt
import semmle.code.java.dataflow.TryStmt
import semmle.code.java.dataflow.CatchClause
import semmle.code.java.dataflow.ThrowStmt
import semmle.code.java.dataflow.SwitchStmt
import semmle.code.java.dataflow.SwitchLabelStmt
import semmle.code.java.dataflow.BreakStmt
import semmle.code.java.dataflow.ContinueStmt
import semmle.code.java.dataflow.DoStmt
import semmle.code.java.dataflow.SynchronizedStmt
import semmle.code.java.dataflow.LabeledStmt
import semmle.code.java.dataflow.AssertStmt
import semmle.code.java.dataflow.EmptyStmt
import semmle.code.java.dataflow.BlockStmt
import semmle.code.java.dataflow.ClassOrInterfaceDeclaration
import semmle.code.java.dataflow.EnumDeclaration
import semmle.code.java.dataflow.AnnotationDeclaration
import semmle.code.java.dataflow.AnnotationMemberDeclaration
import semmle.code.java.dataflow.ConstructorDeclaration
import semmle.code.java.dataflow.FieldDeclaration
import semmle.code.java.dataflow.InitializerDeclaration
import semmle.code.java.dataflow.MethodDeclaration
import semmle.code.java.dataflow.Parameter
import semmle.code.java.dataflow.TypeParameter
import semmle.code.java.dataflow.EnumConstantDeclaration
import semmle.code.java.dataflow.ImportDeclaration
import semmle.code.java.dataflow.PackageDeclaration
import semmle.code.java.dataflow.CompilationUnit

from Method m, Annotation a
where
  m.hasAnnotation(a) and
  a.getType().getQualifiedName() = "org.springframework.amqp.rabbit.annotation.RabbitListener" and
  exists(PathNode sourceNode |
    sourceNode.asExpr().getValue() instanceof rabbitmq::Message and
    isTainted(sourceNode.asExpr())
  )
select m, "RabbitMQ message source"