package com.riverside.commons.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Collections;
import java.util.List;

@Data
public class Universe extends DocumentObject {
    @Id
    private String universeId;
    @NonNull
    private String title;
    @NonNull private String slug;
    @NonNull private String description;
    @DBRef
    private List<Series> series;

    @Builder
    public Universe(String universeId, String title, String slug, String userId, String description) {
        super(userId);

        this.universeId = universeId;
        this.title = title;
        this.slug = slug;
        this.description = description;

        this.series = Collections.emptyList();
    }
}
