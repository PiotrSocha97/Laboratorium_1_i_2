package com.labs;

import java.util.Locale;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Samochod samochod = new Samochod();

        System.out.println("Podaj marke samochodu");
        String marka = scanner.nextLine();
        samochod.setMarka(marka);

        System.out.println("Podaj model samochodu");
        String model = scanner.nextLine();
        samochod.setModel(model);

        System.out.println("Podaj rok produkcji samochodu");
        int rok = scanner.nextInt();
        while (rok < 1950 || rok > 2030) {
            System.out.println("Rok produkcji musi zawierac sie miedzy 1950 a 2030");
            rok = scanner.nextInt();
        }
        samochod.setRokProdukcji(rok);

        System.out.println("Podaj pojemnosc silnika samochodu");
        float pojemnosc = scanner.nextFloat();
        while (pojemnosc < 0.1 || pojemnosc > 20.0) {
            System.out.println("Pojemnosc musi zawierac sie miedzy 0.1 a 20.0");
            pojemnosc = scanner.nextFloat();
        }
        samochod.setPojemnoscSilnika(pojemnosc);

        System.out.println("Marka: " + samochod.getMarka());
        System.out.println("Model: " + samochod.getModel());
        System.out.println("Rok produkcji: " + samochod.getRokProdukcji());
        System.out.println("Pojemnosc silnika: " + samochod.getPojemnoscSilnika());

        scanner.close();

    }
}
