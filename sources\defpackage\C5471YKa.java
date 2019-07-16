package defpackage;

import android.content.ContentValues;

/* renamed from: YKa reason: default package and case insensitive filesystem */
/* compiled from: PropellerDatabase */
class C5471YKa extends a {
    final /* synthetic */ Iterable b;
    final /* synthetic */ C5116MLa c;
    final /* synthetic */ C5500ZKa d;

    C5471YKa(C5500ZKa zKa, Iterable iterable, C5116MLa mLa) {
        this.d = zKa;
        this.b = iterable;
        this.c = mLa;
    }

    public void b(C5500ZKa zKa) {
        for (ContentValues a : this.b) {
            a(this.d.c(this.c, a));
            if (a()) {
                zKa.b();
            } else {
                return;
            }
        }
    }
}
