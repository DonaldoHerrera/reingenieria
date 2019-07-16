package defpackage;

import android.content.ContentValues;
import java.util.concurrent.Callable;

/* renamed from: tLa reason: default package and case insensitive filesystem */
/* compiled from: PropellerRx */
class C7389tLa implements Callable<EPa<? extends C5266RKa>> {
    final /* synthetic */ String a;
    final /* synthetic */ ContentValues b;
    final /* synthetic */ C7113pLa c;
    final /* synthetic */ C4898FLa d;

    C7389tLa(C4898FLa fLa, String str, ContentValues contentValues, C7113pLa pla) {
        this.d = fLa;
        this.a = str;
        this.b = contentValues;
        this.c = pla;
    }

    public APa<C5266RKa> call() {
        return C4898FLa.a(this.d.a.a(this.a, this.b, this.c));
    }
}
