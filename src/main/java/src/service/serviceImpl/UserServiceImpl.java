package src.service.serviceImpl;

import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import src.dto.UserDto;
import src.entity.UserEntity;
import src.repository.UserRepository;
import src.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private ModelMapper modelMapper;

    @Bean
    void createModelMapper(){
        this.modelMapper = new ModelMapper();
    }

    @Override
    public boolean saveUser(UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        userRepository.save(userEntity);
        return true;
    }

    @Override
    public boolean deleteUser(String studentId) {
        userRepository.deleteById(studentId);
        return true;
    }

    @Override
    public boolean updateUser(UserDto userDto) {
        UserEntity newUser = modelMapper.map(userDto, UserEntity.class);
        UserEntity oldUser = userRepository.findById(newUser.getStudentId()).get();
        oldUser.setUserName(newUser.getUserName());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setCountry(newUser.getCountry());
        oldUser.setPNumber(newUser.getPNumber());
        userRepository.save(oldUser);
        return true;
    }

    @Override
    public List<UserDto> getUserList() {
        List<UserEntity> userEntityList = (List<UserEntity>) userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for(UserEntity userEntity: userEntityList){
            userDtoList.add(modelMapper.map(userEntity, UserDto.class));
        }
        return userDtoList;
    }
}
