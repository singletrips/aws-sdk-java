/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateIntegrationResponseResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIntegrationResponseResultJsonUnmarshaller implements Unmarshaller<UpdateIntegrationResponseResult, JsonUnmarshallerContext> {

    public UpdateIntegrationResponseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIntegrationResponseResult updateIntegrationResponseResult = new UpdateIntegrationResponseResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateIntegrationResponseResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("contentHandlingStrategy", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setContentHandlingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationResponseId", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setIntegrationResponseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationResponseKey", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setIntegrationResponseKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("responseParameters", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setResponseParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("responseTemplates", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setResponseTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("templateSelectionExpression", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResponseResult.setTemplateSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateIntegrationResponseResult;
    }

    private static UpdateIntegrationResponseResultJsonUnmarshaller instance;

    public static UpdateIntegrationResponseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIntegrationResponseResultJsonUnmarshaller();
        return instance;
    }
}
