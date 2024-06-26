/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.records;


import com.chatcode.jooq.tables.Role;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>role.id</code>.
     */
    public RoleRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>role.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>role.version</code>.
     */
    public RoleRecord setVersion(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>role.version</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>role.authority</code>.
     */
    public RoleRecord setAuthority(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>role.authority</code>.
     */
    public String getAuthority() {
        return (String) get(2);
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
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(Long id, Long version, String authority) {
        super(Role.ROLE);

        setId(id);
        setVersion(version);
        setAuthority(authority);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(com.chatcode.jooq.tables.pojos.Role value) {
        super(Role.ROLE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setAuthority(value.getAuthority());
            resetChangedOnNotNull();
        }
    }
}
