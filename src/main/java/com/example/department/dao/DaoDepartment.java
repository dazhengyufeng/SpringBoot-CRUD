package com.example.department.dao;

import com.example.department.entity.doentity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoDepartment extends JpaRepository<DepartmentEntity,Integer>, JpaSpecificationExecutor<DepartmentEntity> {
    // 通过名字查找
    DepartmentEntity findByName(String name);

}
