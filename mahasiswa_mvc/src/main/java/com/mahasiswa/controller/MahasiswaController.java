/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.controller;
import com.mahasiswa.model.MahasiswaDAO;
import com.mahasiswa.model.MahasiswaModel;
import java.util.List;
/**
 *
 * @author mruhu
 */
public class MahasiswaController {
    private MahasiswaDAO mahasiswaDAO;
    
    public MahasiswaController(MahasiswaDAO mahasiswaDAO){
        this.mahasiswaDAO = mahasiswaDAO;
    }
    
    public void displayMahasiswaList(List<MahasiswaModel> mahasiswaList){
        if(mahasiswaList.isEmpty()){
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("");
            System.out.println("===========================");
            for(MahasiswaModel m: mahasiswaList){
                System.out.println("ID          : " + m.getId());
                System.out.println("NPM         : " + m.getNim());
                System.out.println("NAMA        : " + m.getNama());
                System.out.println("SEMESTER    : " + m.getSemester());
                System.out.println("IPK         : " + m.getIpk());
                System.out.println("===========================");
            }
        }
    }
    
    
    public void displayMessage(String message){
        System.out.println(message);
    }
    
    
    
    public void checkDatabaseConnection(){
        boolean isConnected = mahasiswaDAO.checkConnection();
        if (isConnected){
            displayMessage("Koneksi ke db berhasil");
        } else{
            displayMessage("Koneksi DB Gagal");
        }
    }
    
    // READ ALL (Menampilkan semua mahasiswa)
    public void displayAllMahasiswa(){
        List<MahasiswaModel> mahasiswaList = mahasiswaDAO.getAllMahasiswa();
        displayMahasiswaList(mahasiswaList);
    }
    
    public void addMahasiswa(String npm, String nama, int semester, float ipk){
        MahasiswaModel mahasiswaBaru = new MahasiswaModel(0, npm, nama, semester, ipk);
        System.out.println("Controller Data:   " + npm + nama + semester + ipk);
        System.out.println(mahasiswaBaru);
        mahasiswaDAO.addMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil ditambahkan!");
    }
    
    public void updateMahasiswa(int id, String npm, String nama, int semester, float ipk){
        MahasiswaModel mahasiswaBaru = new MahasiswaModel(id, npm, nama, semester, ipk);
        mahasiswaDAO.updateMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil diperbarui!");
    }
    
    public void deleteMahasiswa(int id){
        mahasiswaDAO.deleteMahasiswa(id);
        displayMessage("Mahasiswa Berhasil Dihapus!");
    }
    
    public void closeConnection() {
        mahasiswaDAO.closeConnection();
    }
}