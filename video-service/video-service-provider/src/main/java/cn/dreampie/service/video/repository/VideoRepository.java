package cn.dreampie.service.video.repository;

import cn.dreampie.service.video.entity.VideoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Dreampie on 15/11/22.
 */
public interface VideoRepository extends MongoRepository<VideoEntity, String> {
  VideoEntity findById(String id);
}
