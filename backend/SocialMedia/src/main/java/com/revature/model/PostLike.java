package com.revature.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "post_likes")
@IdClass(PostLikeId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLike implements Serializable {
	
	@Id
	int profileId;
	@Id
	int postId;
}