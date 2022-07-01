package co.com.sofka.corferias.artista;

import co.com.sofka.corferias.artista.events.ArtistaCreado;
import co.com.sofka.corferias.artista.events.NombreCambiado;
import co.com.sofka.domain.generic.EventChange;


/**
 * Se aplica los cambios a la entidad root
 * basandos en eventos.
 */
public class ArtistaChange extends EventChange {
    public ArtistaChange(Artista artista) {

        apply((ArtistaCreado events) ->{
            artista.nombre = events.getNombre();
            artista.email = events.getEmail();
            artista.telefono = events.getTelefono();
        });

        apply((NombreCambiado event) ->{
            artista.actualizarNombre(event.getNombre());
        });
    }

}
