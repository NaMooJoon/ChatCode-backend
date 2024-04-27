/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.DefaultSchema;
import com.chatcode.jooq.Keys;
import com.chatcode.jooq.tables.Article.ArticlePath;
import com.chatcode.jooq.tables.Avatar.AvatarPath;
import com.chatcode.jooq.tables.records.ScrapRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Scrap extends TableImpl<ScrapRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>scrap</code>
     */
    public static final Scrap SCRAP = new Scrap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScrapRecord> getRecordType() {
        return ScrapRecord.class;
    }

    /**
     * The column <code>scrap.avatar_id</code>.
     */
    public final TableField<ScrapRecord, Long> AVATAR_ID = createField(DSL.name("avatar_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>scrap.article_id</code>.
     */
    public final TableField<ScrapRecord, Long> ARTICLE_ID = createField(DSL.name("article_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>scrap.version</code>.
     */
    public final TableField<ScrapRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>scrap.date_created</code>.
     */
    public final TableField<ScrapRecord, LocalDateTime> DATE_CREATED = createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private Scrap(Name alias, Table<ScrapRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Scrap(Name alias, Table<ScrapRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>scrap</code> table reference
     */
    public Scrap(String alias) {
        this(DSL.name(alias), SCRAP);
    }

    /**
     * Create an aliased <code>scrap</code> table reference
     */
    public Scrap(Name alias) {
        this(alias, SCRAP);
    }

    /**
     * Create a <code>scrap</code> table reference
     */
    public Scrap() {
        this(DSL.name("scrap"), null);
    }

    public <O extends Record> Scrap(Table<O> path, ForeignKey<O, ScrapRecord> childPath, InverseForeignKey<O, ScrapRecord> parentPath) {
        super(path, childPath, parentPath, SCRAP);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ScrapPath extends Scrap implements Path<ScrapRecord> {
        public <O extends Record> ScrapPath(Table<O> path, ForeignKey<O, ScrapRecord> childPath, InverseForeignKey<O, ScrapRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ScrapPath(Name alias, Table<ScrapRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ScrapPath as(String alias) {
            return new ScrapPath(DSL.name(alias), this);
        }

        @Override
        public ScrapPath as(Name alias) {
            return new ScrapPath(alias, this);
        }

        @Override
        public ScrapPath as(Table<?> alias) {
            return new ScrapPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ScrapRecord> getPrimaryKey() {
        return Keys.PK_SCRAP;
    }

    @Override
    public List<ForeignKey<ScrapRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_AVATAR_TO_SCRAP_1, Keys.FK_ARTICLE_TO_SCRAP_1);
    }

    private transient AvatarPath _avatar;

    /**
     * Get the implicit join path to the <code>PUBLIC.avatar</code> table.
     */
    public AvatarPath avatar() {
        if (_avatar == null)
            _avatar = new AvatarPath(this, Keys.FK_AVATAR_TO_SCRAP_1, null);

        return _avatar;
    }

    private transient ArticlePath _article;

    /**
     * Get the implicit join path to the <code>PUBLIC.article</code> table.
     */
    public ArticlePath article() {
        if (_article == null)
            _article = new ArticlePath(this, Keys.FK_ARTICLE_TO_SCRAP_1, null);

        return _article;
    }

    @Override
    public Scrap as(String alias) {
        return new Scrap(DSL.name(alias), this);
    }

    @Override
    public Scrap as(Name alias) {
        return new Scrap(alias, this);
    }

    @Override
    public Scrap as(Table<?> alias) {
        return new Scrap(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scrap rename(String name) {
        return new Scrap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scrap rename(Name name) {
        return new Scrap(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scrap rename(Table<?> name) {
        return new Scrap(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap where(Condition condition) {
        return new Scrap(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Scrap where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Scrap where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Scrap where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Scrap where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Scrap whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}