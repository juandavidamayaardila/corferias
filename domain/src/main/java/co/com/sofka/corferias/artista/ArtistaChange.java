package co.com.sofka.corferias.artista;

import co.com.sofka.corferias.artista.events.ArtistaCreado;
import co.com.sofka.corferias.artista.events.NombreCambiado;
import co.com.sofka.domain.generic.EventChange;

public class ArtistaChange extends EventChange {
    public ArtistaChange(Artista artista) {

        apply((ArtistaCreado events) ->{
            artista.nombre = events.getNombre();
            artista.email = events.getEmail();
            artista.telefono = events.getTelefono();
        });

        apply((NombreCambiado event) ->{
            artista.nombre = event.getNombre();
        });
    }
}
