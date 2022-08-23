/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocalculadora;

/**
 *
 * @author gabri
 */
public class ProjetoCalculadora {
    
    private float num1 = 0;
    private float num2 = 0;
    private float result =0;
    private float numaux2 =0;
    private String numAux = "";
    private String sinal = "";
    private String vazio = "";

    public void setResult(float result) {
        this.result = result;
    }

    public float getResult() {
        return result;
    }
    
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    
    public String getVazio() {
        return vazio;
    }

    public String getSinal() {
        return sinal;
    }

    public void setNumAux(String numAux) {
        this.numAux = numAux;
    }

    
    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public String getNumAux() {
        return numAux;
    }
    
    public float soma(float num1,float num2){
        return num1 + num2;
    }
}
