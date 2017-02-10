/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.preview.marketplace.availableaddon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableAddOnExtension extends Resource {
    private static final long serialVersionUID = 88592059649526L;

    /**
     * Create a AvailableAddOnExtensionFetcher to execute fetch.
     * 
     * @param availableAddOnSid The available_add_on_sid
     * @param sid The unique Extension Sid
     * @return AvailableAddOnExtensionFetcher capable of executing the fetch
     */
    public static AvailableAddOnExtensionFetcher fetcher(final String availableAddOnSid, 
                                                         final String sid) {
        return new AvailableAddOnExtensionFetcher(availableAddOnSid, sid);
    }

    /**
     * Create a AvailableAddOnExtensionReader to execute read.
     * 
     * @param availableAddOnSid The available_add_on_sid
     * @return AvailableAddOnExtensionReader capable of executing the read
     */
    public static AvailableAddOnExtensionReader reader(final String availableAddOnSid) {
        return new AvailableAddOnExtensionReader(availableAddOnSid);
    }

    /**
     * Converts a JSON String into a AvailableAddOnExtension object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return AvailableAddOnExtension object represented by the provided JSON
     */
    public static AvailableAddOnExtension fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AvailableAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a AvailableAddOnExtension object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return AvailableAddOnExtension object represented by the provided JSON
     */
    public static AvailableAddOnExtension fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AvailableAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String availableAddOnSid;
    private final String friendlyName;
    private final String productName;
    private final String uniqueName;
    private final URI url;

    @JsonCreator
    private AvailableAddOnExtension(@JsonProperty("sid")
                                    final String sid, 
                                    @JsonProperty("available_add_on_sid")
                                    final String availableAddOnSid, 
                                    @JsonProperty("friendly_name")
                                    final String friendlyName, 
                                    @JsonProperty("product_name")
                                    final String productName, 
                                    @JsonProperty("unique_name")
                                    final String uniqueName, 
                                    @JsonProperty("url")
                                    final URI url) {
        this.sid = sid;
        this.availableAddOnSid = availableAddOnSid;
        this.friendlyName = friendlyName;
        this.productName = productName;
        this.uniqueName = uniqueName;
        this.url = url;
    }

    /**
     * Returns The A string that uniquely identifies this Extension.
     * 
     * @return A string that uniquely identifies this Extension
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The available_add_on_sid.
     * 
     * @return The available_add_on_sid
     */
    public final String getAvailableAddOnSid() {
        return this.availableAddOnSid;
    }

    /**
     * Returns The A human-readable description of this Extension.
     * 
     * @return A human-readable description of this Extension
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The A human-readable description of the Extension's Product.
     * 
     * @return A human-readable description of the Extension's Product
     */
    public final String getProductName() {
        return this.productName;
    }

    /**
     * Returns The The string that uniquely identifies this Extension.
     * 
     * @return The string that uniquely identifies this Extension
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        AvailableAddOnExtension other = (AvailableAddOnExtension) o;
        
        return Objects.equals(sid, other.sid) && 
               Objects.equals(availableAddOnSid, other.availableAddOnSid) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(productName, other.productName) && 
               Objects.equals(uniqueName, other.uniqueName) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            availableAddOnSid,
                            friendlyName,
                            productName,
                            uniqueName,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("availableAddOnSid", availableAddOnSid)
                          .add("friendlyName", friendlyName)
                          .add("productName", productName)
                          .add("uniqueName", uniqueName)
                          .add("url", url)
                          .toString();
    }
}