package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.ItemEntities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Long> {
}
