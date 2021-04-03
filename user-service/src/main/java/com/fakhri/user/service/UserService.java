package com.fakhri.user.service;

import com.fakhri.user.dto.ResponseTemplateDto;
import com.fakhri.user.entity.User;


public interface UserService {

    User saveUser(User user);
    ResponseTemplateDto getUserWithDepartment(Long userId);

}
