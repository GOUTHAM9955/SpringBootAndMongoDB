package com.project.mongodb.JobListing.repository;

import java.util.List;

import com.project.mongodb.JobListing.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
