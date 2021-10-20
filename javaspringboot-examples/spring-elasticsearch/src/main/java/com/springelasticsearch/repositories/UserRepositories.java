package com.springelasticsearch.repositories;

import com.springelasticsearch.entity.User;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 11:09 AM
 **/
@Repository
public interface UserRepositories extends ElasticsearchRepository<User, String> {
	@Query("{\"bool\":{\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
	List<User> getByCustomQuery(String search);

	List<User> findByNameLikeOrSurnameLike(String name, String surname);
}
