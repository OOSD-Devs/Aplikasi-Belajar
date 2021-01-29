/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application;

import com.data.Admin;
import com.data.Mahasiswa;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jerry Pangaribuan
 */
public class AplikasiBelajar {
    public static void main(String[] args) throws IOException {
        
        Scanner userInput = new Scanner(System.in);
        boolean lanjutkan = true;
        boolean login = false;
        int peran = 0;
        
        while(lanjutkan){
            if(login){
                if(peran == 1){
                    System.out.println("Sudah login sebagai mahasiswa");

                    lanjutkan = yaAtauTidak("Apakah anda ingin melanjutkan");
                }else if(peran == 2){
                    System.out.println("Sudah login sebagai admin");

                    lanjutkan = yaAtauTidak("Apakah anda ingin melanjutkan");
                }else{
                    System.out.println("no");
                }
            }else{
            
            System.out.println("\n==== SELAMAT DATANG DI APLIKASI BELAJAR ====");
            System.out.println("Silahkan pilih peran anda dalam aplikasi ini");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.print("Masukkan pilihan anda: ");
            peran = userInput.nextInt();
            
            switch(peran){
                case 1:
                    int pilihan;
                    Mahasiswa mhs = new Mahasiswa();
                    System.out.println("\n==== MAHASISWA ====");
                    System.out.println("1. Login");
                    System.out.println("2. Register");
                    System.out.print("Masukkan Pilihan anda: ");
                    pilihan = userInput.nextInt();
                    switch(pilihan){
                        case 1:
                            System.out.println("\n==== LOGIN ====");
                            login = mhs.login();
                            System.out.println(login);
                            break;
                        case 2:
                            System.out.println("\n==== REGISTER MAHASISWA ====");
                            mhs.register();
                            break;
                        default:
                            System.out.println("Maaf inputan kode inputan anda salah");
                    }
                    break;
                case 2:
                    Admin adm = new Admin();
                    System.out.println("\n==== ADMIN ====");
                    System.out.println("1. Login");
                    System.out.println("2. Register");
                    System.out.print("Masukkan pilihan anda: ");
                    pilihan = userInput.nextInt();
                    switch(pilihan){
                        case 1:
                            System.out.println("\n==== LOGIN ====");
                            login  = adm.login();
                            System.out.println(login);
                            break;
                        case 2:
                            System.out.println("\n==== REGISTER ADMIN ====");
                            adm.register();
                            break;
                        default:
                            System.out.println("Maaf kode inputan anda salah");
                    }
                    break;
                default:
                    System.out.println("Maaf kode inputan anda salah");
            }
            
            if(!login){
                lanjutkan = yaAtauTidak("Apakah anda ingin melanjutkan");
            }
        }
        }
    }
    
    public static boolean yaAtauTidak(String messages){
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n" + messages + " (y/n)? ");
        String pilihanUser = userInput.next();
        
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.out.println("Pilihan anda bukan y atau n");
            System.out.println("\n" + messages + " y/n? ");
            pilihanUser = userInput.next();
        }
        
        return pilihanUser.equalsIgnoreCase("y");
    }
}
