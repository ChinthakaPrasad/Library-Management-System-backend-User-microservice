package src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import src.dto.UserDto;
import src.service.UserRegisterService;
import src.service.UserService;

import java.util.List;

@CrossOrigin
@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("addUser")
    public boolean saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PostMapping("UpdateUser")
    public boolean updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("deleteUser/{studentId}")
    public boolean deleteUser(@PathVariable String studentId){
        return userService.deleteUser(studentId);
    }

    @GetMapping("/getAllUser")
    public List<UserDto> getAllUser(){
        return userService.getUserList();
    }

}
