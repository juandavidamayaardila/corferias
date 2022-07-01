package co.com.sofka.corferias.evento.events;

import co.com.sofka.corferias.evento.values.EventoId;
import co.com.sofka.corferias.evento.values.NombreEvento;
import co.com.sofka.domain.generic.DomainEvent;

public class EventoCreado extends DomainEvent {
    public EventoCreado(EventoId entityId, NombreEvento nombreEvento) {
        super("co.com.sofka.eventocreado");
    }
}
