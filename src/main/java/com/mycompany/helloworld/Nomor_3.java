/*Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘A’ dan
karakter ‘B’!*/

package com.mycompany.helloworld;

public class Nomor_3 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        int asciiA = (int)a;
        int asciiB = (int)b;

        int total = asciiA + asciiB;

        System.out.println("Hasil penjumlahan dari nilai ASCII karakter A dan B adalah : " + total);
    }
}
