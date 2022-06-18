package com.riverside.commons.model.dao.gateway;

import com.riverside.commons.model.dao.DocumentObject;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ServiceResponse extends DocumentObject {
    @Id
    private String transactionId;
    private String email;
    private String sessionId;
    private String response;
    private int httpStatus;

    @Builder
    public ServiceResponse(String userId, String email, String sessionId, String response, int httpStatus) {
        super(userId);

        this.email = email;
        this.sessionId = sessionId;
        this.response = response;
        this.httpStatus = httpStatus;
    }
}
