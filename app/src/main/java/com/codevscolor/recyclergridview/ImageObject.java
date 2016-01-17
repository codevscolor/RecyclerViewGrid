package com.codevscolor.recyclergridview;

public class ImageObject {


    private String mName;
    private int mUrl;

    public ImageObject(int url,String name){

        this.mName = name;
        this.mUrl = url;
    }

    public String getTitle(){
        return this.mName;
    }

    public int getUrl(){
        return this.mUrl;
    }
}