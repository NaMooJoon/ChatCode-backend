/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.records;


import com.chatcode.jooq.tables.AreaDistrictCode;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AreaDistrictCodeRecord extends UpdatableRecordImpl<AreaDistrictCodeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>area_district_code.id</code>.
     */
    public AreaDistrictCodeRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>area_district_code.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>area_district_code.version</code>.
     */
    public AreaDistrictCodeRecord setVersion(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>area_district_code.version</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>area_district_code.area_city_code_id</code>.
     */
    public AreaDistrictCodeRecord setAreaCityCodeId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>area_district_code.area_city_code_id</code>.
     */
    public String getAreaCityCodeId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>area_district_code.name</code>.
     */
    public AreaDistrictCodeRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>area_district_code.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AreaDistrictCodeRecord
     */
    public AreaDistrictCodeRecord() {
        super(AreaDistrictCode.AREA_DISTRICT_CODE);
    }

    /**
     * Create a detached, initialised AreaDistrictCodeRecord
     */
    public AreaDistrictCodeRecord(String id, Long version, String areaCityCodeId, String name) {
        super(AreaDistrictCode.AREA_DISTRICT_CODE);

        setId(id);
        setVersion(version);
        setAreaCityCodeId(areaCityCodeId);
        setName(name);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AreaDistrictCodeRecord
     */
    public AreaDistrictCodeRecord(com.chatcode.jooq.tables.pojos.AreaDistrictCode value) {
        super(AreaDistrictCode.AREA_DISTRICT_CODE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setAreaCityCodeId(value.getAreaCityCodeId());
            setName(value.getName());
            resetChangedOnNotNull();
        }
    }
}
