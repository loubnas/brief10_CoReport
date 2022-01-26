package com.bamcoreport.web.api.identity.controller;

import com.bamcoreport.web.api.identity.dto.model.UserContactInfoDto;
import com.bamcoreport.web.api.identity.dto.model.UserDto;
import com.bamcoreport.web.api.identity.services.IUserContactInfoService;
import com.bamcoreport.web.api.identity.services.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/identity/contactdata")
@Api(tags = "Utilisateur contact info", value = "Utilisateur contact info Controller")
public class UserContactInfoController {

    private static final Logger log = LoggerFactory.getLogger(UserContactInfoController.class);

    @Autowired
    IUserContactInfoService userContactInfoService;

    @GetMapping("/")
    @ApiResponses({ @ApiResponse(code = 500, message = "Une erreur système s'est produite") })
    @ApiOperation(value = "", nickname = "Retourne la liste des informations de contact des utilisateurs", notes = "", tags = {})
    public ResponseEntity<List<UserContactInfoDto>> getAllUsers(){
        List<UserContactInfoDto> userContactInfoDto = userContactInfoService.getUsersContactInfo();
        return ResponseEntity.ok(userContactInfoDto);
    }
}