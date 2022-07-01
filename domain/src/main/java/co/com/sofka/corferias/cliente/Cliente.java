package co.com.sofka.corferias.cliente;


import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.artista.values.Email;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.artista.values.Telefono;
import co.com.sofka.corferias.cliente.events.ClienteCreado;
import co.com.sofka.corferias.cliente.events.NombreCambiado;
import co.com.sofka.corferias.cliente.events.PreferenciaAgregada;
import co.com.sofka.corferias.cliente.values.ClienteId;
import co.com.sofka.corferias.cliente.values.Domicilio;
import co.com.sofka.corferias.cliente.values.PreferenciaId;
import co.com.sofka.corferias.salon.values.Descripcion;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Cliente extends AggregateEvent<ArtistaId> {

    protected ClienteId clienteId;
    protected Telefono telefono;
    protected Nombre nombre;
    protected Email email;
    protected Domicilio domicilio;
    protected List<Preferencia> preferenciaList;

    public Cliente(ArtistaId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
        appendChange(new ClienteCreado(nombre));
        subscribe(new ClienteChange(this));
    }

    public void cambiarNombre(ClienteId entityId, Nombre nombre) {
        appendChange(new NombreCambiado(entityId, nombre)).apply();
    }

    public void agregarPreferencias(PreferenciaId preferenciaId, Descripcion descripcion){
        appendChange(new PreferenciaAgregada(preferenciaId, descripcion));
    }

}
