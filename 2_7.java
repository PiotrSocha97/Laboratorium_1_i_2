package com.labs;

public class Samochod {
    /**
     * Przechowuje pojemnosc silnika
     */
    private float pojemnoscSilnika;
    /**
     * Przechowuje nazwe marki samochodu
     */
    private String marka;
    /**
     * Przechowuje nazwe modelu samochodu
     */
    private String model;
    /**
     * Przechowuje rok produkcji samochodu
     */
    private int rokProdukcji;

    /**
     * Zwraca pojemnosc silnika
     *
     * @return float
     */
    public float getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    /**
     * Ustawia pojemnosc silnika
     *
     * @param pojemnoscSilnika
     */
    public void setPojemnoscSilnika(float pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    /**
     * Zwraca nazwe marki
     *
     * @return String
     */
    public String getMarka() {
        return marka;
    }

    /**
     * Ustawia nazwe marki
     *
     * @param marka
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * Zwraca nazwe modelu samochodu
     *
     * @return String
     */
    public String getModel() {
        return model;
    }

    /**
     * Ustawia nazwe modelu samochodu
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * zwraca rok produkcji samochodu
     *
     * @return int
     */
    public int getRokProdukcji() {
        return rokProdukcji;
    }

    /**
     * ustawia rok produkcji samochodu
     *
     * @param rokProdukcji
     */
    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    /**
     * Funkcja main
     *
     * @param args
     */
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.setMarka("Toyota");
        samochod.setModel("Rav4");
        samochod.setPojemnoscSilnika((float) 2.4);
        samochod.setRokProdukcji(2021);
        System.out.println("Marka: " + samochod.getMarka());
        System.out.println("Model: " + samochod.getModel());
        System.out.println("Rok produkcji: " + samochod.getRokProdukcji());
        System.out.println("Pojemnosc silnika: " + samochod.getPojemnoscSilnika());
    }
}
