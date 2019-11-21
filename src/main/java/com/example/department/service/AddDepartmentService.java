package com.example.department.service;

import com.example.department.entity.dto.AddDepartmentDto;
import com.example.department.entity.vo.AddDepartmentVo;
import org.springframework.stereotype.Service;


public interface AddDepartmentService {
    AddDepartmentVo addDepartment(AddDepartmentDto addDepartmentDto);
}
