package co.com.sofka.corferias.compra;

import co.com.sofka.corferias.boleto.Boleto;
import co.com.sofka.corferias.cliente.Cliente;
import co.com.sofka.corferias.compra.values.CompraId;
import co.com.sofka.corferias.compra.values.Fecha;
import co.com.sofka.corferias.evento.Evento;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Compra extends AggregateEvent<CompraId> {

    protected Fecha fecha;

    protected Evento evento;

    protected Cliente cliente;

    protected Set<Boleto> listaBoleto;

    public Compra(CompraId entityId) {
        super(entityId);
    }
}
