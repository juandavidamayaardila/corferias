package co.com.sofka.corferias.artista.events;

import co.com.sofka.corferias.artista.values.Email;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.artista.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class ArtistaCreado extends DomainEvent {

    protected Nombre nombre;
    protected Email email;
    protected Telefono telefono;


    public ArtistaCreado(Nombre nombre, Email email, Telefono telefono){
        super("sofka.cliente.clientecreado");
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Email getEmail() {
        return email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
