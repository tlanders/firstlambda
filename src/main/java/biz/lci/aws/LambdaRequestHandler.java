package biz.lci.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaRequestHandler implements RequestHandler<String, String> {
    /**
     * Sample request handler for AWS Lambda. This method must be passed a string (i.e. "XXX")
     * and not JSON. JSON will fail.
     * @param input
     * @param context
     * @return  A result string based on the input.
     */
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}