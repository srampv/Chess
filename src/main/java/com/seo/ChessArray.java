/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seo;

import com.itextpdf.text.BaseColor;

/**
 *
 * @author sramp
 */
public class ChessArray {

    public static String BLACK[][] = new String[][]{
        {"H8,0,0", "G8,0,1", "F8,0,2", "E8,0,3", "D8,0,4", "C8,0,5", "B8,0,6", "A8,0,7"},
        {"H7,1,0", "G7,1,1", "F7,1,2", "E7,1,3", "D7,1,4", "C7,1,5", "B7,1,6", "A7,1,7"},
        {"H6,2,0", "G6,2,1", "F6,2,2", "E6,2,3", "D6,2,4", "C6,2,5", "B6,2,6", "A6,2,7"},
        {"H5,3,0", "G5,3,1", "F5,3,2", "E5,3,3", "D5,3,4", "C5,3,5", "B5,3,6", "A5,3,7"},
        {"H4,4,0", "G4,4,1", "F4,4,2", "E4,4,3", "D4,4,4", "C4,4,5", "B4,4,6", "A4,4,7"},
        {"H3,5,0", "G3,5,1", "F3,5,2", "E3,5,3", "D3,5,4", "C3,5,5", "B3,5,6", "A3,5,7"},
        {"H2,6,0", "G2,6,1", "F2,6,2", "E2,6,3", "D2,6,4", "C2,6,5", "B2,6,6", "A2,6,7"},
        {"H1,7,0", "G1,7,1", "F1,7,2", "E1,7,3", "D1,7,4", "C1,7,5", "B1,7,6", "A1,7,7"},};

    public static String WHITE[][] = new String[][]{
        {"A1,0,0", "B1,0,1", "C1,0,2", "D1,0,3", "E1,0,4", "F1,0,5", "G1,0,6", "H1,0,7"},
        {"A2,1,0", "B2,1,1", "C2,1,2", "D2,1,3", "E2,1,4", "F2,1,5", "G2,1,6", "H2,1,7"},
        {"A3,2,0", "B3,2,1", "C3,2,2", "D3,2,3", "E3,2,4", "F3,2,5", "G3,2,6", "H3,2,7"},
        {"A4,3,0", "B4,3,1", "C4,3,2", "D4,3,3", "E4,3,4", "F4,3,5", "G4,3,6", "H4,3,7"},
        {"A5,4,0", "B5,4,1", "C5,4,2", "D5,4,3", "E5,4,4", "F5,4,5", "G5,4,6", "H5,4,7"},
        {"A6,5,0", "B6,5,1", "C6,5,2", "D6,5,3", "E6,5,4", "F6,5,5", "G6,5,6", "H6,5,7"},
        {"A7,6,0", "B7,6,1", "C7,6,2", "D7,6,3", "E7,6,4", "F7,6,5", "G7,6,6", "H7,6,7"},
        {"A8,7,0", "B8,7,1", "C8,7,2", "D8,7,3", "E8,7,4", "F8,7,5", "G8,7,6", "H8,7,7"},};

    public static void main(String[] args) {
        System.out.println("WHITE[5][5]:-->" + WHITE[5][5]);
        System.out.println("BLACK[5][5]:-->" + BLACK[5][5]);
        System.out.println("WHITE[3][4]:-->" + WHITE[3][4]);
        System.out.println("BLACK[3][4]:-->" + BLACK[3][4]);
    }
}
