/*
 * FINBOURNE ConfigurationService API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.251
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.configuration.api;

import com.finbourne.configuration.ApiException;
import com.finbourne.configuration.model.ConfigurationItem;
import com.finbourne.configuration.model.ConfigurationSet;
import com.finbourne.configuration.model.CreateConfigurationItem;
import com.finbourne.configuration.model.CreateConfigurationSet;
import com.finbourne.configuration.model.LusidProblemDetails;
import com.finbourne.configuration.model.LusidValidationProblemDetails;
import com.finbourne.configuration.model.PersonalAccessToken;
import com.finbourne.configuration.model.ResourceListOfConfigurationItem;
import com.finbourne.configuration.model.ResourceListOfConfigurationSet;
import com.finbourne.configuration.model.ResourceListOfConfigurationSetSummary;
import com.finbourne.configuration.model.UpdateConfigurationItem;
import com.finbourne.configuration.model.UpdateConfigurationSet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationSetsApi
 */
@Ignore
public class ConfigurationSetsApiTest {

    private final ConfigurationSetsApi api = new ConfigurationSetsApi();

    
    /**
     * [EXPERIMENTAL] AddConfigurationToSet: Add a configuration item to an existing set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addConfigurationToSetTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        CreateConfigurationItem createConfigurationItem = null;
        String userId = null;
        ConfigurationSet response = api.addConfigurationToSet(type, scope, code, createConfigurationItem, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] CreateConfigurationSet: Create a configuration set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfigurationSetTest() throws ApiException {
        CreateConfigurationSet createConfigurationSet = null;
        String userId = null;
        ConfigurationSet response = api.createConfigurationSet(createConfigurationSet, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] DeleteAccessToken: Delete any stored Personal Access Token for the current user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccessTokenTest() throws ApiException {
        api.deleteAccessToken();

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] DeleteConfigurationItem: Remove the specified configuration item from the specified configuration set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConfigurationItemTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        String key = null;
        String userId = null;
        api.deleteConfigurationItem(type, scope, code, key, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] DeleteConfigurationSet: Deletes a configuration set along with all their configuration items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConfigurationSetTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        String userId = null;
        api.deleteConfigurationSet(type, scope, code, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GenerateAccessToken: Generate a Personal Access Token for the current user and stores it in the me token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateAccessTokenTest() throws ApiException {
        String action = null;
        PersonalAccessToken response = api.generateAccessToken(action);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetConfigurationItem: Get the specific configuration item within an existing set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurationItemTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        String key = null;
        Boolean reveal = null;
        String userId = null;
        ConfigurationItem response = api.getConfigurationItem(type, scope, code, key, reveal, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetConfigurationSet: Get a configuration set, including all the associated metadata. By default secrets will not be revealed
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurationSetTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        Boolean reveal = null;
        String userId = null;
        ConfigurationSet response = api.getConfigurationSet(type, scope, code, reveal, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetSystemConfigurationItems: Get the specific system configuration items within a system set  All users have access to this endpoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemConfigurationItemsTest() throws ApiException {
        String code = null;
        String key = null;
        Boolean reveal = null;
        ResourceListOfConfigurationItem response = api.getSystemConfigurationItems(code, key, reveal);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetSystemConfigurationSets: Get the specified system configuration sets, including all their associated metadata. By default secrets will not be revealed  All users have access to this endpoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemConfigurationSetsTest() throws ApiException {
        String code = null;
        Boolean reveal = null;
        ResourceListOfConfigurationSet response = api.getSystemConfigurationSets(code, reveal);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] ListConfigurationSets: List all configuration sets summaries (I.e. list of scope/code combinations available)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConfigurationSetsTest() throws ApiException {
        String type = null;
        String userId = null;
        ResourceListOfConfigurationSetSummary response = api.listConfigurationSets(type, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] UpdateConfigurationItem: Update a configuration item&#39;s value and/or description
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConfigurationItemTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        String key = null;
        UpdateConfigurationItem updateConfigurationItem = null;
        String userId = null;
        ConfigurationItem response = api.updateConfigurationItem(type, scope, code, key, updateConfigurationItem, userId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] UpdateConfigurationSet: Update the description of a configuration set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConfigurationSetTest() throws ApiException {
        String type = null;
        String scope = null;
        String code = null;
        UpdateConfigurationSet updateConfigurationSet = null;
        String userId = null;
        ConfigurationSet response = api.updateConfigurationSet(type, scope, code, updateConfigurationSet, userId);

        // TODO: test validations
    }
    
}