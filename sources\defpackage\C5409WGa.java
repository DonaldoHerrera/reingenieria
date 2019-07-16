package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* renamed from: WGa reason: default package and case insensitive filesystem */
/* compiled from: BugReporter.kt */
final class C5409WGa extends C7540vYa implements _Xa<Uri, RVa> {
    final /* synthetic */ C5322TGa a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Intent c;
    final /* synthetic */ Context d;
    final /* synthetic */ String e;

    C5409WGa(C5322TGa tGa, ArrayList arrayList, Intent intent, Context context, String str) {
        this.a = tGa;
        this.b = arrayList;
        this.c = intent;
        this.d = context;
        this.e = str;
        super(1);
    }

    public final void a(Uri uri) {
        C5322TGa tGa = this.a;
        ArrayList arrayList = this.b;
        C7471uYa.a((Object) uri, "uri");
        tGa.a(arrayList, uri);
        this.a.a(this.c, this.b);
        this.d.startActivity(Intent.createChooser(this.c, this.e));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Uri) obj);
        return RVa.a;
    }
}
