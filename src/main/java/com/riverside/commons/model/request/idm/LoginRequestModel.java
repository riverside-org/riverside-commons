package com.riverside.commons.model.request.idm;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class LoginRequestModel {
    @NonNull
    private String email;
    @NonNull
    private String username;
    @NonNull
    private char[] password;

}
