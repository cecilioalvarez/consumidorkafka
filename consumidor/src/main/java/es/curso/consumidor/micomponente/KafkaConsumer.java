package es.curso.consumidor.micomponente;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "examen-events", groupId = "grupo1")

	// Method
	public void consume(String message) {
		// Print statement
		System.out.println("el mensaje es  = " + message);
	}
}
