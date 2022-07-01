package co.com.sofka.corferias.salon.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<String> {

    private final Integer value;

    public Capacidad(Integer value){
        this.value = value;

        if(this.value < 0){
            throw  new IllegalArgumentException("Por favor ingrese un Capcidad valido");
        }
    }


    @Override
    public String value() {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capacidad capacidad = (Capacidad) o;
        return Objects.equals(value, capacidad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
