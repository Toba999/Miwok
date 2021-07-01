package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioId;
    }

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;

    }

    public boolean hasImage() {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageRedourceId(){return mImageResourceId;}

    public int getAudioRedourceId(){return mAudioResourceId;}
}
