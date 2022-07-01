package co.com.sofka.corferias.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.corferias.artista.comands.CrearArtista;
import co.com.sofka.corferias.artista.events.ArtistaCreado;
import co.com.sofka.corferias.artista.values.ArtistaId;
import co.com.sofka.corferias.artista.values.Email;
import co.com.sofka.corferias.artista.values.Nombre;
import co.com.sofka.corferias.artista.values.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba de creacion de Artistaas,
 * se crea el artista y se comprueba con
 * el valor que devuelve el evento.
 *
 */
@ExtendWith(MockitoExtension.class)
class CrearArtistaUseCaseTest {

    @InjectMocks
    CrearArtistaUseCase useCase;

    @Test
    public void crearArtista() {
        ArtistaId entityId = ArtistaId.of(ArtistaId.Type.CC, "1094");
        Nombre nombre = new Nombre("Shakira");
        Email email = new Email("Shakira@gmail.com");
        Telefono telefono = new Telefono("3113559485");
        var command = new CrearArtista(entityId, nombre, email, telefono);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (ArtistaCreado) events.get(0);
        Assertions.assertEquals("Shakira", event.getNombre().value());


    }
}