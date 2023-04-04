import java

  
  /**
   * An `AnnotationType` that is used to indicate a `RabbitListener`.
   */
  class SpringRabbitListenerAnnotationType extends AnnotationType {
    SpringRabbitListenerAnnotationType() {
      // `@RabbitListener` used directly as an annotation.
      this.hasQualifiedName("org.springframework.amqp.rabbit.annotation", "RabbitListener")
      // or
      // // `@RabbitListener` can be used as a meta-annotation on other annotation types, e.g. GetMapping, PostMapping etc.
      // this.getAnAnnotation().getType() instanceof SpringRabbitListenerType
    }
  }
  

  class RabbitListenerAnnotation extends Annotation{
    RabbitListenerAnnotation(){this.getType() instanceof SpringRabbitListenerAnnotationType}
  }

  class RabbitListenerMethod extends Method{
    RabbitListenerAnnotation rabbitListenerAnnotation;
    RabbitListenerMethod(){
      this.getAnAnnotation() = rabbitListenerAnnotation
    }
  }

