package cn.dreampie.service.user;

import cn.dreampie.service.user.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Dreampie on 15/11/22.
 */
@FeignClient("user-server-provider")
public interface UserService {
  UserEntity getById(String id);
}
