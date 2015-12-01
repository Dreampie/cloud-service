package cn.dreampie.service.video.provider;

import cn.dreampie.service.video.repository.VideoRepository;
import cn.dreampie.service.video.entity.VideoEntity;
import cn.dreampie.service.video.VideoService;
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
@RequestMapping("/videos")
public class VideoProvider implements VideoService {

  @Value("${endpoints.health.sensitive}")
  private boolean sensitive;

  @Autowired
  private VideoRepository videoRepository;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public VideoEntity getById(@PathVariable String id) {
    return videoRepository.findById(id);
  }

  @RequestMapping(value = "/t")
  public boolean getSensitive() {
    return sensitive;
  }
}
