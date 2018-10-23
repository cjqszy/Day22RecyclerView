package com.example.cln62.day22recyclerview;

public class MyDataClass {

    String title, subtitle, note;

    public MyDataClass(String title, String subtitle, String note) {
        this.title = title;
        this.subtitle = subtitle;
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
