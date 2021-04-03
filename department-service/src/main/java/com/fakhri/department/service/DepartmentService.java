package com.fakhri.department.service;

import com.fakhri.department.repository.DepartmentRepository;
import com.fakhri.department.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public  Department saveDepartment(Department department) {

        log.info("Inside saveDepartment of DepartmentRepository");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
