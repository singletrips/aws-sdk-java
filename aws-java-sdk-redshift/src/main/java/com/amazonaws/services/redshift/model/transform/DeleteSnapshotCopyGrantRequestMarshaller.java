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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteSnapshotCopyGrantRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSnapshotCopyGrantRequestMarshaller implements Marshaller<Request<DeleteSnapshotCopyGrantRequest>, DeleteSnapshotCopyGrantRequest> {

    public Request<DeleteSnapshotCopyGrantRequest> marshall(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest) {

        if (deleteSnapshotCopyGrantRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteSnapshotCopyGrantRequest> request = new DefaultRequest<DeleteSnapshotCopyGrantRequest>(deleteSnapshotCopyGrantRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteSnapshotCopyGrant");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteSnapshotCopyGrantRequest.getSnapshotCopyGrantName() != null) {
            request.addParameter("SnapshotCopyGrantName", StringUtils.fromString(deleteSnapshotCopyGrantRequest.getSnapshotCopyGrantName()));
        }

        return request;
    }

}
