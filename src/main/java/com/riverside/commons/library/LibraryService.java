package com.riverside.commons.library;

import com.riverside.commons.model.dao.DocumentEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Log4j2
public class LibraryService<T extends DocumentEntity> {

    private final Class<T> clazz;
    private final MongoTemplate mt;

    public LibraryService(Class<T> cls, MongoTemplate mt) {
        this.clazz = cls;
        this.mt = mt;
    }

    public boolean save(T t) {
        log.info("Saving: {}", t);

        try {
            t.setLastUpdatedAt();
            mt.save(t);
            return true;
        } catch (Exception e) {
            log.error("Exception while saving new universe", e);
        }

        return false;
    }

    public T findByField(String field, String value) {
        log.info("Finding {} : {}", field, value);

        Query query = new Query();
        query.addCriteria(Criteria.where(field).is(value));

        return mt.findOne(query, clazz);
    }

    public List<T> findAllByField(String field, String value) {
        log.info("Finding all {} : {}", field, value);

        Query query = new Query();
        query.addCriteria(Criteria.where(field).is(value));

        return mt.find(query, clazz);
    }

    public void delete(T t) {
        mt.remove(t);
    }

    public List<T> findLikeSlug(String slug) {
        log.info("Finding all like slug name {}", slug);

        Query query = new Query();
        query.addCriteria(Criteria.where("slug").regex("^" + slug));

        return mt.find(query, clazz);
    }

    public List<T> findAllByUserId(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));

        return mt.find(query, clazz);
    }

    public boolean deleteBySlug(String slug) {
        Query query = new Query();
        query.addCriteria(Criteria.where("slug").is(slug));

        try {
            mt.remove(query, clazz);
            return true;
        } catch (Exception e) {
            log.error("Exception while deleting: ", e);
        }

        return false;
    }
}
