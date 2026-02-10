package com.security.authservice.dto.response;

import java.time.LocalDateTime;

public class ApiError {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ApiError(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    // getters
}
