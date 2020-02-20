package com.meistermeier.sdnrest.user;

import org.springframework.data.rest.core.config.Projection;

/**
 * @author Gerrit Meier
 */
@Projection(name = "nicks", types = User.class)
public interface JustNickname {

	String getNickname();
}
