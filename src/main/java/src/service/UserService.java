package src.service;

import src.dto.UserDto;
import src.entity.UserEntity;

import java.util.List;

public interface UserService {
    public boolean saveUser(UserDto userDto);
    public boolean deleteUser(String studentId);
    public boolean updateUser(UserDto userDto);
    public List<UserDto> getUserList();
}
