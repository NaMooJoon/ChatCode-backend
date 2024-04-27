/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.DefaultSchema;
import com.chatcode.jooq.tables.records.ContentFileRecord;

import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContentFile extends TableImpl<ContentFileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>content_file</code>
     */
    public static final ContentFile CONTENT_FILE = new ContentFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContentFileRecord> getRecordType() {
        return ContentFileRecord.class;
    }

    /**
     * The column <code>content_file.content_files_id</code>.
     */
    public final TableField<ContentFileRecord, Long> CONTENT_FILES_ID = createField(DSL.name("content_files_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>content_file.file_id</code>.
     */
    public final TableField<ContentFileRecord, Long> FILE_ID = createField(DSL.name("file_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>content_file.Key</code>.
     */
    public final TableField<ContentFileRecord, String> KEY = createField(DSL.name("Key"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private ContentFile(Name alias, Table<ContentFileRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ContentFile(Name alias, Table<ContentFileRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>content_file</code> table reference
     */
    public ContentFile(String alias) {
        this(DSL.name(alias), CONTENT_FILE);
    }

    /**
     * Create an aliased <code>content_file</code> table reference
     */
    public ContentFile(Name alias) {
        this(alias, CONTENT_FILE);
    }

    /**
     * Create a <code>content_file</code> table reference
     */
    public ContentFile() {
        this(DSL.name("content_file"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public ContentFile as(String alias) {
        return new ContentFile(DSL.name(alias), this);
    }

    @Override
    public ContentFile as(Name alias) {
        return new ContentFile(alias, this);
    }

    @Override
    public ContentFile as(Table<?> alias) {
        return new ContentFile(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContentFile rename(String name) {
        return new ContentFile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContentFile rename(Name name) {
        return new ContentFile(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContentFile rename(Table<?> name) {
        return new ContentFile(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile where(Condition condition) {
        return new ContentFile(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ContentFile where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ContentFile where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ContentFile where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ContentFile where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ContentFile whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}