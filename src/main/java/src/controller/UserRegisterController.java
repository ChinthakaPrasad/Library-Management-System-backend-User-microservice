package src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import src.dto.UserDto;
import src.entity.UserRegisterEntity;
import src.service.UserRegisterService;

import java.util.List;

@CrossOrigin
@RestController("/register")
public class UserRegisterController {

    @Autowired
    UserRegisterService userRegisterService;

    @PostMapping("/addUser")
    public boolean addRegisterUser(UserDto userDto){
        return userRegisterService.saveRegisteredUser(userDto);
    }

    @DeleteMapping("/deleteUser/{studentId}")
    public boolean deleteRegisterUser(@PathVariable String studentId){
        return userRegisterService.deleteRegisteredUser(studentId);
    }

    @GetMapping("/getAll")
    public List<UserDto> getAllRegisterUser(){
        return userRegisterService.getAll();
    }
}
