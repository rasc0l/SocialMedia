package com.revature.service;


import java.util.List;

import com.revature.model.PostComment;
import com.revature.model.PostLike;
import com.revature.model.UserPost;
import com.revature.model.UserProfile;


public interface UserPostService {

	int getPostLikes(Integer postId);
	
	UserPost createPost(UserProfile user, UserPost post);
	
	PostLike createLike(Integer profileId, Integer postId);

	List<UserPost> findAllPostsDesc();

	//Added by LuisR
	List<UserPost> findUserPostsDesc(Integer author);
	
	PostComment createComment(UserProfile user, PostComment comment);
}