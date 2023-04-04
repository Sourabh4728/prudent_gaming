package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Serializable>{

	
	public User save(User user);
	
	@Query(value = "Select * from user_details u where clientid=?1",nativeQuery = true)
	public List<User> findByClientId(Integer Id);

	@Query(value = "Select * from user_details u where game=?1",nativeQuery = true)
	public List<User> getUserByGame(String game);
	
	@Query(value = "Select * from user_details u where date=?1",nativeQuery = true)
	public List<User> getUserByDate(String date);

}
