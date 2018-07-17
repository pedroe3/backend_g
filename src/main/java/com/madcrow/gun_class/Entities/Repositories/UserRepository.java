package com.madcrow.gun_class.Entities.Repositories;

import com.madcrow.gun_class.Entities.UserEntities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
