package com.riverside.commons.model.request.writing;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateBodyRequestModel {
    @NonNull
    private String userId;
    @NonNull private String sectionId;
    @NonNull private String title;
}
