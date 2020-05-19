package org.AplicacaoMVC.model;

public class Converter {
    private int number;
    private String result;
    
    public int getNumber() {
        return number;
    }
    public String getResult() {
        return result;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public void toBinary(){
        result = Integer.toBinaryString(number);
    }
    public void toHex(){
        result = Integer.toHexString(number);
    }
    public void toOctal() {
        result = Integer.toOctalString(number);
    }
    public void clear(){
        result = "";
    }
}