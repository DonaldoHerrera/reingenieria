package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends a> implements ShareModel {
    private final Bundle a;

    public static abstract class a<P extends ShareOpenGraphValueContainer, E extends a> implements c<P, E> {
        /* access modifiers changed from: private */
        public Bundle a = new Bundle();

        public E a(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        public E a(P p) {
            if (p != null) {
                this.a.putAll(p.a());
            }
            return this;
        }
    }

    protected ShareOpenGraphValueContainer(a<P, E> aVar) {
        this.a = (Bundle) aVar.a.clone();
    }

    public Object a(String str) {
        return this.a.get(str);
    }

    public String b(String str) {
        return this.a.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public Bundle a() {
        return (Bundle) this.a.clone();
    }

    public Set<String> b() {
        return this.a.keySet();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }
}
