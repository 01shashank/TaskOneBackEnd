package com.hexaware.task1backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.task1backend.Entity.User;
import com.hexaware.task1backend.Repository.userRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired private userRepository userRepo;
	
	@PostMapping("/user")
	public ResponseEntity<?> Login(@RequestBody User userObj) {
		try {
			User user  = userRepo.findByUsername(userObj.getUsername(), userObj.getPassword());
			if(user!=null) {
				return new ResponseEntity<>(user,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>("User not found",HttpStatus.NOT_FOUND);
			}
			
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
