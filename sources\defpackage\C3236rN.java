package defpackage;

import com.soundcloud.android.properties.j;

/* renamed from: rN reason: default package and case insensitive filesystem */
/* compiled from: CrashReportingHelper.kt */
public class C3236rN {
    private final j a;
    private final boolean b;

    public C3236rN(j jVar, boolean z) {
        C7471uYa.b(jVar, "applicationProperties");
        this.a = jVar;
        this.b = z;
    }

    public boolean a() {
        return this.b;
    }

    public j b() {
        return this.a;
    }

    public boolean c() {
        return b().n() && a();
    }
}
