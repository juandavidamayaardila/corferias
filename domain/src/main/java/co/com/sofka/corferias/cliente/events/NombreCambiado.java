package co.com.sofka.corferias.cliente.events;

import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {
    public NombreCambiado(ClienteId entityId, Nombre nombre) {
        super("sofka.cliente.nombrecambiado");
    }
}
