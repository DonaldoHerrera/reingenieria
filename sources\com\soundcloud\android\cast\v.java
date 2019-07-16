package com.soundcloud.android.cast;

import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0637e;
import com.google.android.gms.cast.framework.C0638f;

/* compiled from: CastSessionController */
public class v extends G implements C0638f {
    private final C2733g a;
    private final C2732f b;

    v(C2733g gVar, C2732f fVar) {
        this.a = gVar;
        this.b = fVar;
    }

    public /* bridge */ /* synthetic */ void a(C0636d dVar, int i) {
        super.b(dVar, i);
    }

    public /* bridge */ /* synthetic */ void b(C0636d dVar, int i) {
        super.d(dVar, i);
    }

    public /* bridge */ /* synthetic */ void c(C0636d dVar, int i) {
        super.c(dVar, i);
    }

    public /* bridge */ /* synthetic */ void d(C0636d dVar, int i) {
        super.a(dVar, i);
    }

    public /* bridge */ /* synthetic */ void a(C0636d dVar) {
        super.b(dVar);
    }

    public /* bridge */ /* synthetic */ void b(C0636d dVar, String str) {
        super.b(dVar, str);
    }

    public void d(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (i != 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConnectionChange() for ");
        sb.append(C0637e.a(i));
        sb.append(" with: sessionConnected = [");
        sb.append(z2);
        sb.append("], castAvailable = [");
        sb.append(z);
        sb.append("]");
        a(sb.toString());
        this.b.a(z2, z);
    }

    public /* bridge */ /* synthetic */ void a(C0636d dVar, boolean z) {
        super.a(dVar, z);
    }

    public /* bridge */ /* synthetic */ void b(C0636d dVar) {
        super.a(dVar);
    }

    public /* bridge */ /* synthetic */ void a(C0636d dVar, String str) {
        super.a(dVar, str);
    }

    public void a() {
        this.a.a(this);
    }

    public void a(String str) {
        SDb.c(str, new Object[0]);
    }
}
