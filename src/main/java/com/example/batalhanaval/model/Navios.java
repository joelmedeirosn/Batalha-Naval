package com.example.batalhanaval.model;

public class Navios {
    private int quantAvioes;
    private int quant4Canos;
    private int quant3Canos;
    private int quant2Canos;
    private int quant1Cano;
    public Navios(){
        this.quant1Cano=4;
        this.quant2Canos=3;
        this.quant3Canos=2;
        this.quant4Canos=1;
        this.quantAvioes=1;
    }

    public void navioAvioes(){
        int i,j;
        for (i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                if(i==0 || i>=1 && i<=2 && j==1){
                    System.out.print("P");

                } else{
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }
    public void navio4Canos(){
        for(int i=1;i<5;i++){
            System.out.println("N");
        }
    }

    public void navio3Canos(){
        for(int i=1;i<4;i++){
            System.out.println("N");
        }
    }
    public void navio2Canos(){
        for(int i=1;i<3;i++){
            System.out.println("N");
        }
    }
    public void navio1Cano(){
        System.out.println("N");

    }

    public int getQuantAvioes() {
        return quantAvioes;
    }

    public int getQuant4Canos() {
        return quant4Canos;
    }

    public int getQuant3Canos() {
        return quant3Canos;
    }

    public int getQuant2Canos() {
        return quant2Canos;
    }

    public int getQuant1Cano() {
        return quant1Cano;
    }


}
