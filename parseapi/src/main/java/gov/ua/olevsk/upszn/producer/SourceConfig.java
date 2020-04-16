package gov.ua.olevsk.upszn.producer;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER})
public @interface SourceConfig {
    @Nonbinding String value() default "";
    @Nonbinding boolean required() default true;
}
