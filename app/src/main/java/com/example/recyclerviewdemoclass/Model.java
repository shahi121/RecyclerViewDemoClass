package com.example.recyclerviewdemoclass;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {

    public int image;
    public String title;
    public String description;

    public Model() {
    }

    public Model(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    protected Model(Parcel in) {
        image = in.readInt();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(description);
    }
}
