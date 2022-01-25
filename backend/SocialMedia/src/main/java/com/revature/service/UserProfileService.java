package com.revature.service;

import java.util.Optional;

import com.revature.model.UserProfile;

public interface UserProfileService {

	Optional<UserProfile> findById(int id);

	UserProfile authenticate(String email, String password);

	UserProfile save(UserProfile user);
}