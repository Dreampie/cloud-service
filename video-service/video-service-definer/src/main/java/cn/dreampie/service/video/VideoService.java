package cn.dreampie.service.video;

import cn.dreampie.service.video.entity.VideoEntity;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Dreampie on 15/11/22.
 */
@FeignClient("video-server-provider")
public interface VideoService {
  VideoEntity getById(String id);
}
