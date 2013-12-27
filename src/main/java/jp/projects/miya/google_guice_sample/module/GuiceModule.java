package jp.projects.miya.google_guice_sample.module;

import jp.projects.miya.google_guice_sample.annotation.AopLogging;
import jp.projects.miya.google_guice_sample.component.IComponent;
import jp.projects.miya.google_guice_sample.component.SampleComponent;
import jp.projects.miya.google_guice_sample.interceptor.LoggingInterceptor;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.matcher.Matchers;

/**
 * Class: GuiceModule
 *
 * @author masaya1507
 *
 */
public class GuiceModule extends AbstractModule {

	/**
	 *
	 */
	@Inject
	private IComponent component;

	/**
	 *
	 * @return
	 */
	public IComponent getComponent() {
		return component;
	}

	/**
	 *
	 * @param component
	 */
	public void setComponent(IComponent component) {
		this.component = component;
	}

	/**
	 *
	 */
	@Override
	protected void configure() {
		bind(IComponent.class).to(SampleComponent.class);

        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AopLogging.class), new LoggingInterceptor());
	}
}
