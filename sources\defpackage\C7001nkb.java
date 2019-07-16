package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nkb reason: default package and case insensitive filesystem */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C7001nkb implements a {
    private final /* synthetic */ a a;
    final /* synthetic */ C7139pkb b;
    final /* synthetic */ a c;
    final /* synthetic */ C7694xnb d;
    final /* synthetic */ ArrayList e;

    C7001nkb(C7139pkb pkb, a aVar, C7694xnb xnb, ArrayList arrayList) {
        this.b = pkb;
        this.c = aVar;
        this.d = xnb;
        this.e = arrayList;
        this.a = aVar;
    }

    public a a(C7694xnb xnb, C7280rnb rnb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(rnb, "classId");
        return this.a.a(xnb, rnb);
    }

    public b a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return this.a.a(xnb);
    }

    public void a() {
        this.c.a();
        this.b.a.put(this.d, new Hpb((C6315deb) C7676xWa.j((List<? extends T>) this.e)));
    }

    public void a(C7694xnb xnb, Mpb mpb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(mpb, "value");
        this.a.a(xnb, mpb);
    }

    public void a(C7694xnb xnb, Object obj) {
        this.a.a(xnb, obj);
    }

    public void a(C7694xnb xnb, C7280rnb rnb, C7694xnb xnb2) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(rnb, "enumClassId");
        C7471uYa.b(xnb2, "enumEntryName");
        this.a.a(xnb, rnb, xnb2);
    }
}
