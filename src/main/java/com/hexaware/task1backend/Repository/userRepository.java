package com.hexaware.task1backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.task1backend.Entity.User;

@Repository
public interface userRepository extends JpaRepository<User,Integer>{
	
	@Query("select u from User u where u.username=?1 and u.password=?2")
	public User findByUsername(String username,String password);

}
