/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.DefaultSchema;
import com.chatcode.jooq.Keys;
import com.chatcode.jooq.tables.records.OauthidRecord;

import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
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
public class Oauthid extends TableImpl<OauthidRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>oauthid</code>
     */
    public static final Oauthid OAUTHID = new Oauthid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthidRecord> getRecordType() {
        return OauthidRecord.class;
    }

    /**
     * The column <code>oauthid.id</code>.
     */
    public final TableField<OauthidRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>oauthid.user_id</code>.
     */
    public final TableField<OauthidRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>oauthid.version</code>.
     */
    public final TableField<OauthidRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>oauthid.access_token</code>.
     */
    public final TableField<OauthidRecord, String> ACCESS_TOKEN = createField(DSL.name("access_token"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>oauthid.provider</code>.
     */
    public final TableField<OauthidRecord, String> PROVIDER = createField(DSL.name("provider"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Oauthid(Name alias, Table<OauthidRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Oauthid(Name alias, Table<OauthidRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>oauthid</code> table reference
     */
    public Oauthid(String alias) {
        this(DSL.name(alias), OAUTHID);
    }

    /**
     * Create an aliased <code>oauthid</code> table reference
     */
    public Oauthid(Name alias) {
        this(alias, OAUTHID);
    }

    /**
     * Create a <code>oauthid</code> table reference
     */
    public Oauthid() {
        this(DSL.name("oauthid"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<OauthidRecord, Long> getIdentity() {
        return (Identity<OauthidRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OauthidRecord> getPrimaryKey() {
        return Keys.PK_OAUTHID;
    }

    @Override
    public Oauthid as(String alias) {
        return new Oauthid(DSL.name(alias), this);
    }

    @Override
    public Oauthid as(Name alias) {
        return new Oauthid(alias, this);
    }

    @Override
    public Oauthid as(Table<?> alias) {
        return new Oauthid(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Oauthid rename(String name) {
        return new Oauthid(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Oauthid rename(Name name) {
        return new Oauthid(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Oauthid rename(Table<?> name) {
        return new Oauthid(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid where(Condition condition) {
        return new Oauthid(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Oauthid where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Oauthid where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Oauthid where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Oauthid where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Oauthid whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
