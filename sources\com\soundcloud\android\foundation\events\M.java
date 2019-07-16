package com.soundcloud.android.foundation.events;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Parcelers.kt */
public final class M implements Lxb<List<? extends C3508cda>> {
    public static final M a = new M();

    private M() {
    }

    public List<C3508cda> a(Parcel parcel) {
        C7471uYa.b(parcel, "parcel");
        String[] createStringArray = parcel.createStringArray();
        C7471uYa.a((Object) createStringArray, "parcel.createStringArray()");
        ArrayList arrayList = new ArrayList(createStringArray.length);
        for (String cda : createStringArray) {
            arrayList.add(new C3508cda(cda));
        }
        return arrayList;
    }

    public void a(List<C3508cda> list, Parcel parcel, int i) {
        C7471uYa.b(list, "$this$write");
        C7471uYa.b(parcel, "parcel");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3508cda b : list) {
            arrayList.add(b.b());
        }
        parcel.writeStringList(arrayList);
    }
}
