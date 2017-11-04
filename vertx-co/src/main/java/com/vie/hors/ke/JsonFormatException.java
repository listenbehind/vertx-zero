package com.vie.hors.ke;

import com.vie.hors.ZeroRunException;

import java.text.MessageFormat;

public class JsonFormatException extends ZeroRunException {
    public JsonFormatException(final String filename) {
        super(MessageFormat.format(Message.JSON_MSG, filename, null));
    }

    public JsonFormatException(final String filename, final Throwable ex) {
        super(MessageFormat.format(Message.JSON_MSG, filename, ex.getCause()));
    }
}
