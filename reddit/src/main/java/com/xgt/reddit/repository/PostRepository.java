package com.xgt.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xgt.reddit.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
