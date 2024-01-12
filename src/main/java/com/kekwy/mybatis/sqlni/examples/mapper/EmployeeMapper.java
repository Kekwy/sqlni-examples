package com.kekwy.mybatis.sqlni.examples.mapper;

import com.kekwy.mybatis.sqlni.UseSqlni;
import com.kekwy.mybatis.sqlni.examples.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 10:20
 */
@Mapper
public interface EmployeeMapper {

    @UseSqlni("""
            SELECT *
            FROM t_employee
            WHERE type = #{type}
            AND
            concat(department, '_', name) in #{departmentNameSet}
            """)
    List<Employee> getEmployeeByComplexCondition(
            @Param("type") String type,
            @Param("departmentNameSet") Set<String> departmentNameSet);

}