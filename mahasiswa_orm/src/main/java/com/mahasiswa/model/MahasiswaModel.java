/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.model;
import jakarta.persistence.*;

/*
 */

/**
 *
 * @author mruhu
 */
@Entity
@Table(name = "mahasiswa")
public class MahasiswaModel {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "npm", nullable = false, length = 8)
private String nim;

@Column(name = "nama", nullable = false, length = 50)
private String nama;

@Column(name = "semester", nullable = false, length = 2)
private int semester;

@Column(name = "ipk", nullable = false, length = 3)
private float ipk;

    
    
    public MahasiswaModel(int id, String npm, String nama, int semester, float ipk) {
        this.id = id;
        this.nim = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }
    public  MahasiswaModel(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
