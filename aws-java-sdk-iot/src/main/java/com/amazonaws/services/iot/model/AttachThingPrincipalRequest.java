/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the AttachThingPrincipal operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachThingPrincipalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The principal, such as a certificate or other credential.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachThingPrincipalRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The principal, such as a certificate or other credential.
     * </p>
     * 
     * @param principal
     *        The principal, such as a certificate or other credential.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal, such as a certificate or other credential.
     * </p>
     * 
     * @return The principal, such as a certificate or other credential.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal, such as a certificate or other credential.
     * </p>
     * 
     * @param principal
     *        The principal, such as a certificate or other credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachThingPrincipalRequest withPrincipal(String principal) {
        setPrincipal(principal);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachThingPrincipalRequest == false)
            return false;
        AttachThingPrincipalRequest other = (AttachThingPrincipalRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public AttachThingPrincipalRequest clone() {
        return (AttachThingPrincipalRequest) super.clone();
    }

}
