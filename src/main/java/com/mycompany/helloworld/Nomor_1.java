/*Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
pecahan dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!*/

package com.mycompany.helloworld;

import java.util.Scanner;

public class Nomor_1 {

    public static void main(String[] args) {
        double[] pecahan =new double[3];
        double hasil = 0, pembilang, penyebut;
        char operasi;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0;i<3;i++){
            System.out.println("Masukan pembilang pecahan ke " + (i+1)  + " :");
            pembilang=input.nextDouble();
            System.out.println("Masukan pembilang pecahan ke "+ (i+1) + " :");
            penyebut=input.nextDouble();
            pecahan[i]=pembilang / penyebut;
        }
        
        System.out.print("Masukan Operasi yang diinginkan (*;/;+;-) : ");
        operasi = input.next().charAt(0);
        
        switch(operasi){
            case '*' :
                for(int i=0;i<3;i++){
                    hasil = 1;
                    hasil = hasil * pecahan[i];
                }
                break;
            case '-' :
                for(int i=0;i<3;i++){
                    hasil = hasil - pecahan[i];
                }
                break;
            case '+' :
                for(int i=0;i<3;i++){
                    hasil = hasil + pecahan[i];
                }
                break;
            case '/' :
                for(int i=0;i<3;i++){
                    if(hasil == 0){
                        hasil = pecahan[i];
                    }else{
                        hasil = hasil / pecahan[i];
                    }
                }
                break;
        }
        
        System.out.println("Hasil operasi dari 3 pecahan yang telah di inputkan adalah " + hasil);
    }
}
