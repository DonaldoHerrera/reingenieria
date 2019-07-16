package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.collections.data.ea;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.likes.c reason: case insensitive filesystem */
/* compiled from: LikeCleanupHelper.kt */
public final class C3973c extends Xda {
    private final String a = "Likes";
    private final K b;

    public C3973c(K k) {
        C7471uYa.b(k, "likesStorage");
        this.b = k;
    }

    public Set<C3508cda> b() {
        List<C2862s> a2 = this.b.a(ea.PLAYLIST);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C2862s a3 : a2) {
            arrayList.add(a3.a());
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> c() {
        List<C2862s> a2 = this.b.a(ea.TRACK);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C2862s a3 : a2) {
            arrayList.add(a3.a());
        }
        return C7676xWa.t(arrayList);
    }

    public String getKey() {
        return this.a;
    }
}
