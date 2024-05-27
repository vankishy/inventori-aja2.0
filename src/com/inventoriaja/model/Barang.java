/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventoriaja.model;

/**
 *
 * @author Indra Mahesa
 */
public class Barang {
    private int id;
    private String kode;
    private String nama;
    private String kategori;
    private int stok;
    private int harga;
    private int cabangId;
    private String createdAt;

    public Barang(int id, String kode, String nama, String kategori, int stok, int harga, int cabangId, String createdAt) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
        this.cabangId = cabangId;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public int getCabangId() {
        return cabangId;
    }

    public void setCabangId(int cabangId) {
        this.cabangId = cabangId;
    }
}
