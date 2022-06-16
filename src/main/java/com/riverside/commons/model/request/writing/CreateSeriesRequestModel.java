package com.riverside.commons.model.request.writing;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateSeriesRequestModel {
    @NonNull
    private String userId;
    @NonNull private String title;
}
