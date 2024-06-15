package src.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import src.dto.UserDto;
import src.entity.UserEntity;
import src.entity.UserRegisterEntity;
import src.repository.UserRegisterRepository;
import src.repository.UserRepository;
import src.service.UserRegisterService;
import src.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
    private ModelMapper modelMapper;

    @Autowired
    UserRegisterRepository userRegisterRepository;

    @Autowired
    UserService userService;

    @Bean
    void createMapper(){
        this.modelMapper = new ModelMapper();
    }
    @Override
    public boolean saveRegisteredUser(UserDto userDto) {
        UserRegisterEntity userRegister = modelMapper.map(userDto, UserRegisterEntity.class);
        userRegisterRepository.save(userRegister);
        return true;
    }

    @Override
    public boolean saveToUser(String studentId) {
        UserRegisterEntity userRegisterEntity = userRegisterRepository.findById(studentId).get();
        UserDto userDto = modelMapper.map(userRegisterEntity, UserDto.class);
        userService.saveUser(userDto);
        return true;
    }

    @Override
    public boolean deleteRegisteredUser(String studentId) {
        userRegisterRepository.deleteById(studentId);
        return true;
    }

    @Override
    public List<UserDto> getAll() {
        List<UserRegisterEntity> userRegisterEntityList = (List<UserRegisterEntity>) userRegisterRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for(UserRegisterEntity userRegisterEntity: userRegisterEntityList){
            userDtoList.add(modelMapper.map(userRegisterEntity, UserDto.class));
        }
        return userDtoList;
    }
}
