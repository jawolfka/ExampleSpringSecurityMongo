package com.jw.ui.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jw.ui.models.ERole;
import com.jw.ui.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
