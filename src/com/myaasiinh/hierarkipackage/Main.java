package com.myaasiinh.hierarkipackage;


import com.myaasiinh.hierarkipackage.utils.Consol;

class Main {

    public static void main(String args[]) {
        User user = new User("myaasiinh");
        user.show();

        Consol.log(user.getNama());
    }
}
