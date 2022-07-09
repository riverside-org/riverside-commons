package com.riverside.commons.model.request.idm;

import com.riverside.commons.model.request.RequestModel;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class LoginRequestModel implements RequestModel {
    @NonNull
    private String email;
    @NonNull
    private String username;
    @NonNull
    private char[] password;

}
