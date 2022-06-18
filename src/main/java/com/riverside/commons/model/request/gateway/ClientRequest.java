package com.riverside.commons.model.request.gateway;

import com.riverside.commons.model.request.RequestModel;
import lombok.Builder;
import lombok.Data;
import org.yaml.snakeyaml.util.UriEncoder;

@Data
@Builder
public class ClientRequest {
    private String email;
    private String sessionId;
    private String transactionId;
    private RequestModel request;
    private String URI;
    private String endpoint;
    private String requestType;
    private UriEncoder url;
}
