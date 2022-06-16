package com.riverside.commons.model.response;

import lombok.Data;

@Data
public class TemplatedResponse<T> extends GenericResponse {
    private T t;
    public TemplatedResponse(int resultCode, String message, T t) {
        super(resultCode, message);
        this.t = t;
    }
}
