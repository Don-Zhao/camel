package com.camel.annotation;

import com.camel.config.LogFilterAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(LogFilterAutoConfiguration.class)
public @interface EnableLogFilter {
}
