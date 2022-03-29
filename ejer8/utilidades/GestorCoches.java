/*
 * Clase que gestiona los coches
 */
package ejer8.utilidades;

import ejer8.concesionario.Coche;
import java.util.ArrayList;

/**
 *
 * @author Cristina
 */
public class GestorCoches {

    public static ArrayList<Coche> listaCoches;

    public static void creaLista() {
        if (listaCoches == null) {
            listaCoches = new ArrayList<>();
            listaCoches.add(new Coche("2222-KYY", "Aston Martin DB11", 8));
            listaCoches.add(new Coche("3333-KZZ", "McLaren P1", 10));
            listaCoches.add(new Coche("4444-LBB", "Lamborghini Gallardo", 200));
            listaCoches.add(new Coche("5555-KKK", "Ferrari Laferrari", 350));
            listaCoches.add(new Coche("6666-KML", "Porsche 718 Cayman", 100));
            listaCoches.add(new Coche("7777-KVH", "Volvo v60", 8));
        }
    }
    
    public static String[][] getCoches() {
        String [][] array =new String[listaCoches.size()][3];
        int pos=0;
        for(Coche c:listaCoches) {
            array[pos++]=c.toArray();
        }
        return array;
    }

    public static void altaCoche(Coche c) {
        listaCoches.add(c);
    }
    
    public static void bajaCoche(Coche c) {
        listaCoches.remove(c);
    }

    public static Coche buscaCoche(String matricula) {
        //busca un coche, si no lo encuentra devuelve null
        for (Coche c : listaCoches) {
            System.out.println(c);
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                return c;
            }
        }
        return null;
    }
    
    public static String[][] listado() {
        String [][] array=new String[listaCoches.size()][3];
        int pos=0;
        for (Coche c : listaCoches) {
            array[pos++]=c.toArray();
        }
        return array;
    }
    
    public static ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }
}
