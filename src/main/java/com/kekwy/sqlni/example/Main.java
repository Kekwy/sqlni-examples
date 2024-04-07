package com.kekwy.sqlni.example;


import com.kekwy.sqlni.example.entity.Employee;
import com.kekwy.sqlni.example.entity.NestedTestObject;
import com.kekwy.sqlni.example.mapper.TestMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 18:25
 */
@SpringBootApplication
@MapperScan("com.kekwy.sqlni.example.mapper")
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Component
    public static class MyRunner implements CommandLineRunner {

        @Autowired
        TestMapper testMapper;

        @Override
        public void run(String... args) throws Exception {
//            System.out.println(testMapper);
//            ArrayList<NestedTestObject> list = new ArrayList<>();
//            list.add(new NestedTestObject(234234, "sadf"));
//            System.out.println(testMapper.selectById(1));
//            testMapper.insert(new Employee(234234, "asdf", "asdf", "sadfas"));
        }
    }

}
