package com.kekwy.sqlni.example;

import com.kekwy.sqlni.example.entity.Employee;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import javax.lang.model.element.TypeElement;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeHandlerDemo implements TypeHandler<Employee> {
    @Override
    public void setParameter(PreparedStatement ps, int i, Employee parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Employee getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public Employee getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Employee getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
