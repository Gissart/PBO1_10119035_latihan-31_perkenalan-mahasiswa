package com.tugasPBO;
/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1
* Deskripsi : menampilkan identitas
* */

public class Mahasiswa {
    public String nim;
    public String nama;
    public void perkenalanDiri(){
        System.out.println("Hello everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama+"\n");
    }
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs.nim = "10110296";
        mhs.nama = "Orang";
        mhs.perkenalanDiri();

        mhs1.nim = "10110932";
        mhs1.nama = "Si A";
        mhs1.perkenalanDiri();

        mhs2.nim = "10123023";
        mhs2.nama = "Si B";
        mhs2.perkenalanDiri();

        mhs3.nim = "10113820";
        mhs3.nama = "Si C";
        mhs3.perkenalanDiri();
    }
}
