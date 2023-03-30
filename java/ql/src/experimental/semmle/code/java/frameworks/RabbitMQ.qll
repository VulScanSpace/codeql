import java

  
  /**
   * An `AnnotationType` that is used to indicate a `RequestMapping`.
   */
  class SpringRabbitListenerType extends AnnotationType {
    SpringRabbitListenerType() {
      // `@RequestMapping` used directly as an annotation.
      this.hasQualifiedName("org.springframework.amqp.rabbit.annotation", "RabbitListener")
      or
      // `@RequestMapping` can be used as a meta-annotation on other annotation types, e.g. GetMapping, PostMapping etc.
      this.getAnAnnotation().getType() instanceof SpringRabbitListenerType
    }
  }
  