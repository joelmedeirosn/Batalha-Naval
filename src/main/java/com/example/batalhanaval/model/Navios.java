package com.example.batalhanaval.model;

public class Navios {

    public int navioAvioes(){
        int i,j;
        for (i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                if(i==0 || i>=1 && i<=2 && j==1){
                    System.out.print("*");

                } else{
                    System.out.print(" ");

                }
            }
            System.out.println();

        } return 0;

    }
    public int navio4Canos(){
        for(int i=1;i<5;i++){
            System.out.println("*");
        }return 0;
    }

    public int navio3Canos(){
        for(int i=1;i<4;i++){
            System.out.println("*");
        }return 0;
    }
    public int navio2Canos(){
        for(int i=1;i<3;i++){
            System.out.println("*");
        }return 0;
    }
    public int navio1Cano(){
        System.out.println("*");
        return 0;
    }
    private int quantAvioes=1;
    private int quant4Canos=1;
    private int quant3Canos=2;
    private int quant2Canos=3;
    private int quant1Cano=4;



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
