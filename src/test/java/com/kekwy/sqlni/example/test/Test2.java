package com.kekwy.sqlni.example.test;


import com.kekwy.sqlni.example.entity.Employee;
import com.kekwy.sqlni.example.entity.NestedTestObject;
import com.kekwy.sqlni.example.mapper.TestMapper;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
@MapperScan("com.kekwy.sqlni.example.mapper")
public class Test2 {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testMapper() {
//        ArrayList<NestedTestObject> list = new ArrayList<>();
//        list.add(new NestedTestObject(234234, "sadf"));
//        testMapper.insert(new Employee(234234, "asdf", "asdf", "sadfas", list));
    }

}
