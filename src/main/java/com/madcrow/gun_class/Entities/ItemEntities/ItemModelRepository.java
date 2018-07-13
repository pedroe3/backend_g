package com.madcrow.gun_class.Entities.ItemEntities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemModelRepository extends JpaRepository<ItemModel, Long> {
}
