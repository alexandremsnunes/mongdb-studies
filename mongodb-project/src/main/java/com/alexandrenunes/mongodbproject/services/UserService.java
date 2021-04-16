package com.alexandrenunes.mongodbproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandrenunes.mongodbproject.domain.User;
import com.alexandrenunes.mongodbproject.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
