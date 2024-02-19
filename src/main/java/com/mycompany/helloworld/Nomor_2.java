/*Buatlah algoritma dalam Bahasa Java Anda akan diberi hadiah jika rangking 1 dikelas
dan naik kelas, yang dapat ditulis sebagai ekspresi: (rangking == 1) && (naikKelas)*/

package com.mycompany.helloworld;
import java.util.Scanner;

public class Nomor_2 {
    public static void main(String[] args) {
        char status;
        int rank;
        Scanner i = new Scanner(System.in);
        
        System.out.print("Rangking Berapa Kamu ? ");
        rank = i.nextInt();
        System.out.print("Apakah Kamu Naik Kelas (y/t) : " );
        status = i.next().charAt(0);
        
        if(rank == 1 && status == 'y' ){
            System.out.println("Selamat anda mendapatkan hadiah!!!");
        }else{
            System.out.println("Bekerja lebih keras lagi yaaa :)");
        }
    }
}
