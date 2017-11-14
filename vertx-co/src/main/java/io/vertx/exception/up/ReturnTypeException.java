package io.vertx.exception.up;

import io.vertx.exception.WebException;

import java.lang.reflect.Method;

public class ReturnTypeException extends WebException {

    public ReturnTypeException(final Class<?> clazz,
                               final Method method) {
        super(clazz, method.getName(), method.getDeclaringClass().getName());
    }

    @Override
    public int getCode() {
        return -40013;
    }
}