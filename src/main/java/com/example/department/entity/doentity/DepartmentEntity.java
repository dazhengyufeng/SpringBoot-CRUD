package com.example.department.entity.doentity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@Entity
@Table(name = "department")
@Where(clause = "isdelete=false")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // 父级部门id
    private Integer parent_id;

    // 是否删除
    private Boolean isdelete;
}
