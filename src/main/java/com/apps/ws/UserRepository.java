package com.apps.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apps.ws.io.entity.UserEntity;

@Repository
//CrudRepository: Spring Data JPA
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);
}
