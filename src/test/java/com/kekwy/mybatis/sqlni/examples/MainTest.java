package com.kekwy.mybatis.sqlni.examples;

import com.kekwy.mybatis.sqlni.examples.mapper.EmployeeMapper;
import com.kekwy.mybatis.sqlni.examples.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 16:20
 */
public class MainTest {

    @Test
    public void log() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        System.out.println(mapper);
        System.out.println(mapper.getEmployeeByComplexCondition("正式工", Set.of("市场部_张三", "测试部_张三")));
    }

}