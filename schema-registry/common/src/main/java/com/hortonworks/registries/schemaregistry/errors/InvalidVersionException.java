package com.hortonworks.registries.schemaregistry.errors;

/**
 * @Author wenchao.wu
 * @Date 2022-01-17 19:52
 */
public class InvalidVersionException extends Exception {

    public InvalidVersionException() {
    }

    public InvalidVersionException(String message) {
        super(message);
    }

    public InvalidVersionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVersionException(Throwable cause) {
        super(cause);
    }

    public InvalidVersionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
