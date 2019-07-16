package com.soundcloud.android.foundation.events;

import android.os.Parcel;

/* compiled from: Parcelers.kt */
public final class N implements Lxb<C3508cda> {
    public static final N a = new N();

    private N() {
    }

    public C3508cda a(Parcel parcel) {
        C7471uYa.b(parcel, "parcel");
        return new C3508cda(parcel.readString());
    }

    public void a(C3508cda cda, Parcel parcel, int i) {
        C7471uYa.b(cda, "$this$write");
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(cda.b());
    }
}
