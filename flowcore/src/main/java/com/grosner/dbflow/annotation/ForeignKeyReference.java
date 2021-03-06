package com.grosner.dbflow.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author: andrewgrosner
 * Description: Used inside of {@link com.grosner.dbflow.annotation.Column#references()}, describes the
 * local column name, type, and referencing table column name. Note: the type of the local column must match the
 * column type of the referenced column. By using a field as a Model object, we will ensure the same types are used. In future
 * versions I hope to remove the columnType and directly use the foreign column's type.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface ForeignKeyReference {

    /**
     * @return The local column name that will be referenced in the DB
     */
    String columnName();

    /**
     * Needs to match both tables!
     *
     * @return The type of columns between tables
     */
    Class<?> columnType();

    /**
     * @return The column name in the referenced table
     */
    String foreignColumnName();
}
