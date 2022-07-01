package co.com.sofka.corferias.evento.events;

import co.com.sofka.corferias.evento.values.LicorId;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class LicorAgregado extends DomainEvent {
    public LicorAgregado(LicorId licorId, Descripcion descripcion) {
        super("co.com.sofka.licoragreado");
    }
}
