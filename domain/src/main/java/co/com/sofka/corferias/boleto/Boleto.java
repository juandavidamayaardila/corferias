package co.com.sofka.corferias.boleto;

import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.boleto.events.BoletoCreado;
import co.com.sofka.corferias.boleto.values.BoletoId;
import co.com.sofka.corferias.boleto.values.Precio;
import co.com.sofka.corferias.boleto.values.Zona;
import co.com.sofka.corferias.evento.values.EventoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Boleto extends AggregateEvent<BoletoId> {

    protected BoletoId boletoId;
    protected Zona zona;
    protected Precio precio;
    protected EventoId eventoId;

    public Boleto(BoletoId boletoId) {

        super(boletoId);
        appendChange(new BoletoCreado(boletoId)).apply();
    }

}
