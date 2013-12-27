package jp.projects.miya.google_guice_sample;

import jp.projects.miya.google_guice_sample.module.GuiceModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Class: App
 *
 */
public class App {
	/**
	 * Entroy Point
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new GuiceModule());

		GuiceModule module = injector.getInstance(GuiceModule.class);

		module.getComponent().execute();
	}
}
