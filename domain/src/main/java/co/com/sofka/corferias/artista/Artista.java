package co.com.sofka.corferias.artista;

import co.com.sofka.corferias.artista.events.ArtistaCreado;
import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.artista.values.Email;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.artista.values.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

/**
 * Agregado Root, el cual tiene objetos de valor
 */
public class Artista extends AggregateEvent<ArtistaId> {

    protected Nombre nombre;
    protected Email email;
    protected Telefono telefono;

    protected List<Cancion> canciones;

    protected Orquesta orquesta;

    public Artista(ArtistaId entityId, Nombre nombre, Email email, Telefono telefono) {
        super(entityId);
        appendChange(new ArtistaCreado(nombre, email, telefono));
    }

    private Artista(ArtistaId entityId){
        super(entityId);
        subscribe(new ArtistaChange(this));
    }

    public static Artista from(ArtistaId entityId, List<DomainEvent> eventsBy){
        var artista = new Artista(entityId);
        eventsBy.forEach(artista::applyEvent);
        return artista;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }
}
