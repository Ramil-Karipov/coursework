package com.coursework.coursework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotUniqueQuestionException extends RuntimeException {
    public NotUniqueQuestionException() {
    }

    public NotUniqueQuestionException(String message) {
        super(message);
    }

    public NotUniqueQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotUniqueQuestionException(Throwable cause) {
        super(cause);
    }

    public NotUniqueQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


