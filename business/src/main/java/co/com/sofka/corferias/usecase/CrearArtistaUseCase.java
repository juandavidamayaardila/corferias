package co.com.sofka.corferias.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.corferias.artista.Artista;
import co.com.sofka.corferias.artista.comands.CrearArtista;

/**
 * Caso de uso para crear un artista hacemos usando
 * comando.
 *
 * JD Amaya
 *
 */
public class CrearArtistaUseCase extends UseCase<RequestCommand<CrearArtista>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearArtista> crearArtistaRequestCommand) {
        var comand = crearArtistaRequestCommand.getCommand();
        var artista = new Artista(
                comand.getEntityId(),
                comand.getNombre(),
                comand.getEmail(),
                comand.getTelefono()
        );
        emit().onResponse(new ResponseEvents(artista.getUncommittedChanges()));
    }
}
