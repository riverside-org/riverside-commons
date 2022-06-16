package com.riverside.commons.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Collections;
import java.util.List;

@Data
public class Series extends DocumentObject {
    @Id
    private String seriesId;
    @NonNull
    private String title;
    @NonNull private String slug;
    @NonNull private String universeId;
    @DBRef
    private List<Book> books;

    @Builder
    public Series(String userId, String universeId, String title, String slug) {
        super(userId);

        this.universeId = universeId;
        this.title = title;
        this.slug = slug;
        this.books = Collections.emptyList();
    }
}
