package programa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*1 uzduotis*/
        Komunalines komunalines = new Komunalines(3, "Kotedzas", 100, 12.9);
        KomunalinesDAO.insert(komunalines);

        /*2 uzduotis*/
        ArrayList<Komunalines> vartotojai = KomunalinesDAO.selectAll();
        System.out.println(vartotojai);

        /*3uzduotis*/
        ArrayList<Komunalines> gyventojuSkaiciusSurikiuotas = KomunalinesDAO.sort();
        System.out.println(gyventojuSkaiciusSurikiuotas);

        /*4uzduotis*/
        ArrayList<Komunalines> atranka = KomunalinesDAO.tikNamai();
        System.out.println(atranka);

        /*5uzduotis*/
        ArrayList<Komunalines> plotas = KomunalinesDAO.maziausiasPlotas();
        System.out.println(plotas);
    }
}