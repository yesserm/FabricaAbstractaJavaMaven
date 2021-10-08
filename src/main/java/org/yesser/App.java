package org.yesser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        FechaFactory ff;
        FechaNum fn;
        FechaTexto ft;
        String formato, pais;

        System.out.println("Selecciona el formato (T/N):");
        formato = entrada.readLine().toUpperCase();
        System.out.println("Seleccione el pais (M/U):");
        pais = entrada.readLine().toUpperCase();

        if (pais.equals("M"))
        {
            ff = new SPFechaFactory();
            if(formato.equals("T"))
            {
                ft = ff.creaFechaTexto();
                System.out.println(ft.presentaFT());
            }
            else if(formato.equals("N"))
            {
                fn = ff.creaFechaNum();
                System.out.println(fn.presentaFN());
            }
            else
            {
                System.out.println("Formato incorrecto");
                System.exit(0);
            }
        }
        else if(pais.equals("U"))
        {
            ff = new USFechaFactory();
            if (formato.equals("T"))
            {
                ft = ff.creaFechaTexto();
                System.out.println(ft.presentaFT());
            }
            else if(formato.equals("N"))
            {
                fn = ff.creaFechaNum();
                System.out.println(fn.presentaFN());
            }
            else
            {
                System.out.println("Formato incorrecto");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("País incorrecto");
            System.exit(0);
        }

    }
}
