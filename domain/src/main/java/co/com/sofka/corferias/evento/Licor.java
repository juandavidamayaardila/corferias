package co.com.sofka.corferias.evento;

import co.com.sofka.corferias.evento.values.LicorId;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.domain.generic.Entity;

public class Licor extends Entity<LicorId> {

    protected Descripcion descripcion;
    protected LicorId licorId;

    public Licor(LicorId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
        this.licorId = entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public LicorId getLicorId() {
        return licorId;
    }
}
