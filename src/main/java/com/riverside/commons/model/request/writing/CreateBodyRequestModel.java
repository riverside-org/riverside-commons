package com.riverside.commons.model.request.writing;

import com.riverside.commons.model.request.RequestModel;
import lombok.Data;
import lombok.NonNull;

@Data
public class CreateBodyRequestModel implements RequestModel {
    @NonNull
    private String userId;
    @NonNull private String sectionId;
    @NonNull private String title;
}
