package com.demo.repository;


import java.sql.SQLException;
import java.util.List;
/**
 * @author longshiwei
 * @date 2023/04/17 14:19
 **/
public interface CommonRepository<T, P> {

    /**
     * Create table if not exist.
     *
     * @throws SQLException SQL exception
     */
    void createTableIfNotExists() throws SQLException;

    /**
     * Drop table.
     *
     * @throws SQLException SQL exception
     */
    void dropTable() throws SQLException;

    /**
     * Truncate table.
     *
     * @throws SQLException SQL exception
     */
    void truncateTable() throws SQLException;

    /**
     * insert data.
     *
     * @param entity entity
     * @return generated primary key
     * @throws SQLException SQL exception
     */
    P insert(T entity) throws SQLException;

    /**
     * Delete data.
     *
     * @param primaryKey primaryKey
     * @throws SQLException SQL exception
     */
    void delete(P primaryKey) throws SQLException;

    /**
     * Select all data.
     *
     * @return all data
     * @throws SQLException SQL exception
     */
    List<T> selectAll() throws SQLException;
}