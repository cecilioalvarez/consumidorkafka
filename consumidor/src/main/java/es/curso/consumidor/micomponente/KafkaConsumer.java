package es.curso.consumidor.micomponente;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import es.curso.cola.Examen;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "examen-events", groupId = "grupo1",containerFactory="examenListener")
	public void consume(Examen examen) {
		// Print statement
		System.out.println("el mensaje es  = " + examen.getTexto()+ examen.getNota() );
	}
}
