/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mahasiswa.controller;
import java.util.List;
import com.mahasiswa.model.MahasiswaModel;


/**
 *
 * @author mruhu
 */
public interface MahasiswaController {
    public void addMhs(MahasiswaModel mhs);
    public MahasiswaModel getMhs(int id);
    public void updateMhs(MahasiswaModel mhs);
    public void deleteMhs(int id);
    public List<MahasiswaModel> getAllMahasiswa();
}