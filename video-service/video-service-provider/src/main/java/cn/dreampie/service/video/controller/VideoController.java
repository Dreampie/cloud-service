package cn.dreampie.service.video.controller;

import cn.dreampie.service.video.VideoService;
import cn.dreampie.service.video.entity.VideoEntity;
import cn.dreampie.service.video.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dreampie on 15/11/22.
 */
@RestController
public class VideoController implements VideoService {

  @Autowired
  private VideoRepository videoRepository;

  public VideoEntity getById(@PathVariable String id) {
    return videoRepository.findById(id);
  }

}
