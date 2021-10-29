package com.myaasiinh.hierarkipackage;

import com.myaasiinh.hierarkipackage.utils.Consol;

public class User {

    private String nama;

    User(String nama) {
        this.nama = nama;
    }

    String getNama() {

        return this.nama;

    }

    void show() {
       //System.out.println("ini adalah : " + this.nama);
        Consol.log("ini adalah : " + this.nama);

    }

}
