package com.codewithjosh.PHINMAUPangGuide2k21.models;

public class CampusModel {

    private int campus_image;
    private String campus_name;

    public CampusModel() {

    }

    public CampusModel(final int campus_image, final String campus_name) {

        this.campus_image = campus_image;
        this.campus_name = campus_name;

    }

    public int getCampus_image() {

        return campus_image;

    }

    public String getCampus_name() {

        return campus_name;

    }

}
