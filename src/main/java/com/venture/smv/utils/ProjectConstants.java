package com.venture.smv.utils;

import java.util.Locale;

/**
 * Created on 2024
 *
 * @author utsav
 */
public final class ProjectConstants {

	// FIXME : Customize project constants for your application.

	public static final String DEFAULT_ENCODING = "UTF-8";

	public static final Locale TURKISH_LOCALE = new Locale.Builder().setLanguage("tr").setRegion("TR").build();

	private ProjectConstants() {

		throw new UnsupportedOperationException();
	}

}
