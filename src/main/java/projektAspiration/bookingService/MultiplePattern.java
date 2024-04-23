package projektAspiration.bookingService;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MultiplePattern {
    String[] patterns();
}
