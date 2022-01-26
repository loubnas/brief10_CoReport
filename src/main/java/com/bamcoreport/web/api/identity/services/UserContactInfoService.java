package com.bamcoreport.web.api.identity.services;

import com.bamcoreport.web.api.identity.dto.model.UserContactInfoDto;
import com.bamcoreport.web.api.identity.dto.model.UserDto;
import com.bamcoreport.web.api.identity.dto.services.IMapClassWithDto;
import com.bamcoreport.web.api.identity.entities.User;
import com.bamcoreport.web.api.identity.entities.UserContactInfo;
import com.bamcoreport.web.api.identity.repositories.UserContactInfoRepository;
import com.bamcoreport.web.api.identity.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserContactInfoService implements IUserContactInfoService{

    private static final Logger log = LoggerFactory.getLogger(UserContactInfoService.class);

    @Autowired
    UserContactInfoRepository userContactInfoRepository;

    @Autowired
    IMapClassWithDto<UserContactInfo, UserContactInfoDto> userMapping;

    @Override
    public List<UserContactInfoDto> getUsersContactInfo() {
        List<UserContactInfo> userContactInfos = userContactInfoRepository.findAll();
        return userMapping.convertListToListDto(userContactInfos,UserContactInfoDto.class);
    }
}
