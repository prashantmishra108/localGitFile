package com.java.exception;

/**
 * This enum is used to set the error codes and corresponding messages to be localized by getting the value for the code based on the language from the locale
 * bundle Note: to add new Error Message u need to add the code (as key) and its message (as value) in the locale files
 */
public enum ExceptionErrorMessages {

    EXCEED_TEMPLATES_ALLOWED(5000, "Exceeds maximum template limit"),
    TEMPLATE_NOT_EXIST(5001, "Template doesn't exist"),
    CONNECTION_ERROR_MESSAGE(5003, "Connection error"),
    INVALID_REQUEST_PARAMS(5004, "Invalid request parameters"),
    INVALID_BODY_PARAMS(5005, "Invalid body parameters"),
    TEMPLATE_IS_PUBLISHED(5006, "Cannot update or delete published Templates"),
    EMAIL_TEMPLATE_NAME_UNIQUE_PER_TYPE(5007, "Template name must be unique"),
    TEXT_TEMPLATE_NAME_UNIQUE_PER_TYPE(5008, "Quick Text Template name must be unique"),

    FAILED_TO_UPLOAD_ATTACHMENT(5009, "Failed to upload the attachment"),
    MAX_MEDIA_SIZE_LIMIT_EXCEEDED(5010, "Max media size limit exceeded "),
    INVALID_MEDIA_EXTENSION(5011, "Invalid attachment extension"),
    INVALID_SEARCH_CRITERIA(5012, "Invalid search criteria"),
    FAILED_TO_READ_FILE(5013,"Failed to load the attached file"),
    TEMPLATE_IS_ASSOCIATED(5014, "Cannot unpublish template. Template is assigned to pre-routing configuration(s). Unassign and try again"),
    TEMPLATES_DELETED_SUCCESSFULLY(5015,"Email template(s) deleted successfully"),
    FORBID_REQUEST(5016,"Request not allowed"),
    SERVICE_NOT_AVAILABLE(5017,"The service is unavailable please try again later"),
    
	DISCLAIMER_TEMPLATE_IS_PUBLISHED(5018,"There is a published disclaimer template "),

    FILE_NAME_EXCEEDS_MAX_LENGTH(5019,"File name exceeds the maximum length"),
    BODY_LENGTH_EXCEEDS_MAX_LENGTH(5020,"Body exceeds the maximum length");

    public final int code;
    public final String message;

    ExceptionErrorMessages(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
