package co.com.sofka.corferias.artista.comands;

import co.com.sofka.corferias.artista.values.Email;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.artista.values.Telefono;
import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.domain.generic.Command;

public class CrearArtista extends Command {

    private final ArtistaId entityId;
    private final Nombre nombre;
    private final Email email;
    private final Telefono telefono;

    public CrearArtista(ArtistaId entityId, Nombre nombre, Email email, Telefono telefono){
        this.entityId = entityId;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public ArtistaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }
}
