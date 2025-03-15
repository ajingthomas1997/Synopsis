package com.trading.platform.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
