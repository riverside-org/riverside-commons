package com.riverside.commons.model.request.idm;

import com.riverside.commons.model.request.RequestModel;
import lombok.Data;
import lombok.NonNull;

@Data
public class SessionRequestModel implements RequestModel {
    @NonNull
    private String email;
    @NonNull
    private String sessionId;
}
