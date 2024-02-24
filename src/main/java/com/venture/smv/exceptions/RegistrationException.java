package com.venture.smv.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created on 2024
 *
 * @author utsav
 */
@Getter
@RequiredArgsConstructor
public class RegistrationException extends RuntimeException {

	private final String errorMessage;

}
