/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

import static com.data.Mahasiswa.cariDiDatabase;
import static com.data.Mahasiswa.yaAtauTidak;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jerry Pangaribuan
 */
public class Admin extends User implements Auth{

    public Admin() {
    }
    
    @Override
    public boolean login() throws IOException{
        try{
            File file = new File("Admin.txt");
        }catch(Exception e){
            System.out.println("Database tidak ditemukan");
            System.out.println("Silahkan register terlebih dahulu!");
            System.out.println(e);
            return false;
        }
        
        Scanner userInput = new Scanner(System.in);
        
        String username;
        String password;
        
        System.out.print("Masukkan Username: ");
        username = userInput.next();
        System.out.print("Masukkan Password: ");
        password = userInput.next();
        
        boolean isExist = cariDiDatabase(username, password);
        
        return isExist;
    }
    
    public static boolean cariDiDatabase(String username, String password) throws IOException{
        
        FileReader fileInput = new FileReader("Admin.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        String data = bufferInput.readLine();
        boolean isExist = false;
        
        while(data != null){
            
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            
            stringToken.nextToken();
            stringToken.nextToken();
            
            if(stringToken.nextToken().equalsIgnoreCase(username) && stringToken.nextToken().equalsIgnoreCase(password)){
                isExist = true;
            }
            
            data = bufferInput.readLine();
        }
        
        return isExist;
    }

    @Override
    public void register() throws IOException{
        FileWriter fileOutput = new FileWriter("Admin.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        Admin adm = new Admin();
        Scanner userInput = new Scanner(System.in);
        int pilihan;
        
        System.out.print("Masukkan Nama: ");
        adm.setNama(userInput.nextLine());
        System.out.println("Jenis Kelamin: ");
        System.out.println("1. " + JenisKelamin.LAKILAKI);
        System.out.println("2. " + JenisKelamin.PEREMPUAN);
        System.out.print("Masukkan kode Jenis Kelamin: ");
        pilihan = userInput.nextInt();
        
        while(pilihan != 1 && pilihan != 2){
            System.out.println("Kode jenis kelamin salah!");
            System.out.println("1. " + JenisKelamin.LAKILAKI);
            System.out.println("2. " + JenisKelamin.PEREMPUAN);
            System.out.print("Masukkan kode Jenis Kelamin: ");
            pilihan = userInput.nextInt();
        }
        
        switch(pilihan){
            case 1:
                adm.setJenisKelamin(JenisKelamin.LAKILAKI);
                break;
            case 2:
                adm.setJenisKelamin(JenisKelamin.PEREMPUAN);
                break;
        }
        
        System.out.print("Masukkan Username: ");
        adm.setUsername(userInput.next());
        System.out.print("Masukkan Password: ");
        adm.setPassword(userInput.next());
        
        System.out.println("Nama: " + adm.getNama());
        System.out.println("Jenis Kelamin " + adm.getJenisKelamin());
        System.out.println("Username: " + adm.getUsername());
        System.out.println("Password: " + adm.getPassword());
        
        boolean isRegister = yaAtauTidak("Apakah anda yakin ingin menambah data tersebut");
        
        if(isRegister){
            bufferOutput.write(adm.getNama() + "," + adm.getJenisKelamin() + "," + adm.getUsername() + "," + adm.getPassword());
            bufferOutput.newLine();
            bufferOutput.flush();
        }
        
        bufferOutput.close();
    }

    @Override
    public boolean logout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void tambahSoal(){
        
    }
    
    public void editSoal(){
        
    }
    
    public void hapusSoal(){
        
    }
    
}
