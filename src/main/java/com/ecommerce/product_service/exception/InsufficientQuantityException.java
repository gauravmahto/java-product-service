package com.ecommerce.product_service.exception;

public class InsufficientQuantityException extends RuntimeException {
    public InsufficientQuantityException(String message) {
        super(message);
    }

    public InsufficientQuantityException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientQuantityException(Throwable cause) {
        super(cause);
    }

    public InsufficientQuantityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
