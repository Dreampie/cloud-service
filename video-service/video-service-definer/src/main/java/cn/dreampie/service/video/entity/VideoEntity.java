package cn.dreampie.service.video.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Dreampie on 15/11/22.
 */
@Data
public class VideoEntity {
  @Id
  private String id;

  private String title;
}
