package com.kekwy.sqlni.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.List;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 16:31
 */

@Data
@TableName("t_employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @TableId
    private Integer eid;

//    @NonNull
    private String department;

//    @NonNull
    private String name;

//    @NonNull
    private String type;

//    @NonNull
//    private List<NestedTestObject> testObjects;
}
