package co.com.sofka.corferias.artista.events;

import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {

    private final ArtistaId entityId;
    private final Nombre nombre;

    public NombreCambiado(ArtistaId entityId, Nombre nombre) {
        super("sofka.cliente.nombrecambiado");

        this.entityId =entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ArtistaId getEntityId() {
        return entityId;
    }
}