package io.spring.reactive.reactiveSpring;

/**
 * Starting with Greeting POJO that will be serializes
 * as JSON by our RESTful service
 */
public class Greeting {
    private String message;

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
}
