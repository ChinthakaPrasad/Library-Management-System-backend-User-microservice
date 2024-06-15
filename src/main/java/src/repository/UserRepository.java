package src.repository;

import org.springframework.data.repository.CrudRepository;
import src.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, String> {

}
