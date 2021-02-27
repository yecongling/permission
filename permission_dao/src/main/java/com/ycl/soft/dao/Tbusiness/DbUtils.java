package com.ycl.soft.dao.Tbusiness;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * @ClassName DbUtils
 * @Description 数据库操作工具
 * @Author wonderland
 * @Date 2020/11/17 22:36
 * @Version 1.0
 **/
public class DbUtils {

    /**
     * 数据库连接池对象
     */
    private static DataSource dataSource;

    /**
     * 数据库连接
     */
    private static Connection conn;

    static {
        try {
            // 读取配置文件中的配置
            InputStream stream = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(stream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = getConnection();
        } catch (Exception e) {
            throw new RuntimeException("加载数据库配置文件出错，请检查配置是否完善！");
        }
    }
    /**
     * 获取连接
     *
     * @return 数据库连接
     * @throws SQLException SQL异常
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    /**
     * 获取数据库连接池对象
     * @return 连接池对象
     */
    public static DataSource getDataSource() {
        return dataSource;
    }
    /**
     * 释放数据库资源
     *
     * @param rs 结果集
     * @param sta 编译对象
     * @param conn 连接
     */
    public static void close(ResultSet rs, Statement sta, Connection conn) {
        if (null != rs) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != sta) {
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != conn) {
            try {
                conn.close();       // 归还数据库连接对象
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 释放数据库连接资源
     * @param sta /
     * @param conn /
     */
    public static void close(Statement sta, Connection conn) {
        close(null, sta, conn);
    }

    /**
     * 数据库查询方法（返回list集合）
     * @param sql 查询SQL
     * @param queryCondition 查询的条件
     * @return
     */
    public static List<Map<String, Object>> executeQuery(String sql, List<Object> queryCondition) throws Exception{
        if (conn == null) {
            conn = getConnection();
        }
        PreparedStatement ps = null;
        List<Map<String, Object>> result = new ArrayList<>();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0, len = queryCondition.size(); i < len; i++) {
                ps.setObject(i + 1, queryCondition.get(i));
            }
            ResultSet rs = ps.executeQuery();
            result = getResultMap(rs);

        } catch (SQLException e) {
            throw new SQLException("SQL:错误" + e.getSQLState());
        }
        return result;
    }


    /**
     * 数据库查询方法（返回结果集）
     * @param sql 查询SQL
     * @param queryCondition 查询的条件
     * @param opr 操作员
     * @return 结果集
     */
    public static ResultSet executeQuery(String sql, List<Object> queryCondition, Object opr) throws Exception{
        if (conn == null) {
            conn = getConnection();
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0, len = queryCondition.size(); i < len; i++) {
                ps.setObject(i + 1, queryCondition.get(i));
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            throw new SQLException("SQL:错误" + e.getSQLState());
        }
        return rs;
    }

    /**
     * 解析结果集
     * @param rs 结果集
     * @return
     * @throws Exception
     */
    public static List<Map<String, Object>> getResultMap(ResultSet rs) throws Exception {
        List<Map<String, Object>> result = new ArrayList<>();
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            Map<String, Object> resultMap = new LinkedHashMap<>();
            for (int i = 0; i < columnCount; i++) {
                String column = metaData.getColumnLabel(i);
                String columnValue = rs.getString(column);
                resultMap.put(column, columnValue);
            }
            result.add(resultMap);
        }
        return result;
    }
}
