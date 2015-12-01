package cn.dreampie.service.user.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Dreampie on 15/11/22.
 */
@Data
public class UserEntity {
  @Id
  private String id;

  private String username;
}
