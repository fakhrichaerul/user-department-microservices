package com.fakhri.user.dto;

import com.fakhri.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDto {

    private User user;
    private Department department;
}
