package cn.dreampie.service.user;

import cn.dreampie.service.user.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Dreampie on 15/11/22.
 */
@FeignClient("user-service-provider")
public interface UserService {

  @RequestMapping(value = UserConstants.USERS_ID_PATH, method = RequestMethod.GET)
  UserEntity findById(@PathVariable("id") String id);

  @RequestMapping(value = UserConstants.USERS_PATH, method = RequestMethod.POST)
  UserEntity save(@RequestParam("user") UserEntity user);
}
