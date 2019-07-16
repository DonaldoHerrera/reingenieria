package com.soundcloud.android.discovery.systemplaylist;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.x reason: case insensitive filesystem */
/* compiled from: SystemPlaylistItem.kt */
public abstract class C3532x {
    private final C3508cda a;
    private final C3508cda b;
    private final String c;

    private C3532x(C3508cda cda, C3508cda cda2, String str) {
        this.a = cda;
        this.b = cda2;
        this.c = str;
    }

    public C3508cda a() {
        return this.b;
    }

    public C3508cda b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public /* synthetic */ C3532x(C3508cda cda, C3508cda cda2, String str, C7264rYa rya) {
        this(cda, cda2, str);
    }
}
