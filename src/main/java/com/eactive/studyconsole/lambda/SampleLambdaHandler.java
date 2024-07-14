package com.eactive.studyconsole.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SampleLambdaHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String s, Context context) {
        return "Sample-Response";
    }
}

