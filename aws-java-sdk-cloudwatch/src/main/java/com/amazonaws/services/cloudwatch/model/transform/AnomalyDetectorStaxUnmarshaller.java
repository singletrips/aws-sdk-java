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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AnomalyDetector StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorStaxUnmarshaller implements Unmarshaller<AnomalyDetector, StaxUnmarshallerContext> {

    public AnomalyDetector unmarshall(StaxUnmarshallerContext context) throws Exception {
        AnomalyDetector anomalyDetector = new AnomalyDetector();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return anomalyDetector;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Namespace", targetDepth)) {
                    anomalyDetector.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricName", targetDepth)) {
                    anomalyDetector.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions", targetDepth)) {
                    anomalyDetector.withDimensions(new ArrayList<Dimension>());
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    anomalyDetector.withDimensions(DimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Stat", targetDepth)) {
                    anomalyDetector.setStat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Configuration", targetDepth)) {
                    anomalyDetector.setConfiguration(AnomalyDetectorConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateValue", targetDepth)) {
                    anomalyDetector.setStateValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return anomalyDetector;
                }
            }
        }
    }

    private static AnomalyDetectorStaxUnmarshaller instance;

    public static AnomalyDetectorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalyDetectorStaxUnmarshaller();
        return instance;
    }
}
