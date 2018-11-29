/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author baki
 */
public class UserActions {

    private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return this.users;
    }

    boolean login(String userName, String password) {
        //logiin methodunda tüm kullanıclarda döneceksin username eşit olana bak sonrasında girilen passworda eşitse true.

        for (User user : this.users) {
            if (user.userName.equals(userName) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    boolean signUp(String userName, String password, String fullName, String birthDate) {
        User user = new User();
        user.birthDate = birthDate;
        user.fullName = fullName;
        user.password = password;
        user.userName = userName;
        this.users.add(user);
        return true;
    }

    void printUsers() {
        this.users.forEach((user) -> {
            System.out.println(user.userName + user.fullName);
        });

    }
}
