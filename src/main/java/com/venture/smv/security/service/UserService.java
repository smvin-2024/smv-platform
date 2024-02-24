package com.venture.smv.security.service;


import com.venture.smv.model.User;
import com.venture.smv.security.dto.AuthenticatedUserDto;
import com.venture.smv.security.dto.RegistrationRequest;
import com.venture.smv.security.dto.RegistrationResponse;

/**
 * Created on 2024
 *
 * @author utsav
 */
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
