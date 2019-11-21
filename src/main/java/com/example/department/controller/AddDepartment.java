package com.example.department.controller;

import com.example.department.entity.dto.AddDepartmentDto;
import com.example.department.entity.vo.AddDepartmentVo;
import com.example.department.service.Impl.AddDepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/department")
public class AddDepartment {
    @Autowired
    private AddDepartmentServiceImpl addDepartmentService;

    @PostMapping("/addDepartment")
    public AddDepartmentVo addDepartment(@RequestBody AddDepartmentDto deptDto){
        return addDepartmentService.addDepartment(deptDto);
    }
}
