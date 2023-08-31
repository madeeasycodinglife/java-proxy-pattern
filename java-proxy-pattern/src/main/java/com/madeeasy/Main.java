package com.madeeasy;

import com.madeeasy.impl.ImageProxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("image1.jpg");
        Image image2 = new ImageProxy("image2.jpg");

        image1.display(); // ImageProxy loads and displays image1.jpg
        image2.display(); // ImageProxy loads and displays image2.jpg
    }
}