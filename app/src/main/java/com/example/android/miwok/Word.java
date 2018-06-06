package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId;
    private int mediaResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int mediaResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = -1;
        this.mediaResourceId = mediaResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mediaResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.mediaResourceId = mediaResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return this.imageResourceId != -1;
    }

    public int getMediaResourceId() {
        return mediaResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", mediaResourceId=" + mediaResourceId +
                '}';
    }
}
