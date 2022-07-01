package co.com.sofka.corferias.boleto.events;

import co.com.sofka.corferias.boleto.values.BoletoId;
import co.com.sofka.domain.generic.DomainEvent;

public class BoletoCreado extends DomainEvent {
    public BoletoCreado(BoletoId boletoId) {
        super("co.com.sofka.boletocreado");
    }
}
