package com.example.department.service.Impl;

import com.example.department.dao.DaoDepartment;
import com.example.department.entity.doentity.DepartmentEntity;
import com.example.department.entity.dto.AddDepartmentDto;
import com.example.department.entity.vo.AddDepartmentVo;
import com.example.department.service.AddDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddDepartmentServiceImpl implements AddDepartmentService {
    @Autowired
    private DaoDepartment daoDepartment;

    // 添加人员数据转换成VO
    private AddDepartmentVo transitionName(DepartmentEntity depEntity){
        AddDepartmentVo addDptVo = new AddDepartmentVo();
        addDptVo.setId(depEntity.getId());
        addDptVo.setName(depEntity.getName());
        return addDptVo;
    }

    // 新增部门
    @Override
    public AddDepartmentVo addDepartment(AddDepartmentDto addDepartmentDto){
        // 判断名字是否存在
        DepartmentEntity dName = daoDepartment.findByName(addDepartmentDto.getName());
        if(dName != null) return null;

        // 如果有上级id , 判断上级id是否存在
        if(addDepartmentDto.getParentId() != null){
            Optional<DepartmentEntity> id = daoDepartment.findById(addDepartmentDto.getParentId());
            if(addDepartmentDto.getParentId() == 0 || id.get().getId() != null){
                // 实例数据保存实体对象
                DepartmentEntity depEntity = new DepartmentEntity();
                depEntity.setName(addDepartmentDto.getName());
                depEntity.setIsdelete(false);
                depEntity.setParent_id(addDepartmentDto.getParentId());

                // 保存
                DepartmentEntity save = daoDepartment.save(depEntity);
                // 格式转换
                return transitionName(save);
            }else {
                return null;
            }
        }else{
            return null;
        }
    }
}
