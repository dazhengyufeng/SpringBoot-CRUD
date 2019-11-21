package com.example.department.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel
public class AddDepartmentVo {
    private Integer id;
    private String name;
}
