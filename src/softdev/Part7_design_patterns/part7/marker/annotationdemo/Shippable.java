package be.kuleuven.groept.softdev.part7.marker.annotationdemo;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
public @interface Shippable {
}
