/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.notify.v1.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification extends Resource {
    private static final long serialVersionUID = 239493407416322L;

    public enum Priority {
        HIGH("high"),
        LOW("low");
    
        private final String value;
        
        private Priority(final String value) {
            this.value = value;
        }
        
        public String toString() {
            return value;
        }
        
        /**
         * Generate a Priority from a string.
         * @param value string value
         * @return generated Priority
         */
        @JsonCreator
        public static Priority forValue(final String value) {
            String normalized = value.replace("-", "_").toUpperCase();
            try {
                return Priority.valueOf(normalized);
            } catch (RuntimeException e) {
        
                // Don't blow up of value does not exist
                return null;
            }
        }
    }

    /**
     * Create a NotificationCreator to execute create.
     * 
     * @param serviceSid The service_sid
     * @return NotificationCreator capable of executing the create
     */
    public static NotificationCreator creator(final String serviceSid) {
        return new NotificationCreator(serviceSid);
    }

    /**
     * Converts a JSON String into a Notification object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Notification object represented by the provided JSON
     */
    public static Notification fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Notification object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Notification object represented by the provided JSON
     */
    public static Notification fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final DateTime dateCreated;
    private final List<String> identities;
    private final List<String> tags;
    private final Notification.Priority priority;
    private final Integer ttl;
    private final String title;
    private final String body;
    private final String sound;
    private final String action;
    private final Map<String, Object> data;
    private final Map<String, Object> apn;
    private final Map<String, Object> gcm;
    private final Map<String, Object> fcm;
    private final Map<String, Object> sms;
    private final Map<String, Object> facebookMessenger;

    @JsonCreator
    private Notification(@JsonProperty("sid")
                         final String sid, 
                         @JsonProperty("account_sid")
                         final String accountSid, 
                         @JsonProperty("service_sid")
                         final String serviceSid, 
                         @JsonProperty("date_created")
                         final String dateCreated, 
                         @JsonProperty("identities")
                         final List<String> identities, 
                         @JsonProperty("tags")
                         final List<String> tags, 
                         @JsonProperty("priority")
                         final Notification.Priority priority, 
                         @JsonProperty("ttl")
                         final Integer ttl, 
                         @JsonProperty("title")
                         final String title, 
                         @JsonProperty("body")
                         final String body, 
                         @JsonProperty("sound")
                         final String sound, 
                         @JsonProperty("action")
                         final String action, 
                         @JsonProperty("data")
                         final Map<String, Object> data, 
                         @JsonProperty("apn")
                         final Map<String, Object> apn, 
                         @JsonProperty("gcm")
                         final Map<String, Object> gcm, 
                         @JsonProperty("fcm")
                         final Map<String, Object> fcm, 
                         @JsonProperty("sms")
                         final Map<String, Object> sms, 
                         @JsonProperty("facebook_messenger")
                         final Map<String, Object> facebookMessenger) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.identities = identities;
        this.tags = tags;
        this.priority = priority;
        this.ttl = ttl;
        this.title = title;
        this.body = body;
        this.sound = sound;
        this.action = action;
        this.data = data;
        this.apn = apn;
        this.gcm = gcm;
        this.fcm = fcm;
        this.sms = sms;
        this.facebookMessenger = facebookMessenger;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The service_sid.
     * 
     * @return The service_sid
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The identities.
     * 
     * @return The identities
     */
    public final List<String> getIdentities() {
        return this.identities;
    }

    /**
     * Returns The The tags.
     * 
     * @return The tags
     */
    public final List<String> getTags() {
        return this.tags;
    }

    /**
     * Returns The The priority.
     * 
     * @return The priority
     */
    public final Notification.Priority getPriority() {
        return this.priority;
    }

    /**
     * Returns The The ttl.
     * 
     * @return The ttl
     */
    public final Integer getTtl() {
        return this.ttl;
    }

    /**
     * Returns The The title.
     * 
     * @return The title
     */
    public final String getTitle() {
        return this.title;
    }

    /**
     * Returns The The body.
     * 
     * @return The body
     */
    public final String getBody() {
        return this.body;
    }

    /**
     * Returns The The sound.
     * 
     * @return The sound
     */
    public final String getSound() {
        return this.sound;
    }

    /**
     * Returns The The action.
     * 
     * @return The action
     */
    public final String getAction() {
        return this.action;
    }

    /**
     * Returns The The data.
     * 
     * @return The data
     */
    public final Map<String, Object> getData() {
        return this.data;
    }

    /**
     * Returns The The apn.
     * 
     * @return The apn
     */
    public final Map<String, Object> getApn() {
        return this.apn;
    }

    /**
     * Returns The The gcm.
     * 
     * @return The gcm
     */
    public final Map<String, Object> getGcm() {
        return this.gcm;
    }

    /**
     * Returns The The fcm.
     * 
     * @return The fcm
     */
    public final Map<String, Object> getFcm() {
        return this.fcm;
    }

    /**
     * Returns The The sms.
     * 
     * @return The sms
     */
    public final Map<String, Object> getSms() {
        return this.sms;
    }

    /**
     * Returns The The facebook_messenger.
     * 
     * @return The facebook_messenger
     */
    public final Map<String, Object> getFacebookMessenger() {
        return this.facebookMessenger;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Notification other = (Notification) o;
        
        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(identities, other.identities) && 
               Objects.equals(tags, other.tags) && 
               Objects.equals(priority, other.priority) && 
               Objects.equals(ttl, other.ttl) && 
               Objects.equals(title, other.title) && 
               Objects.equals(body, other.body) && 
               Objects.equals(sound, other.sound) && 
               Objects.equals(action, other.action) && 
               Objects.equals(data, other.data) && 
               Objects.equals(apn, other.apn) && 
               Objects.equals(gcm, other.gcm) && 
               Objects.equals(fcm, other.fcm) && 
               Objects.equals(sms, other.sms) && 
               Objects.equals(facebookMessenger, other.facebookMessenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            dateCreated,
                            identities,
                            tags,
                            priority,
                            ttl,
                            title,
                            body,
                            sound,
                            action,
                            data,
                            apn,
                            gcm,
                            fcm,
                            sms,
                            facebookMessenger);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("dateCreated", dateCreated)
                          .add("identities", identities)
                          .add("tags", tags)
                          .add("priority", priority)
                          .add("ttl", ttl)
                          .add("title", title)
                          .add("body", body)
                          .add("sound", sound)
                          .add("action", action)
                          .add("data", data)
                          .add("apn", apn)
                          .add("gcm", gcm)
                          .add("fcm", fcm)
                          .add("sms", sms)
                          .add("facebookMessenger", facebookMessenger)
                          .toString();
    }
}