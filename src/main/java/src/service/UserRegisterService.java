package src.service;

import src.dto.UserDto;
import src.entity.UserRegisterEntity;

import java.util.List;

public interface UserRegisterService {
    public boolean saveRegisteredUser(UserDto userDto);
    public boolean saveToUser(String studentId);
    public boolean deleteRegisteredUser(String studentId);
    public List<UserDto> getAll();

}
