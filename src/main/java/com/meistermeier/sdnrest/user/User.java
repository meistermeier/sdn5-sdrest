package com.meistermeier.sdnrest.user;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author Gerrit Meier
 */
@NodeEntity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;

	private String lastName;

	private String nickname;

	public User(String firstName, String lastName, String nickname) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickname = nickname;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickname() {
		return nickname;
	}
}
