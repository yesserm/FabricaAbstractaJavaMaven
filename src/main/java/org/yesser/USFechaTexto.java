package org.yesser;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class USFechaTexto extends FechaTexto{
    @Override
    public String presentaFT() {
        Locale local = new Locale("en", "US");
        Date fecha = new Date();
        String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, local).format(fecha);
        return hoystr;
    }
}
