package com.coursework.coursework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsAmountExceededException extends RuntimeException {
    public QuestionsAmountExceededException() {
    }

    public QuestionsAmountExceededException(String message) {
        super(message);
    }

    public QuestionsAmountExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsAmountExceededException(Throwable cause) {
        super(cause);
    }

    public QuestionsAmountExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
