package com.bamcoreport.web.api.identity.services;

import com.bamcoreport.web.api.identity.dto.services.IMapClassWithDto;
import com.bamcoreport.web.api.identity.entities.User;
import com.bamcoreport.web.api.identity.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bamcoreport.web.api.identity.dto.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    IMapClassWithDto<User, UserDto> userMapping;

    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();
        return userMapping.convertListToListDto(users,UserDto.class);
    }
}

