package cn.dreampie.service.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Dreampie on 15/11/22.
 */
@EnableDiscoveryClient
@EnableMongoRepositories
@SpringBootApplication
@ComponentScan(basePackages = {"cn.dreampie.service"})
public class VideoServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(VideoServiceApplication.class, args);
  }
}
