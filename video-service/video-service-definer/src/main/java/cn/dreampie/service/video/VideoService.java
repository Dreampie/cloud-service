package cn.dreampie.service.video;

import cn.dreampie.service.video.entity.VideoEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dreampie on 15/11/22.
 */
@FeignClient("video-service-provider")
public interface VideoService {

  @RequestMapping(value = VideoConstants.VIDEOS_ID_PATH, method = RequestMethod.GET)
  VideoEntity getById(@PathVariable("id") String id);
}
