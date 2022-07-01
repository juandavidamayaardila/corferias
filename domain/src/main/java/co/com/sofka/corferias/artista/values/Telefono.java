package co.com.sofka.corferias.artista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String > {

    private final String value;

    /**
     * Validamos que el telefono sea valido,
     * 10 caracteres.
     *
     * @param value Numero telefonico ingresado.
     */
    public Telefono(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.length() != 10){
            throw  new IllegalArgumentException("Por favor ingrese un email valido");
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
        Telefono telefono = (Telefono) o;
        return Objects.equals(value, telefono.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}