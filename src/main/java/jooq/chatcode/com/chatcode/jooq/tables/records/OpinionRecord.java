/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.records;


import com.chatcode.jooq.tables.Opinion;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpinionRecord extends UpdatableRecordImpl<OpinionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>opinion.id</code>.
     */
    public OpinionRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>opinion.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>opinion.content_id</code>.
     */
    public OpinionRecord setContentId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>opinion.content_id</code>.
     */
    public Long getContentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>opinion.author_id</code>.
     */
    public OpinionRecord setAuthorId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>opinion.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>opinion.version</code>.
     */
    public OpinionRecord setVersion(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>opinion.version</code>.
     */
    public Long getVersion() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>opinion.comment</code>.
     */
    public OpinionRecord setComment(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>opinion.comment</code>.
     */
    public String getComment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>opinion.date_created</code>.
     */
    public OpinionRecord setDateCreated(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>opinion.date_created</code>.
     */
    public LocalDateTime getDateCreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>opinion.last_updated</code>.
     */
    public OpinionRecord setLastUpdated(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>opinion.last_updated</code>.
     */
    public LocalDateTime getLastUpdated() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>opinion.like_count</code>.
     */
    public OpinionRecord setLikeCount(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>opinion.like_count</code>.
     */
    public Integer getLikeCount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>opinion.dislike_count</code>.
     */
    public OpinionRecord setDislikeCount(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>opinion.dislike_count</code>.
     */
    public Integer getDislikeCount() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpinionRecord
     */
    public OpinionRecord() {
        super(Opinion.OPINION);
    }

    /**
     * Create a detached, initialised OpinionRecord
     */
    public OpinionRecord(Long id, Long contentId, Long authorId, Long version, String comment, LocalDateTime dateCreated, LocalDateTime lastUpdated, Integer likeCount, Integer dislikeCount) {
        super(Opinion.OPINION);

        setId(id);
        setContentId(contentId);
        setAuthorId(authorId);
        setVersion(version);
        setComment(comment);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
        setLikeCount(likeCount);
        setDislikeCount(dislikeCount);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised OpinionRecord
     */
    public OpinionRecord(com.chatcode.jooq.tables.pojos.Opinion value) {
        super(Opinion.OPINION);

        if (value != null) {
            setId(value.getId());
            setContentId(value.getContentId());
            setAuthorId(value.getAuthorId());
            setVersion(value.getVersion());
            setComment(value.getComment());
            setDateCreated(value.getDateCreated());
            setLastUpdated(value.getLastUpdated());
            setLikeCount(value.getLikeCount());
            setDislikeCount(value.getDislikeCount());
            resetChangedOnNotNull();
        }
    }
}
