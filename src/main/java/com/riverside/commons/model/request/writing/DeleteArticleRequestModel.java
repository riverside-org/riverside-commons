package com.riverside.commons.model.request.writing;

import com.riverside.commons.model.request.RequestModel;
import lombok.Data;
import lombok.NonNull;

@Data
public class DeleteArticleRequestModel implements RequestModel {
    @NonNull
    private String userId;
    @NonNull private String articleId;
}
