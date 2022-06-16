package com.riverside.commons.model.response.idm;

import com.riverside.commons.model.response.GenericResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponseModel extends GenericResponse {
    private String email;

    public RegisterResponseModel(int resultCode, String message, String email) {
        super(resultCode, message);
        this.email = email;
    }
}
