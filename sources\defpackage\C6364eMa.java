package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: eMa reason: default package and case insensitive filesystem */
/* compiled from: QueryObservable */
public final class C6364eMa extends APa<c> {
    static final C7118pQa<APa<c>, C6364eMa> a = new C6296dMa();
    private final APa<c> b;

    public C6364eMa(APa<c> aPa) {
        this.b = aPa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super c> gPa) {
        this.b.a(gPa);
    }

    public final <T> APa<List<T>> o(C7118pQa<Cursor, T> pqa) {
        return a(c.a(pqa));
    }
}
