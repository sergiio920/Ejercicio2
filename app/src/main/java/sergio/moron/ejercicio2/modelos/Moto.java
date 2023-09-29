package sergio.moron.ejercicio2.modelos;

import java.io.Serializable;

public class Moto implements Serializable {
    private String marca;
    private String modelo;
    private String cilindro;

    public Moto() {
    }

    public Moto(String marca, String modelo, String cilindro) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindro = cilindro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindro() {
        return cilindro;
    }

    public void setCilindro(String cilindro) {
        this.cilindro = cilindro;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindro='" + cilindro + '\'' +
                '}';
    }
}
