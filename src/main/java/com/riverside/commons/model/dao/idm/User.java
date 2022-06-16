package com.riverside.commons.model.dao.idm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@Builder
public class User {
    @Id
    private String userId;

    private String email;
    private String username;
    private String salt;
    private String pword;

    private Date createdAt;

}
