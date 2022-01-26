package com.bamcoreport.web.api.identity.services;

import com.bamcoreport.web.api.identity.dto.model.UserDto;

import java.util.List;

public interface IUserService {

    List<UserDto> getUsers();
}
