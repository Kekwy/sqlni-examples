package com.kekwy.sqlni.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kekwy.sqlni.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface TestMapper extends BaseMapper<Employee> {

    String getTypeString();

}
