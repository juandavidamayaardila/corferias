package co.com.sofka.corferias.cliente;

import co.com.sofka.corferias.cliente.values.PreferenciaId;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.domain.generic.Entity;

public class Preferencia  extends Entity<PreferenciaId> {
    private Descripcion descripcion;
    private PreferenciaId preferenciaId;

    public Preferencia(PreferenciaId entityId, Descripcion descripcion) {

        super(entityId);
        this.descripcion = descripcion;
        this.preferenciaId = entityId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public PreferenciaId getPreferenciaId() {
        return preferenciaId;
    }
}
