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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * A token used for advancing to a specific page of results for your get relational database parameters request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get parameters.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * 
     * @return The name of your database for which to get parameters.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseParametersRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your get relational database parameters request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your get relational database parameters
     *        request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your get relational database parameters request.
     * </p>
     * 
     * @return A token used for advancing to a specific page of results for your get relational database parameters
     *         request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your get relational database parameters request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your get relational database parameters
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseParametersRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseParametersRequest == false)
            return false;
        GetRelationalDatabaseParametersRequest other = (GetRelationalDatabaseParametersRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseParametersRequest clone() {
        return (GetRelationalDatabaseParametersRequest) super.clone();
    }

}
