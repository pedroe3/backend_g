package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.PostEntities.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<MainCategory, Long> {
}
