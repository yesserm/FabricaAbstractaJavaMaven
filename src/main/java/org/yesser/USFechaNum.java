package org.yesser;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class USFechaNum extends FechaNum{
    @Override
    public String presentaFN() {
        Locale local = new Locale("en", "US");
        Date fecha = new Date();
        String hoystr = DateFormat.getDateTimeInstance(DateFormat.SHORT,
                DateFormat.SHORT, local).format(fecha);
        return hoystr;
    }
}
