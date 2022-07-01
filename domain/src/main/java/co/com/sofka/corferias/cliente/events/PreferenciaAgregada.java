package co.com.sofka.corferias.cliente.events;

import co.com.sofka.corferias.cliente.values.PreferenciaId;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class PreferenciaAgregada extends DomainEvent {
    public PreferenciaAgregada(PreferenciaId preferenciaId, Descripcion descripcion) {
        super("sofka.com.co.cliente.preferenciaagregada");
    }
}
