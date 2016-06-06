package com.my.project.repository;

import java.util.List;

import com.my.project.entity.User;

public interface UserRepository extends BaseRepository<User, Long> {
	List<User> findByLastname(String lastname);
}
