package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.PostEntities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
