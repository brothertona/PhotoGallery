package com.bignerdranch.android.photogallery;

/**
 * Created by andrew on 6/19/2015.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String toString(){
        return mCaption;
    }
    public String getPhotoPageUrl(){
        return "http://www.flickr.com/photos/" + mOwner + "/" + mId;
    }
}
