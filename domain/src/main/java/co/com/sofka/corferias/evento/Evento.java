package co.com.sofka.corferias.evento;

import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.evento.events.EventoCreado;
import co.com.sofka.corferias.evento.events.LicorAgregado;
import co.com.sofka.corferias.evento.values.*;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.corferias.salon.values.SalonId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Evento extends AggregateEvent<EventoId> {

    protected NombreEvento nombreEvento;
    protected Duracion duracion;
    protected TipoEvento tipoEvento;
    protected List<Licor> licorList;
    protected SalonId salonId;
    protected List<Comida> comidaList;
    protected Fecha fecha;


    public Evento(EventoId entityId, NombreEvento nombreEvento) {
        super(entityId);
        this.nombreEvento = nombreEvento;
        appendChange(new EventoCreado(entityId, nombreEvento)).apply();
        subscribe(new EventoChange(this));
    }

    public void agregarlicorEvento(LicorId licorId, Descripcion descripcion){
        appendChange(new LicorAgregado(licorId, descripcion));
    }


}
