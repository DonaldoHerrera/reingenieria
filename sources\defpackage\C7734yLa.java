package defpackage;

import android.content.ContentValues;
import java.util.concurrent.Callable;

/* renamed from: yLa reason: default package and case insensitive filesystem */
/* compiled from: PropellerRx */
class C7734yLa implements Callable<EPa<? extends C5413WKa>> {
    final /* synthetic */ String a;
    final /* synthetic */ ContentValues b;
    final /* synthetic */ C4898FLa c;

    C7734yLa(C4898FLa fLa, String str, ContentValues contentValues) {
        this.c = fLa;
        this.a = str;
        this.b = contentValues;
    }

    public APa<C5413WKa> call() {
        return C4898FLa.a(this.c.a.a(this.a, this.b));
    }
}
