package com.riverside.commons.model.request.writing;

import com.riverside.commons.model.request.RequestModel;
import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateArticleRequestModel implements RequestModel {
    @NonNull String userId;
    @NonNull String articleId;
    @NonNull String text;
}
