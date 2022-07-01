package co.com.sofka.corferias.cliente.events;

import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
    public ClienteCreado(Nombre nombre) {
        super("sofka.corferias.clientecreado" );
    }
}
