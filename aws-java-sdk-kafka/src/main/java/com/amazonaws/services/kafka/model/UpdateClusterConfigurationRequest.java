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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateClusterConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * Represents the configuration that you want MSK to use for the brokers in a cluster.
     * </p>
     */
    private ConfigurationInfo configurationInfo;
    /**
     * <p>
     * The version of the cluster that needs to be updated.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterConfigurationRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * Represents the configuration that you want MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Represents the configuration that you want MSK to use for the brokers in a cluster.
     *        </p>
     */

    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * <p>
     * Represents the configuration that you want MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @return <p>
     *         Represents the configuration that you want MSK to use for the brokers in a cluster.
     *         </p>
     */

    public ConfigurationInfo getConfigurationInfo() {
        return this.configurationInfo;
    }

    /**
     * <p>
     * Represents the configuration that you want MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Represents the configuration that you want MSK to use for the brokers in a cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterConfigurationRequest withConfigurationInfo(ConfigurationInfo configurationInfo) {
        setConfigurationInfo(configurationInfo);
        return this;
    }

    /**
     * <p>
     * The version of the cluster that needs to be updated.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of the cluster that needs to be updated.
     *        </p>
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the cluster that needs to be updated.
     * </p>
     * 
     * @return <p>
     *         The version of the cluster that needs to be updated.
     *         </p>
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the cluster that needs to be updated.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of the cluster that needs to be updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterConfigurationRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: ").append(getConfigurationInfo()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterConfigurationRequest == false)
            return false;
        UpdateClusterConfigurationRequest other = (UpdateClusterConfigurationRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterConfigurationRequest clone() {
        return (UpdateClusterConfigurationRequest) super.clone();
    }

}
