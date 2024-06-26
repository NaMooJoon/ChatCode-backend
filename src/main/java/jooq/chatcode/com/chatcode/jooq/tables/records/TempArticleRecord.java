/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.records;


import com.chatcode.jooq.tables.TempArticle;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TempArticleRecord extends UpdatableRecordImpl<TempArticleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>temp_article.id</code>.
     */
    public TempArticleRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>temp_article.avatar_id</code>.
     */
    public TempArticleRecord setAvatarId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.avatar_id</code>.
     */
    public Long getAvatarId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>temp_article.title</code>.
     */
    public TempArticleRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>temp_article.content</code>.
     */
    public TempArticleRecord setContent(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>temp_article.date_last_saved</code>.
     */
    public TempArticleRecord setDateLastSaved(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.date_last_saved</code>.
     */
    public LocalDateTime getDateLastSaved() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>temp_article.status</code>.
     */
    public TempArticleRecord setStatus(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>temp_article.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(5);
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
     * Create a detached TempArticleRecord
     */
    public TempArticleRecord() {
        super(TempArticle.TEMP_ARTICLE);
    }

    /**
     * Create a detached, initialised TempArticleRecord
     */
    public TempArticleRecord(Long id, Long avatarId, String title, String content, LocalDateTime dateLastSaved, Integer status) {
        super(TempArticle.TEMP_ARTICLE);

        setId(id);
        setAvatarId(avatarId);
        setTitle(title);
        setContent(content);
        setDateLastSaved(dateLastSaved);
        setStatus(status);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TempArticleRecord
     */
    public TempArticleRecord(com.chatcode.jooq.tables.pojos.TempArticle value) {
        super(TempArticle.TEMP_ARTICLE);

        if (value != null) {
            setId(value.getId());
            setAvatarId(value.getAvatarId());
            setTitle(value.getTitle());
            setContent(value.getContent());
            setDateLastSaved(value.getDateLastSaved());
            setStatus(value.getStatus());
            resetChangedOnNotNull();
        }
    }
}
