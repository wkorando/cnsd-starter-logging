package org.my.developer.logging;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingAutoConfig {

	@Bean
	@ConditionalOnProperty(value = "my-org.logging.endpoints")
	public ControllerLoggingAspect controllerLoggingAspect() {
		return new ControllerLoggingAspect();
	}
}
