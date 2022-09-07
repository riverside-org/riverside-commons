package com.riverside.commons.model.response.idm;

import com.riverside.commons.model.response.GenericResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginResponseModel extends GenericResponse {
    private String userId;
    private String sessionId;

    public LoginResponseModel(int resultCode, String message, String userId, String sessionId) {
        super(resultCode, message);
        this.userId = userId;
        this.sessionId = sessionId;
    }
}
