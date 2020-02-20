package com.meistermeier.sdnrest.user;

import java.util.Collection;

/**
 * @author Gerrit Meier
 */
public interface CustomUserRepository {

	Collection<User> findByEverything(String... values);
}
