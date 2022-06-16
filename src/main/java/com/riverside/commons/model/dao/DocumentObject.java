package com.riverside.commons.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DocumentObject implements DocumentEntity {
    private String userId;
    private boolean isPublic;
    private Date createdAt;
    private Date updatedAt;

    public DocumentObject(String userId) {
        this.userId = userId;
        this.isPublic = false;
        this.createdAt = new Date();
    }
    @Override
    public void setLastUpdatedAt() {
        this.updatedAt = new Date();
    }
}
