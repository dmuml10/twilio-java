/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.preview.sync.service.document;

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
public class DocumentPermission extends Resource {
    private static final long serialVersionUID = 172715793000822L;

    /**
     * Create a DocumentPermissionFetcher to execute fetch.
     * 
     * @param serviceSid The service_sid
     * @param documentSid Sync Document SID or unique name.
     * @param identity Identity of the user to whom the Sync Document Permission
     *                 applies.
     * @return DocumentPermissionFetcher capable of executing the fetch
     */
    public static DocumentPermissionFetcher fetcher(final String serviceSid, 
                                                    final String documentSid, 
                                                    final String identity) {
        return new DocumentPermissionFetcher(serviceSid, documentSid, identity);
    }

    /**
     * Create a DocumentPermissionDeleter to execute delete.
     * 
     * @param serviceSid The service_sid
     * @param documentSid Sync Document SID or unique name.
     * @param identity Identity of the user to whom the Sync Document Permission
     *                 applies.
     * @return DocumentPermissionDeleter capable of executing the delete
     */
    public static DocumentPermissionDeleter deleter(final String serviceSid, 
                                                    final String documentSid, 
                                                    final String identity) {
        return new DocumentPermissionDeleter(serviceSid, documentSid, identity);
    }

    /**
     * Create a DocumentPermissionReader to execute read.
     * 
     * @param serviceSid The service_sid
     * @param documentSid Sync Document SID or unique name.
     * @return DocumentPermissionReader capable of executing the read
     */
    public static DocumentPermissionReader reader(final String serviceSid, 
                                                  final String documentSid) {
        return new DocumentPermissionReader(serviceSid, documentSid);
    }

    /**
     * Create a DocumentPermissionUpdater to execute update.
     * 
     * @param serviceSid Sync Service Instance SID.
     * @param documentSid Sync Document SID or unique name.
     * @param identity Identity of the user to whom the Sync Document Permission
     *                 applies.
     * @param read Read access.
     * @param write Write access.
     * @param manage Manage access.
     * @return DocumentPermissionUpdater capable of executing the update
     */
    public static DocumentPermissionUpdater updater(final String serviceSid, 
                                                    final String documentSid, 
                                                    final String identity, 
                                                    final Boolean read, 
                                                    final Boolean write, 
                                                    final Boolean manage) {
        return new DocumentPermissionUpdater(serviceSid, documentSid, identity, read, write, manage);
    }

    /**
     * Converts a JSON String into a DocumentPermission object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return DocumentPermission object represented by the provided JSON
     */
    public static DocumentPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a DocumentPermission object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return DocumentPermission object represented by the provided JSON
     */
    public static DocumentPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String documentSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private DocumentPermission(@JsonProperty("account_sid")
                               final String accountSid, 
                               @JsonProperty("service_sid")
                               final String serviceSid, 
                               @JsonProperty("document_sid")
                               final String documentSid, 
                               @JsonProperty("identity")
                               final String identity, 
                               @JsonProperty("read")
                               final Boolean read, 
                               @JsonProperty("write")
                               final Boolean write, 
                               @JsonProperty("manage")
                               final Boolean manage, 
                               @JsonProperty("url")
                               final URI url) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.documentSid = documentSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
        this.url = url;
    }

    /**
     * Returns The Twilio Account SID..
     * 
     * @return Twilio Account SID.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The Sync Service Instance SID..
     * 
     * @return Sync Service Instance SID.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Sync Document SID..
     * 
     * @return Sync Document SID.
     */
    public final String getDocumentSid() {
        return this.documentSid;
    }

    /**
     * Returns The Identity of the user to whom the Sync Document Permission
     * applies..
     * 
     * @return Identity of the user to whom the Sync Document Permission applies.
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The Read access..
     * 
     * @return Read access.
     */
    public final Boolean getRead() {
        return this.read;
    }

    /**
     * Returns The Write access..
     * 
     * @return Write access.
     */
    public final Boolean getWrite() {
        return this.write;
    }

    /**
     * Returns The Manage access..
     * 
     * @return Manage access.
     */
    public final Boolean getManage() {
        return this.manage;
    }

    /**
     * Returns The URL of this Sync Document Permission..
     * 
     * @return URL of this Sync Document Permission.
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
        
        DocumentPermission other = (DocumentPermission) o;
        
        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(documentSid, other.documentSid) && 
               Objects.equals(identity, other.identity) && 
               Objects.equals(read, other.read) && 
               Objects.equals(write, other.write) && 
               Objects.equals(manage, other.manage) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            serviceSid,
                            documentSid,
                            identity,
                            read,
                            write,
                            manage,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("documentSid", documentSid)
                          .add("identity", identity)
                          .add("read", read)
                          .add("write", write)
                          .add("manage", manage)
                          .add("url", url)
                          .toString();
    }
}