/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables;


import com.chatcode.jooq.Chatcode;
import com.chatcode.jooq.tables.records.UserRoleRecord;

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
public class UserRole extends TableImpl<UserRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>CHATCODE.user_role</code>
     */
    public static final UserRole USER_ROLE = new UserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleRecord> getRecordType() {
        return UserRoleRecord.class;
    }

    /**
     * The column <code>CHATCODE.user_role.user_id</code>.
     */
    public final TableField<UserRoleRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>CHATCODE.user_role.role_id</code>.
     */
    public final TableField<UserRoleRecord, Long> ROLE_ID = createField(DSL.name("role_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private UserRole(Name alias, Table<UserRoleRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>CHATCODE.user_role</code> table reference
     */
    public UserRole(String alias) {
        this(DSL.name(alias), USER_ROLE);
    }

    /**
     * Create an aliased <code>CHATCODE.user_role</code> table reference
     */
    public UserRole(Name alias) {
        this(alias, USER_ROLE);
    }

    /**
     * Create a <code>CHATCODE.user_role</code> table reference
     */
    public UserRole() {
        this(DSL.name("user_role"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Chatcode.CHATCODE;
    }

    @Override
    public UserRole as(String alias) {
        return new UserRole(DSL.name(alias), this);
    }

    @Override
    public UserRole as(Name alias) {
        return new UserRole(alias, this);
    }

    @Override
    public UserRole as(Table<?> alias) {
        return new UserRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(String name) {
        return new UserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(Name name) {
        return new UserRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(Table<?> name) {
        return new UserRole(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole where(Condition condition) {
        return new UserRole(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public UserRole where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public UserRole where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public UserRole where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public UserRole where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public UserRole whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
