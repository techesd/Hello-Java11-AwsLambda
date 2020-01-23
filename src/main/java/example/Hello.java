package example;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Hello {

    public String handleRequest() {
        String greetingString = "Hello World!";
        return greetingString;
    }
}