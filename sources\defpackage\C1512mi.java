package defpackage;

import android.os.Build;
import java.util.Map;

/* renamed from: mi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1512mi implements b {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Map f;
    final /* synthetic */ int g;
    final /* synthetic */ C1874yi h;

    C1512mi(C1874yi yiVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
        this.h = yiVar;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = map;
        this.g = i3;
    }

    public void a(Nh nh) throws Exception {
        C1606pj.a(nh, this.a, Build.MODEL, this.b, this.c, this.d, this.e, this.f, this.g, Build.MANUFACTURER, Build.PRODUCT);
    }
}
