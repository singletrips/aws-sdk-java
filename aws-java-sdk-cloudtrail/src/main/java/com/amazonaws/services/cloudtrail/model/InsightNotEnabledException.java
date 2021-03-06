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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * If you run <code>GetInsightSelectors</code> on a trail that does not have Insights events enabled, the operation
 * throws the exception <code>InsightNotEnabledException</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightNotEnabledException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InsightNotEnabledException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InsightNotEnabledException(String message) {
        super(message);
    }

}
