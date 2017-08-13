/*
 * This file is generated by jOOQ.
*/
package ru.highloadcup.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.highloadcup.generated.DefaultSchema;
import ru.highloadcup.generated.Keys;
import ru.highloadcup.generated.tables.records.LocationRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Location extends TableImpl<LocationRecord> {

    private static final long serialVersionUID = 444044078;

    /**
     * The reference instance of <code>LOCATION</code>
     */
    public static final Location LOCATION = new Location();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationRecord> getRecordType() {
        return LocationRecord.class;
    }

    /**
     * The column <code>LOCATION.ID</code>.
     */
    public final TableField<LocationRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>LOCATION.PLACE</code>.
     */
    public final TableField<LocationRecord, String> PLACE = createField("PLACE", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>LOCATION.COUNTRY</code>.
     */
    public final TableField<LocationRecord, String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>LOCATION.CITY</code>.
     */
    public final TableField<LocationRecord, String> CITY = createField("CITY", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>LOCATION.DISTANCE</code>.
     */
    public final TableField<LocationRecord, Integer> DISTANCE = createField("DISTANCE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>LOCATION</code> table reference
     */
    public Location() {
        this("LOCATION", null);
    }

    /**
     * Create an aliased <code>LOCATION</code> table reference
     */
    public Location(String alias) {
        this(alias, LOCATION);
    }

    private Location(String alias, Table<LocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Location(String alias, Table<LocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationRecord> getPrimaryKey() {
        return Keys.PK_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationRecord>>asList(Keys.PK_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Location as(String alias) {
        return new Location(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Location rename(String name) {
        return new Location(name, null);
    }
}
