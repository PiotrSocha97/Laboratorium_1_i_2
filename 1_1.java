package com.labs;

import java.io.*;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private int operation;

    private void showCommands() {
        System.out.println("Wybierz operacje");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
    }

    private void readOperation() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            operation = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readNumbers() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Podaj pierwsza liczbe");
            firstNumber = Double.parseDouble(br.readLine());
            System.out.println("Podaj druga liczbe");
            secondNumber = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private double calculate() {
        double result;
        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    /**
     * Wywoluje interakcje z uzytkownikiem
     */
    public void interaction() {
        showCommands();
        readOperation();
        readNumbers();
        double result = calculate();
        System.out.println("Wynik to: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.interaction();
    }
}
