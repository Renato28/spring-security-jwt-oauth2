package io.github.renatonobrega.springsecurity.repository;

import io.github.renatonobrega.springsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}
