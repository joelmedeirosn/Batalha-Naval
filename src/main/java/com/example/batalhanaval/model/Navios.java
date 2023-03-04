package com.example.batalhanaval.model;

public class Navios extends Player {
    private int quantAvioes;
    private int quant4Canos;
    private int quant3Canos;
    private int quant2Canos;
    private int quant1Cano;

    public Navios(String playerName , int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes){
        super(playerName);
        this.quant1Cano = quant1Cano;
        this.quant2Canos = quant2Canos;
        this.quant3Canos = quant3Canos;
        this.quant4Canos = quant4Canos;
        this.quantAvioes = quantAvioes;

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
