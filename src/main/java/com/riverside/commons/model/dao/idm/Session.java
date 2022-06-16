package com.riverside.commons.model.dao.idm;

import com.riverside.commons.enums.SessionType;
import com.riverside.commons.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Session {
    @Id
    private String sessionId;
    private String email;
    private Status status;
    private SessionType sessionType;
    private Date timeCreated;
    private Date lastUsed;
    private Date expireTime;
}
