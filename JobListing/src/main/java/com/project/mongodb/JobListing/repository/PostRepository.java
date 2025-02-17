package com.project.mongodb.JobListing.repository;

import com.project.mongodb.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
