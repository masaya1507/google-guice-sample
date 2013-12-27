package jp.projects.miya.google_guice_sample.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Class: LoggingInterceptor
 *
 * @author masaya1507
 *
 */
public class LoggingInterceptor implements MethodInterceptor {

	/**
	 *
	 */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before proceed");

        Object result = invocation.proceed();

        System.out.println("after proceed");

        return result;
    }
}
