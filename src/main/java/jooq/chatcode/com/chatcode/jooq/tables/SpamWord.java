/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.DefaultSchema;
import com.chatcode.jooq.Keys;
import com.chatcode.jooq.tables.records.SpamWordRecord;

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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpamWord extends TableImpl<SpamWordRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>spam_word</code>
     */
    public static final SpamWord SPAM_WORD = new SpamWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpamWordRecord> getRecordType() {
        return SpamWordRecord.class;
    }

    /**
     * The column <code>spam_word.id</code>.
     */
    public final TableField<SpamWordRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>spam_word.version</code>.
     */
    public final TableField<SpamWordRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>spam_word.text</code>.
     */
    public final TableField<SpamWordRecord, String> TEXT = createField(DSL.name("text"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private SpamWord(Name alias, Table<SpamWordRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private SpamWord(Name alias, Table<SpamWordRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>spam_word</code> table reference
     */
    public SpamWord(String alias) {
        this(DSL.name(alias), SPAM_WORD);
    }

    /**
     * Create an aliased <code>spam_word</code> table reference
     */
    public SpamWord(Name alias) {
        this(alias, SPAM_WORD);
    }

    /**
     * Create a <code>spam_word</code> table reference
     */
    public SpamWord() {
        this(DSL.name("spam_word"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<SpamWordRecord> getPrimaryKey() {
        return Keys.PK_SPAM_WORD;
    }

    @Override
    public SpamWord as(String alias) {
        return new SpamWord(DSL.name(alias), this);
    }

    @Override
    public SpamWord as(Name alias) {
        return new SpamWord(alias, this);
    }

    @Override
    public SpamWord as(Table<?> alias) {
        return new SpamWord(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpamWord rename(String name) {
        return new SpamWord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpamWord rename(Name name) {
        return new SpamWord(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpamWord rename(Table<?> name) {
        return new SpamWord(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord where(Condition condition) {
        return new SpamWord(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SpamWord where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SpamWord where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SpamWord where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SpamWord where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SpamWord whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
