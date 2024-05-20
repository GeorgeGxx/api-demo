package com.georgegxx.apidemo.repositories;

import com.georgegxx.apidemo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
}
