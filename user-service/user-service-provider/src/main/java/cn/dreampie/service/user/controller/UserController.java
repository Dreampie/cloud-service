package cn.dreampie.service.user.controller;

import cn.dreampie.service.user.UserService;
import cn.dreampie.service.user.entity.UserEntity;
import cn.dreampie.service.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dreampie on 15/11/22.
 */
@RestController
public class UserController implements UserService {

  @Autowired
  private UserRepository userRepository;

  public UserEntity findById(@PathVariable String id) {
    return userRepository.findById(id);
  }

  public void deleteById(@PathVariable String id) {
    userRepository.delete(id);
  }

  public UserEntity save(@RequestBody UserEntity user) {
    return userRepository.save(user);
  }
}
