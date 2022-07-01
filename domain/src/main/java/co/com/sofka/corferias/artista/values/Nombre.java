package co.com.sofka.corferias.artista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String value;

    /**
     * Validamos que el nombre no sea null
     * y sea validao al menos 3 letras.
     *
     * @param value Nombre del Evento
     */
    public Nombre(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.length() < 3){
            throw  new IllegalArgumentException("Por favor ingrese un Nombre valido");
        }
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}