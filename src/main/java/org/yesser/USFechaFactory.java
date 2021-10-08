package org.yesser;

public class USFechaFactory implements FechaFactory{
    @Override
    public FechaTexto creaFechaTexto() {
        return new USFechaTexto();
    }

    @Override
    public FechaNum creaFechaNum() {
        return new USFechaNum();
    }
}
