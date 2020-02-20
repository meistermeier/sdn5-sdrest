package com.meistermeier.sdnrest.user;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author Gerrit Meier
 */
public interface UserRepository extends Neo4jRepository<User, Long>, CustomUserRepository {

	List<User> findByFirstName(String name);
}
