package com.soundcloud.android.foundation.events;

import android.os.Parcel;

/* compiled from: Parcelers.kt */
public final class w implements Lxb<C3508cda> {
    public static final w a = new w();

    private w() {
    }

    public C3508cda a(Parcel parcel) {
        C7471uYa.b(parcel, "parcel");
        String readString = parcel.readString();
        if (!(readString == null || Cxb.a(readString))) {
            return new C3508cda(readString);
        }
        return null;
    }

    public void a(C3508cda cda, Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(cda != null ? cda.b() : null);
    }
}
