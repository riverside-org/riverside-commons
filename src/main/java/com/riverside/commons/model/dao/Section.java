package com.riverside.commons.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public class Section extends DocumentObject {
    @Id
    private String sectionId;
    @NonNull
    private String title;
    @NonNull private String bookId;
    @DBRef
    private List<Section> childSections;
    private String parentSectionId;
    private Boolean containsSections;
    @NonNull private int sortOrder;
    @DBRef private List<Article> articles;

    @Builder
    public Section(String userId, String title, String bookId, String parentSectionId,
                   Boolean containsSections, int sortOrder) {
        super(userId);

        this.title = title;
        this.bookId = bookId;
        this.parentSectionId = parentSectionId;
        this.containsSections = containsSections;
        this.sortOrder = sortOrder;
    }
}
