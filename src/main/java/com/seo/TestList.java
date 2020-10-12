/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seo;

import java.util.ArrayList;

/**
 *
 * @author shashank
 */
public class TestList {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");
        a.add(System.currentTimeMillis() + "");

        if (a.size() >= 0 && a.size() <= 5) {
            try {
                System.out.println(a.subList(0, 5));
            } catch (Exception e) {
                System.out.println(a.subList(0, a.size()));
            }
        }

        if (a.size() >= 5 && a.size() <= 10) {
            try {
                System.out.println(a.subList(5, 10));
            } catch (Exception e) {
                System.out.println(a.subList(5, a.size()));
            }
        }

        if (a.size() >= 10 && a.size() <= 15) {
            try {
                System.out.println(a.subList(10, 15));
            } catch (Exception e) {
                System.out.println(a.subList(10, a.size()));
            }
        }

        if (a.size() >= 15 && a.size() <= 20) {
            try {
                System.out.println(a.subList(15, 20));
            } catch (Exception e) {
                System.out.println(a.subList(15, a.size()));
            }
        }

        if (a.size() >= 20 && a.size() <= 25) {
            try {
                System.out.println(a.subList(20, 25));
            } catch (Exception e) {
                System.out.println(a.subList(20, a.size()));
            }
        }

    }

}
