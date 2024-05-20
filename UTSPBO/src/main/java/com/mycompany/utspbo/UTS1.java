/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utspbo;

import java.util.Scanner;

/**
 *
 * @author A-28
 */
public class UTS1 {
    public static void main(String[] args) { 
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh Dian Kurnia Ramadhani NIM 23201273");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Masukkan nama anda: ");
       
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
       
        System.out.println("Pilih jenis kelamin:");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.println("Masukkan pilihan (1/2): ");
        int jenisKelamin = scanner.nextInt();

        String panggilan = null;
        if (jenisKelamin == 1) {
            panggilan = "Mas";
        } else if (jenisKelamin == 2) {
            panggilan = "Mba";
        } 
        // Menampilkan selamat datang     
        System.out.println("Selamat Datang " + panggilan + " " + nama);
        // Menampilkan kalkulator
        System.out.println("Kalkulator");

        char lanjut = 0;
        do {
            System.out.println("Masukkan bilangan pertama: ");
            double bil1 = scanner.nextDouble();

            System.out.println("Masukkan bilangan kedua: ");
            double bil2 = scanner.nextDouble();

            System.out.println("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double hasil;
            switch (operator) {
                case '+':
                    hasil = bil1 + bil2;
                    break;
                case '-':
                    hasil = bil1 - bil2;
                    break;
                case '*':
                    hasil = bil1 * bil2;
                    break;
                case '/':
                    if (bil2 == 0) {
                        System.out.println("Error: Pembagian dengan nol!");
                        continue;
                    }
                    hasil = bil1 / bil2;
                    break;
                default:
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                    continue;
            }
            // Bertanya apakah ingin melanjutkan
            System.out.print("Ingin melanjutkan? (y/n): ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("n")) {
                lanjut = false;

        System.out.println("Thank you for using the calculator. Goodbye!");
    }
}