package com.github.vilmosnagy.ideabug;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.SimpleAccountRealm;

public class Application {

    public static void main(String[] args) {
        // use some shiro related code.
        Realm realm = new SimpleAccountRealm();
        System.out.println("Shiro related code works.");
    }
}
