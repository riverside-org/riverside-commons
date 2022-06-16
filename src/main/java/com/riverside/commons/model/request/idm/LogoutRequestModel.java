package com.riverside.commons.model.request.idm;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class LogoutRequestModel {
    @NonNull
    private String email;
    @NonNull
    private String sessionId;
}
