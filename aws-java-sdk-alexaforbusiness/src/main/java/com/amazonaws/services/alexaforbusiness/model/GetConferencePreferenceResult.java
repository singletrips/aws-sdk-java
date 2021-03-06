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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConferencePreferenceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The conference preference.
     * </p>
     */
    private ConferencePreference preference;

    /**
     * <p>
     * The conference preference.
     * </p>
     * 
     * @param preference
     *        The conference preference.
     */

    public void setPreference(ConferencePreference preference) {
        this.preference = preference;
    }

    /**
     * <p>
     * The conference preference.
     * </p>
     * 
     * @return The conference preference.
     */

    public ConferencePreference getPreference() {
        return this.preference;
    }

    /**
     * <p>
     * The conference preference.
     * </p>
     * 
     * @param preference
     *        The conference preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConferencePreferenceResult withPreference(ConferencePreference preference) {
        setPreference(preference);
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
        if (getPreference() != null)
            sb.append("Preference: ").append(getPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConferencePreferenceResult == false)
            return false;
        GetConferencePreferenceResult other = (GetConferencePreferenceResult) obj;
        if (other.getPreference() == null ^ this.getPreference() == null)
            return false;
        if (other.getPreference() != null && other.getPreference().equals(this.getPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreference() == null) ? 0 : getPreference().hashCode());
        return hashCode;
    }

    @Override
    public GetConferencePreferenceResult clone() {
        try {
            return (GetConferencePreferenceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
