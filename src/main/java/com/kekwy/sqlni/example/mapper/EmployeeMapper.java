package com.kekwy.sqlni.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kekwy.sqlni.example.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 10:20
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    //    @UseSQLNI("""
//            SELECT *
//            FROM t_employee;
//            """)
    List<Employee> getEmployees();


    /**
     * 阿萨德产地发货
     *
     * @param name sadfads
     * @return sdafasdfasd
     */
    @Results(
            id = "23423",
            value = {
                    @Result(id = true, property = "eid", column = "eid", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
                    @Result(property = "department", column = "department", javaType = String.class, jdbcType = JdbcType.VARCHAR),
                    @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
                    @Result(property = "type", column = "type", javaType = String.class, jdbcType = JdbcType.VARCHAR)
            }
    )
    Employee getEmployeeByName(String name);

    @SuppressWarnings("SqlNoDataSourceInspection")
    @Select("""
            SELECT [#{paramSet}]
            FROM t_employee
            WHERE department = 'temp'
            """)
    String getTypeByNameAndDepartment();

//    @UseSQLNI("SELECT * FROM t_employee LIMIT 2 OFFSET 4;")

    @SuppressWarnings("SqlNoDataSourceInspection")
    @Select("""
            SELECT *
            FROM t_employee
            WHERE deparment IS NOT NULL
            """)
    List<Employee> getEmployeesWithLimit(int asdfasd, int dsafasdf, String asdfasds);

//    List<Employee> selectByName(String name);

//    @UseSQLNI("""
//            SELECT * FROM t_employee
//            WHERE department IN {#{departmentSet}};
//            """)
//    List<Employee> getEmployeeWhoseDepartmentInSet(@Param("departmentSet") Set<String> departmentSet);
//
//    @UseSQLNI("""
//            SELECT * FROM t_employee
//            WHERE concat(department, '_', name) IN [#{departmentNameSet}];
//            """)
//    List<Employee> getEmployeesWhoseDepartmentAndNameInSet(@Param("departmentNameSet") Set<String> departmentNameSet);
//
//    @UseSQLNI("""
//            SELECT *
//            FROM t_employee
//            ORDER BY name;
//            """)
//    List<Employee> getEmployeesSorted();
//
//    @UseSQLNI("""
//            SELECT *
//            FROM t_employee
//            ORDER BY id, #{name}, [#{nameSet}];
//            """)
//    List<Employee> getEmployeesTest1();
//
//
//    @UseSQLNI("""
//            SELECT type, name
//            FROM t_employee
//            WHERE type = '正式员工' AND salary BETWEEN 2 AND 4;
//            """)
//    List<Employee> getEmployeesTest2();
//
//    @UseSQLNI("""
//            SELECT type, name AS n
//            FROM t_employee AS e
//            WHERE type = '正式员工' AND salary BETWEEN 2 AND 4 OR type IS NULL;
//            """)
//    List<Employee> getEmployeesTest3();
//
//    @UseSQLNI("""
//            SELECT item1, #{paramCol}
//            FROM t_table
//            WHERE NOT (NOT col1 = n1 AND col2 = n2) AND (col2 = n3 OR col3 = n3) AND col4 IN [#{paramSet}];
//            """)
//    List<Employee> getEmployeesTest4();
//
//    @UseSQLNI("""
//            SELECT item1, #{paramCol}
//            FROM t_table
//            WHERE NOT (col4 IN [#{paramSet}] OR NOT col1 = n1 AND col2 = n2) AND (col2 = n3 OR col3 = n3) AND col4 IN [#{paramSet}];
//            """)
//    List<Employee> getEmployeesTest5();
//
//
//    @UseSQLNI("""
//            SELECT item1,
//            if(startTerm != null && startTerm != '' && endTerm != null && endTerm != '') {
//                for (item : paramCol) {
//                    #{item.name}
//                }
//            }
//            FROM t_table
//            WHERE NOT (col4 IN [#{paramSet}] OR NOT col1 = n1 AND col2 = n2) AND (col2 = n3 OR col3 = n3) AND col4 IN [#{paramSet}];
//            """)
//    List<Employee> getEmployeesTest6();
//
//
//    @UseSQLNI("""
//            SELECT name, department
//            FROM t_employee
//            WHERE department IN [#{departmentSet}];
//            """)
//    List<Employee> getEmployeesTest7(@Param("departmentSet") Set<String> departmentSet);


}
