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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationRevisionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID that Amazon MQ generates for the configuration. */
    private String configurationId;
    /**
     * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return The unique ID that Amazon MQ generates for the configuration.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must
     *        be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @return The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must
     *         be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must
     *        be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationRevisionsRequest == false)
            return false;
        ListConfigurationRevisionsRequest other = (ListConfigurationRevisionsRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationRevisionsRequest clone() {
        return (ListConfigurationRevisionsRequest) super.clone();
    }

}
