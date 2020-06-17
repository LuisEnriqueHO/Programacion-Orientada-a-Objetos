/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author Wuicho
 */
public final class Auto {

    private String modelo;
    private int llantas, puertas, kilometros;

    Auto(int llantas, int puertas, String modelo, int kilometros) {
        setLlantas(llantas);
        setPuertas(puertas);
        setModelo(modelo);
        setKilometros(kilometros);

    }

    private void setLlantas(int n) {
        llantas = n;
    }

    private void setPuertas(int a) {
        puertas = a;
    }

    private void setModelo(String c) {
        modelo = c;
    }

    private void setKilometros(int e) {
        kilometros = e;
    }

    public int getLlantas() {
        return llantas;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void presentarAuto() {
        System.out.println("No. Llantas:" + getLlantas() + "No. Puertas:" + getPuertas() + "Modelo:" + getModelo() + "Kilometros recorridos:" + getKilometros());
        if (llantas >= 4) {
            System.out.println("Es un Auto");
        } else {
            System.out.println("Es una moto");
            {

            }

        }

    }

}
