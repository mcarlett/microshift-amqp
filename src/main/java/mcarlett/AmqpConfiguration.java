package mcarlett;

import org.apache.qpid.jms.JmsConnectionFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.jms.ConnectionFactory;

@Configuration
public class AmqpConfiguration {

	@Bean
	public ConnectionFactory connectionFactory(@Value("${amqp.broker-url}")String remoteUrl) {
		return new JmsConnectionFactory(remoteUrl);
	}
}
