package com.riverside.commons.model.request.idm;

import com.riverside.commons.model.request.RequestModel;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class LogoutRequestModel implements RequestModel {
    @NonNull
    private String email;
    @NonNull
    private String sessionId;
}
