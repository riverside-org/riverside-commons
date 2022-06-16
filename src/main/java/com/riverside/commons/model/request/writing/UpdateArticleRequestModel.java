package com.riverside.commons.model.request.writing;

import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateArticleRequestModel {
    @NonNull String userId;
    @NonNull String articleId;
    @NonNull String text;
}
