package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.PostEntities.PostImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostImagesRepository extends JpaRepository<PostImage, Long> {
}
