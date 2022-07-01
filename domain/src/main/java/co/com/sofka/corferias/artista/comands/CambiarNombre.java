package co.com.sofka.corferias.artista.comands;

import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class CambiarNombre extends Command {

    private final ArtistaId entityId;
    private final Nombre nombre;

    public CambiarNombre(ArtistaId entityId, Nombre nombre){
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ArtistaId getEntityId() {
        return entityId;
    }
}
