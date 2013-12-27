package jp.projects.miya.google_guice_sample.component;

import jp.projects.miya.google_guice_sample.annotation.AopLogging;

/**
 * Class: SampleComponent
 *
 * @author masaya1507
 *
 */
public class SampleComponent implements IComponent {

	/**
	 *
	 */
	@AopLogging
	public void execute() {
		System.out.println("SampleObject.execute()");
	}
}
