package com.soundcloud.android.offline;

import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.offline.pc reason: case insensitive filesystem */
/* compiled from: DownloadRequest */
public abstract class C4146pc implements Vca {
    public static final Function<C4146pc, C3508cda> a = C4095h.a;

    public abstract C3508cda a();

    public abstract C4928GKa<String> b();

    public abstract long f();

    public abstract long g();

    public abstract Ue h();

    public abstract String i();

    public abstract boolean j();

    public abstract boolean k();

    public static C4146pc a(C3508cda cda, C4928GKa<String> gKa, long j, String str, boolean z, boolean z2, long j2, Ue ue) {
        C4139ob obVar = new C4139ob(cda, gKa, j, str, z, z2, j2, ue);
        return obVar;
    }
}
