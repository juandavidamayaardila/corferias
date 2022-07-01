package co.com.sofka.corferias.evento;

import co.com.sofka.corferias.evento.values.ComidaId;
import co.com.sofka.domain.generic.Entity;

public class Comida extends Entity<ComidaId> {
    public Comida(ComidaId entityId) {
        super(entityId);
    }
}
