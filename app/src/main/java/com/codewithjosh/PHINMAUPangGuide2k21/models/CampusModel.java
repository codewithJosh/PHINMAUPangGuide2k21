package com.codewithjosh.PHINMAUPangGuide2k21.models;

public class CampusModel {

    int campus_image;
    String campus_name;

    public CampusModel(int campus_image, String campus_name) {
        this.campus_image = campus_image;
        this.campus_name = campus_name;
    }

    public int getCampus_image() {
        return campus_image;
    }

    public void setCampus_image(int campus_image) {
        this.campus_image = campus_image;
    }

    public String getCampus_name() {
        return campus_name;
    }

    public void setCampus_name(String campus_name) {
        this.campus_name = campus_name;
    }

}
