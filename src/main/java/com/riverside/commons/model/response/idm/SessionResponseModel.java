package com.riverside.commons.model.response.idm;

import com.riverside.commons.model.response.GenericResponse;
import lombok.Data;

@Data
public class SessionResponseModel extends GenericResponse {
    private String sessionId;

    public SessionResponseModel(int resultCode, String message, String sessionId) {
        super(resultCode, message);
        this.sessionId = sessionId;
    }
}
