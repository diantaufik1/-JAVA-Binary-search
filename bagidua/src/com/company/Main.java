package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        int tabInt[] = {12,23,29,34,56,60,67,78,84,99};
//        int i,j,k;
//        int cariData,ketemu;
//        Scanner masukan= new Scanner(System.in);
//        System.out.print("Masukkan data yang dicari = ");
//        cariData = masukan.nextInt();
//        i = 0; j = 9;ketemu = 0;
//        while((ketemu == 0) && (i<=j)){
//            k = (int)(i + j) / 2;
//            if(tabInt[k] == cariData){
//                ketemu = 1;
//            }
//            else{
//                if(tabInt[k] > cariData){
//                    j = k - 1;
//                }
//                else{
//                    i = k + 1;
//                }
//            }
//        }
//        if(ketemu==1){
//            System.out.print("Data "+cariData+ " terdapat pada kumpulan data\n");
//        }else{
//            System.out.print("Data "+cariData+ " tidak terdapat pada kumpulan data\n");
//        }

        int[] data = {99,20,17,8,27,5,21,10,41,11};
        Scanner masukan= new Scanner(System.in);
        int cari;
        System.out.print("Masukkan data yang dicari = ");
        cari = masukan.nextInt();
        int i=0;
        boolean ditemukan = false;

        for(i=0; i < data.length; i++){
            if (data[i] == cari){
                ditemukan=true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Data : " + cari + " Ditemukan Pada Index :"+ i +".");
        }
        else{
            System.out.println("Data Tidak di temukan");
        }



    }
}
