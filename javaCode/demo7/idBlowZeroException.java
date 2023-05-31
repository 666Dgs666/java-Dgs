package com.tomorrow.demo7;

public class idBlowZeroException extends Exception{
    static final long serialVersionUID = -33875169931242298L;
    public idBlowZeroException() {}
    public idBlowZeroException(String message) {
        super(message);
    }
    public idBlowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
    public idBlowZeroException(Throwable cause) {
        super(cause);
    }
    protected idBlowZeroException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
