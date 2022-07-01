package co.com.sofka.corferias.artista;

import co.com.sofka.corferias.artista.values.CancionId;
import co.com.sofka.domain.generic.Entity;

public class Cancion extends Entity<CancionId> {
    public Cancion(CancionId entityId) {
        super(entityId);
    }
}
