/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.records;


import com.chatcode.jooq.tables.AvatarInterestTag;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AvatarInterestTagRecord extends TableRecordImpl<AvatarInterestTagRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>avatar_interest_tag.avtar_id</code>.
     */
    public AvatarInterestTagRecord setAvtarId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>avatar_interest_tag.avtar_id</code>.
     */
    public Long getAvtarId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>avatar_interest_tag.name</code>.
     */
    public AvatarInterestTagRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>avatar_interest_tag.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AvatarInterestTagRecord
     */
    public AvatarInterestTagRecord() {
        super(AvatarInterestTag.AVATAR_INTEREST_TAG);
    }

    /**
     * Create a detached, initialised AvatarInterestTagRecord
     */
    public AvatarInterestTagRecord(Long avtarId, String name) {
        super(AvatarInterestTag.AVATAR_INTEREST_TAG);

        setAvtarId(avtarId);
        setName(name);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AvatarInterestTagRecord
     */
    public AvatarInterestTagRecord(com.chatcode.jooq.tables.pojos.AvatarInterestTag value) {
        super(AvatarInterestTag.AVATAR_INTEREST_TAG);

        if (value != null) {
            setAvtarId(value.getAvtarId());
            setName(value.getName());
            resetChangedOnNotNull();
        }
    }
}
