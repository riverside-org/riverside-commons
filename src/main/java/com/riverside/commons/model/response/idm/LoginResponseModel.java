package com.riverside.commons.model.response.idm;

import com.riverside.commons.model.response.GenericResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginResponseModel extends GenericResponse {
    private String email;
    private String sessionId;

    public LoginResponseModel(int resultCode, String message, String email, String sessionId) {
        super(resultCode, message);
        this.email = email;
        this.sessionId = sessionId;
    }
}
