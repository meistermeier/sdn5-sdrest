package com.meistermeier.sdnrest.user;

import static org.neo4j.ogm.cypher.ComparisonOperator.*;

import java.util.Collection;

import org.neo4j.ogm.cypher.Filter;
import org.neo4j.ogm.session.SessionFactory;

/**
 * @author Gerrit Meier
 */
public class CustomUserRepositoryImpl implements CustomUserRepository {

	private final SessionFactory sessionFactory;

	public CustomUserRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Collection<User> findByEverything(String... values) {
		return sessionFactory.openSession().loadAll(User.class,
			new Filter("firstName", EQUALS, values[0]));
	}
}
