package com.shrad.bookmovies.exceptions;

import org.springframework.http.HttpStatus;

public class DBException extends Throwable {
    public DBException(HttpStatus internalServerError, String s, Exception exp) {
    }
}
