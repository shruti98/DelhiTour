package com.example.android.project3_tourism;

public class Names {

    private String name;
    private int ImageResourseId;

    public Names(String sight_name, int imageResourceId) {
        name = sight_name;
        ImageResourseId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourseId() {
        return ImageResourseId;
    }

}
