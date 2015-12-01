package cn.dreampie.service.user.provider;

import cn.dreampie.service.user.UserService;
import cn.dreampie.service.user.entity.UserEntity;
import cn.dreampie.service.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dreampie on 15/11/22.
 */
@RefreshScope
@RestController
@RequestMapping("/users")
public class UserProvider implements UserService {

  @Value("${endpoints.health.sensitive}")
  private boolean sensitive;

  @Autowired
  private UserRepository userRepository;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public UserEntity getById(@PathVariable String id) {
    return userRepository.findById(id);
  }

  @RequestMapping(value = "/t")
  public boolean getSensitive() {
    return sensitive;
  }
}
