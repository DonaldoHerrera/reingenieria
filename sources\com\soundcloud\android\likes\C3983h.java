package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.L;
import com.soundcloud.android.collections.data.ga;
import com.soundcloud.android.sync.T;

/* renamed from: com.soundcloud.android.likes.h reason: case insensitive filesystem */
/* compiled from: LikeOperations.kt */
public class C3983h {
    /* access modifiers changed from: private */
    public final T a;
    private final HPa b;
    /* access modifiers changed from: private */
    public final L c;
    private final C7441tza d;

    public C3983h(T t, HPa hPa, L l, C7441tza tza) {
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(l, "likesWriteStorage");
        C7471uYa.b(tza, "likeCountWriter");
        this.a = t;
        this.b = hPa;
        this.c = l;
        this.d = tza;
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "targetUrn");
        ga gaVar = new ga(cda, z);
        C6979nPa e = a(gaVar).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3979f<Object,Object>(this, gaVar)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3981g<Object,Object>(this)).b(this.b).e();
        C7471uYa.a((Object) e, "updateLikeCount(params)\n…         .ignoreElement()");
        return e;
    }

    public VPa b(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "targetUrn");
        VPa g = a(cda, z).g();
        C7471uYa.a((Object) g, "toggleLike(targetUrn, addLike).subscribe()");
        return g;
    }

    private IPa<Integer> a(ga gaVar) {
        return this.d.a(gaVar);
    }
}
