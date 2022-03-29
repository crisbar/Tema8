/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8.concesionario;

/**
 *
 * @author Cristina
 */
public class Coche {

    private String matricula;
    private String modelo;
    private double km;

    public Coche() {
    }
  
    public Coche(String matricula, String modelo, double km) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = km;
    }
    
    
    public void setMatricula(String matricula) throws Exception {
        /* la matricula tiene que tener 8 caracteres */
        if (matricula.length() != 8) {
            throw new Exception("Matricula incorrecta");
        }
        this.matricula = matricula;
    }

    public void setModelo(String modelo) throws Exception {
        /*El modelo no puede estar vacío y 
tiene que tener menos de 20 caracteres */
        int tam = modelo.length();
        if (tam < 1 || tam > 20) {
            throw new Exception("El modelo tiene que tener entre 1 y 20 caracteres");
        }
        this.modelo = modelo;
    }

    public void setKm(long km) throws Exception {
        /* Los km tienen que ser mayor que cero */
        if (km < 0) {
            throw new Exception("Los km no pueden ser negativos");
        }
        this.km = km;
    }

    public void setKm(String km) throws Exception {
        long k;
        try {
            k = Long.parseLong(km);
        } catch (NumberFormatException ex) {
            throw new Exception("Formato númerico no válido");
        }
        setKm(k);
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + getMatricula() + ", modelo=" + getModelo() + ", km=" + getKm() + '}';
    }

    

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the km
     */
    public double getKm() {
        return km;
    }
    
    
    public String[] toArray() {
        String [] array=new String[3];
        array[0]=matricula;
        array[1]=modelo;
        array[2]=String.format("%,12.0f", km);
        return array;
    }

}
