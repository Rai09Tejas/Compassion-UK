package com.example.android.compassion;

import java.util.Collection;

public class CardContent {

    private String mType;
    private String mText1;
    private String mText2;
    private String mCardBottom;
    private int mImgVidId;


    public CardContent(String type , String T1 , int resourceid){
        mType = type;
        mText1 = T1;
        mImgVidId = resourceid;
    }

    public CardContent(String type , String T1,String T2 , int resourceid){
        mType = type;
        mText1 = T1;
        mText2 = T2;
        mImgVidId = resourceid;
    }

    public CardContent(String type,String T1, String T2){
        mText1 = T1;
        mText2 = T2;
        mType = type;
    }
    public CardContent(String type , String T1 ){
        mType = type;
        mText1 = T1;
    }


    public String getType(){return mType;}
    public String getmText1(){return mText1;}
    public String getmText2(){return mText2;}
    public int getImgVidId(){return mImgVidId;}


}
