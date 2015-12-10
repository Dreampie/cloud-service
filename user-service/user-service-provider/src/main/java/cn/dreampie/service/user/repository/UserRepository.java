package cn.dreampie.service.user.repository;

import cn.dreampie.service.user.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Dreampie on 15/11/22.
 */
public interface UserRepository extends MongoRepository<UserEntity, String> {
  UserEntity findById(String id);

  UserEntity save(UserEntity user);
}
