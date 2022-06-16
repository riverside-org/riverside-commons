package com.riverside.commons.model.request.writing;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateUniverseRequestModel {
    @NonNull
    private String userId;
    @NonNull private String title;
    @NonNull private String description;
}
