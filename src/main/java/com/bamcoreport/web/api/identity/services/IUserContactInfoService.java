package com.bamcoreport.web.api.identity.services;

import com.bamcoreport.web.api.identity.dto.model.UserContactInfoDto;

import java.util.List;

public interface IUserContactInfoService {

    List<UserContactInfoDto> getUsersContactInfo();
}
