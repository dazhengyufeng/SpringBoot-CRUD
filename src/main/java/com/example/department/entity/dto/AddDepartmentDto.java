package com.example.department.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("新增部门")
public class AddDepartmentDto {
    // 上级部门id
    @ApiModelProperty("上级部门id")
    private Integer parentId;
    // 部门名称
    @ApiModelProperty("部门名称")
    private String name;
}
