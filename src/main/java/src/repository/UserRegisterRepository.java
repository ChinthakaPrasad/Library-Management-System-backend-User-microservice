package src.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.entity.UserRegisterEntity;


public interface UserRegisterRepository extends CrudRepository<UserRegisterEntity, String> {
}
