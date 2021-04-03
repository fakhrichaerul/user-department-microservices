package com.fakhri.user.service;

import com.fakhri.user.dto.Department;
import com.fakhri.user.dto.ResponseTemplateDto;
import com.fakhri.user.entity.User;
import com.fakhri.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    @Override
    public ResponseTemplateDto getUserWithDepartment(Long userId) {

        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateDto vo = new ResponseTemplateDto();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
                        , Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
