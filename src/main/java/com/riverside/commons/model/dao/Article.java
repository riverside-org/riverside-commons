package com.riverside.commons.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
public class Article extends DocumentObject {
    @Id
    private String articleId;
    @NonNull
    private String title;
    private String text;
    private int articleOrder;
    @NonNull private String sectionId;

    @Builder
    public Article(String userId, String title, int articleOrder, String sectionId) {
        super(userId);

        this.title = title;
        this.articleOrder = articleOrder;
        this.sectionId = sectionId;

        this.text = "";
    }
}
