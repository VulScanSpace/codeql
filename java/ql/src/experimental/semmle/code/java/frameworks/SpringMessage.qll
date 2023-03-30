import java

/**
 * An `AnnotationType` that is used to indicate a `MessageMapping`.
 */
class SpringMessageMappingType extends AnnotationType {
    SpringMessageMappingType() {
      // `@RequestMapping` used directly as an annotation.
      this.hasQualifiedName("org.springframework.messaging.handler.annotation", "MessageMapping")
      or
      // `@RequestMapping` can be used as a meta-annotation on other annotation types, e.g. GetMapping, PostMapping etc.
      this.getAnAnnotation().getType() instanceof SpringMessageMappingType
    }
  }