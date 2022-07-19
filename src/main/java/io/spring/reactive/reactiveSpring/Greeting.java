package io.spring.reactive.reactiveSpring;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

/**
 * Starting with Greeting POJO that will be serializes
 * as JSON by our RESTful service
 */
public class Greeting {
    private String message;

    @JsonCreator
    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return Objects.equals(message, greeting.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
