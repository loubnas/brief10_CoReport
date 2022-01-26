package com.bamcoreport.web.api.identity.controller;

import com.bamcoreport.web.api.identity.dto.model.UserDto;
import com.bamcoreport.web.api.identity.services.IUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api/identity/user")
@Api(tags = "Utilisateur", value = "Utilisateur Controller")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserService userService;

    @GetMapping("/")
    @ApiResponses({ @ApiResponse(code = 500, message = "Une erreur système s'est produite") })
    @ApiOperation(value = "", nickname = "Retourne la liste des utilisateurs", notes = "", tags = {})
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> userDto = userService.getUsers();
        return ResponseEntity.ok(userDto);
    }
}
