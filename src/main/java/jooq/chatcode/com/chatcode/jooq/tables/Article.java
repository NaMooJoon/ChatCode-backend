/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.DefaultSchema;
import com.chatcode.jooq.Keys;
import com.chatcode.jooq.tables.Avatar.AvatarPath;
import com.chatcode.jooq.tables.Scrap.ScrapPath;
import com.chatcode.jooq.tables.records.ArticleRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Article extends TableImpl<ArticleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>article</code>
     */
    public static final Article ARTICLE = new Article();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticleRecord> getRecordType() {
        return ArticleRecord.class;
    }

    /**
     * The column <code>article.id</code>.
     */
    public final TableField<ArticleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>article.version</code>.
     */
    public final TableField<ArticleRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>article.author_id</code>.
     */
    public final TableField<ArticleRecord, Long> AUTHOR_ID = createField(DSL.name("author_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>article.completed</code>.
     */
    public final TableField<ArticleRecord, Boolean> COMPLETED = createField(DSL.name("completed"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>article.content_id</code>.
     */
    public final TableField<ArticleRecord, Long> CONTENT_ID = createField(DSL.name("content_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>article.create_ip</code>.
     */
    public final TableField<ArticleRecord, String> CREATE_IP = createField(DSL.name("create_ip"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>article.date_created</code>.
     */
    public final TableField<ArticleRecord, LocalDateTime> DATE_CREATED = createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>article.enabled</code>.
     */
    public final TableField<ArticleRecord, Boolean> ENABLED = createField(DSL.name("enabled"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>article.last_editor_id</code>.
     */
    public final TableField<ArticleRecord, Long> LAST_EDITOR_ID = createField(DSL.name("last_editor_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>article.last_updated</code>.
     */
    public final TableField<ArticleRecord, LocalDateTime> LAST_UPDATED = createField(DSL.name("last_updated"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>article.note_count</code>.
     */
    public final TableField<ArticleRecord, Integer> NOTE_COUNT = createField(DSL.name("note_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.scrap_count</code>.
     */
    public final TableField<ArticleRecord, Integer> SCRAP_COUNT = createField(DSL.name("scrap_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.selected_note_id</code>.
     */
    public final TableField<ArticleRecord, Long> SELECTED_NOTE_ID = createField(DSL.name("selected_note_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>article.tag_string</code>.
     */
    public final TableField<ArticleRecord, String> TAG_STRING = createField(DSL.name("tag_string"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>article.title</code>.
     */
    public final TableField<ArticleRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>article.view_count</code>.
     */
    public final TableField<ArticleRecord, Integer> VIEW_COUNT = createField(DSL.name("view_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.like_count</code>.
     */
    public final TableField<ArticleRecord, Integer> LIKE_COUNT = createField(DSL.name("like_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.dislike_count</code>.
     */
    public final TableField<ArticleRecord, Integer> DISLIKE_COUNT = createField(DSL.name("dislike_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.category_id</code>.
     */
    public final TableField<ArticleRecord, String> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Article(Name alias, Table<ArticleRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Article(Name alias, Table<ArticleRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>article</code> table reference
     */
    public Article(String alias) {
        this(DSL.name(alias), ARTICLE);
    }

    /**
     * Create an aliased <code>article</code> table reference
     */
    public Article(Name alias) {
        this(alias, ARTICLE);
    }

    /**
     * Create a <code>article</code> table reference
     */
    public Article() {
        this(DSL.name("article"), null);
    }

    public <O extends Record> Article(Table<O> path, ForeignKey<O, ArticleRecord> childPath, InverseForeignKey<O, ArticleRecord> parentPath) {
        super(path, childPath, parentPath, ARTICLE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ArticlePath extends Article implements Path<ArticleRecord> {
        public <O extends Record> ArticlePath(Table<O> path, ForeignKey<O, ArticleRecord> childPath, InverseForeignKey<O, ArticleRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ArticlePath(Name alias, Table<ArticleRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ArticlePath as(String alias) {
            return new ArticlePath(DSL.name(alias), this);
        }

        @Override
        public ArticlePath as(Name alias) {
            return new ArticlePath(alias, this);
        }

        @Override
        public ArticlePath as(Table<?> alias) {
            return new ArticlePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<ArticleRecord, Long> getIdentity() {
        return (Identity<ArticleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ArticleRecord> getPrimaryKey() {
        return Keys.PK_ARTICLE;
    }

    private transient ScrapPath _scrap;

    /**
     * Get the implicit to-many join path to the <code>PUBLIC.scrap</code> table
     */
    public ScrapPath scrap() {
        if (_scrap == null)
            _scrap = new ScrapPath(this, null, Keys.FK_ARTICLE_TO_SCRAP_1.getInverseKey());

        return _scrap;
    }

    /**
     * Get the implicit many-to-many join path to the <code>PUBLIC.avatar</code>
     * table
     */
    public AvatarPath avatar() {
        return scrap().avatar();
    }

    @Override
    public Article as(String alias) {
        return new Article(DSL.name(alias), this);
    }

    @Override
    public Article as(Name alias) {
        return new Article(alias, this);
    }

    @Override
    public Article as(Table<?> alias) {
        return new Article(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Article rename(String name) {
        return new Article(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Article rename(Name name) {
        return new Article(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Article rename(Table<?> name) {
        return new Article(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article where(Condition condition) {
        return new Article(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Article where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Article where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Article where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Article where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Article whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
