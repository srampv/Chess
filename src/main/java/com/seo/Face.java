/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seo;

/**
 *
 * @author sramp
 */
public class Face {

    private String leftColor;
    private String rightColor;
    private String bottomColor;
    private String upColor;
    private String frontColor;
    private String backColor;
    private int faces;
    private boolean isCorner;

    public Face(int faces, String leftColor, String rightColor, String bottomColor, String upColor, String frontColor, String backColor) {
        this.faces = faces;
        this.isCorner = (faces == 3);
        this.leftColor = leftColor;
        this.rightColor = rightColor;
        this.bottomColor = bottomColor;
        this.upColor = upColor;
        this.frontColor = frontColor;
        this.backColor = backColor;
    }

    public String getFrontColor() {
        return frontColor;
    }

    public void setFrontColor(String frontColor) {
        this.frontColor = frontColor;
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    public String getLeftColor() {
        return leftColor;
    }

    public void setLeftColor(String leftColor) {
        this.leftColor = leftColor;
    }

    public String getRightColor() {
        return rightColor;
    }

    public void setRightColor(String rightColor) {
        this.rightColor = rightColor;
    }

    public String getBottomColor() {
        return bottomColor;
    }

    public void setBottomColor(String bottomColor) {
        this.bottomColor = bottomColor;
    }

    public String getUpColor() {
        return upColor;
    }

    public void setUpColor(String upColor) {
        this.upColor = upColor;
    }

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public boolean isIsCorner() {
        return isCorner;
    }

    public void setIsCorner(boolean isCorner) {
        this.isCorner = isCorner;
    }

}
