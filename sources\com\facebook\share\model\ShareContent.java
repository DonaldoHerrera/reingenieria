package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {
    private final Uri a;
    private final List<String> b;
    private final String c;
    private final String d;
    private final String e;
    private final ShareHashtag f;

    protected ShareContent(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = a(parcel);
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        a aVar = new a();
        aVar.a(parcel);
        this.f = aVar.a();
    }

    public Uri a() {
        return this.a;
    }

    public ShareHashtag b() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, 0);
    }

    private List<String> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
