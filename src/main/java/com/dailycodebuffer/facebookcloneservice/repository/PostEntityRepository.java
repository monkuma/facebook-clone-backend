package com.dailycodebuffer.facebookcloneservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.facebookcloneservice.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String>{
    
}
