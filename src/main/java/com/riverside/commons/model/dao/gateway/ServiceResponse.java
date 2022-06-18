package com.riverside.commons.model.dao.gateway;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ServiceResponse {
    @Id
    private String transactionId;
    private String email;
    private String sessionId;
    private String response;
    private int httpStatus;
}
