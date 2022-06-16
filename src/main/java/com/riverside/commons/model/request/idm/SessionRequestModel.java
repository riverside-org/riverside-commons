package com.riverside.commons.model.request.idm;

import lombok.Data;
import lombok.NonNull;

@Data
public class SessionRequestModel {
    @NonNull
    private String email;
    @NonNull
    private String sessionId;
}
