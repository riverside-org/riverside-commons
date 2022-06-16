package com.riverside.commons.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class Book extends DocumentObject {
    @Id
    private String bookId;
    @NonNull
    private String title;
    @NonNull private String slug;
    @NonNull private String seriesId;
    private int sortOrder;
    @DBRef
    private Section rootSection;

    @Builder
    public Book(String userId, String title, String slug, String seriesId, int sortOrder) {
        super(userId);

        this.title = title;
        this.slug = slug;
        this.seriesId = seriesId;
        this.sortOrder = sortOrder;

    }
}
