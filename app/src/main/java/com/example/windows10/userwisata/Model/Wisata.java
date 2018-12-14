package com.example.windows10.userwisata.Model;

import com.google.gson.annotations.SerializedName;

public class Wisata {
    @SerializedName("id_wisata")
    private String idWisata;
    @SerializedName("id_kecamatan")
    private String idKecamatan;
    @SerializedName("nama_wisata")
    private String namaWisata;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("cp")
    private String cp;
    @SerializedName("deskripsi")
    private String deskripsi;
    @SerializedName("gambar")
    private String gambar;
    private String action;
//    private boolean isFavorite = false;

    public Wisata(String idWisataisata, String idKecamatan, String namaWisata, String alamat, String cp, String deskripsi, String gambar, String action) {
        this.idWisata= idWisata;
        this.idKecamatan = idKecamatan;
        this.namaWisata = namaWisata;
        this.alamat = alamat;
        this.cp = cp;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getIdWisata() {
        return idWisata;
    }

    public void setIdWisata(String idWisata) {
        this.idWisata= idWisata;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getAction() { return action; }

    public void setAction(String action) {
        this.action = action;
    }

//    public boolean getIsFavorite() {
//        return isFavorite;
//    }
//
//    public void setIsFavorite (boolean isFavorite) {
//        this.isFavorite = isFavorite;
//    }
//
//    public void toggleFavorite() {
//        this.isFavorite = isFavorite;
//    }

}
