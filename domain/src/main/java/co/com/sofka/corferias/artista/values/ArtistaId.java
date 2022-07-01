package co.com.sofka.corferias.artista.values;

import co.com.sofka.domain.generic.Identity;

public class ArtistaId extends Identity {

    private final String value;
    private final Type type;


    private ArtistaId(String value, Type type){

        this.value = value;
        this.type = type;
    }

    public static ArtistaId of(Type type, String value) {
        return new ArtistaId(value, type)    ;
    }

    @Override
    public String value(){
        return type+"-"+value;
    }

    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public enum Type{
        PASAPORTE, CC, TI
    }
}
