package com.venture.smv.repository;

import com.venture.smv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2024
 *
 * @author utsav
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
