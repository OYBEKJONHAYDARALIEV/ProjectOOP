package app_controller.oop.oop_encapsulation.homework;

import java.awt.color.ICC_ColorSpace;

public class Address {
    private String viloyat;
    private String tuman;
    private String kochaNomi;
    private int uyRaqami;


    public Address (String viloyat , String tuman , String kochaNomi , int uyRaqami){
        this.viloyat = viloyat;
        this.tuman = tuman;
        this.kochaNomi = kochaNomi;
        this.uyRaqami = uyRaqami;

    }
    public String getViloyat(){
        return viloyat;
    }
    public String getTuman(){
        return tuman;
    }
    public  String getKochaNomi(){
        return kochaNomi;
    }
    public  int getUyRaqami(){
        return uyRaqami;
    }
    public void setViloyat( String viloyat){
        this.viloyat = viloyat;
    }
    public void setTuman(String tuman){
        this.tuman = tuman;
    }
    public  void  setKochaNomi ( String kochaNomi){
        this.kochaNomi = kochaNomi;
    }
    public void setUyRaqami( int uyRaqami){
        this.uyRaqami= uyRaqami;
    }

    @Override
    public String toString() {
        return " Address -> \n" +
                " viloyat -> '" + viloyat + "\n" +
                " tuman -> '" + tuman + "\n" +
                " kochaNomi -> '" + kochaNomi + "\n" +
                " uyRaqami -> " + uyRaqami + "\n";
    }


}
