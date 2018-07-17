package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.ItemEntities.ItemDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDescriptionRepository extends JpaRepository<ItemDescription, Long> {
}
