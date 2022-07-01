package co.com.sofka.corferias.evento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

/***
 * Objetod de valor para el agregado Evento, validamos
 * que la fecha se valida.
 */
public class Fecha implements ValueObject<String> {

    private final LocalDate value;

    /***
     * Validamos que la fecha no sea anterior
     * a la fecha actual.
     *
     * @param value fecha del evnto.
     */
    public Fecha(LocalDate value) {
        if (value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("No valida fecha del evento");
        }
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(value, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
