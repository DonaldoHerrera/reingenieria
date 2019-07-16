package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: pkb reason: default package and case insensitive filesystem */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C7139pkb implements a {
    /* access modifiers changed from: private */
    public final HashMap<C7694xnb, Npb<?>> a = new HashMap<>();
    final /* synthetic */ C7208qkb b;
    final /* synthetic */ C5029Jcb c;
    final /* synthetic */ List d;
    final /* synthetic */ C7822zdb e;

    C7139pkb(C7208qkb qkb, C5029Jcb jcb, List list, C7822zdb zdb) {
        this.b = qkb;
        this.c = jcb;
        this.d = list;
        this.e = zdb;
    }

    /* access modifiers changed from: private */
    public final Npb<?> b(C7694xnb xnb, Object obj) {
        Npb<?> a2 = Qpb.a.a(obj);
        if (a2 != null) {
            return a2;
        }
        a aVar = Tpb.b;
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported annotation argument: ");
        sb.append(xnb);
        return aVar.a(sb.toString());
    }

    public void a(C7694xnb xnb, Object obj) {
        if (xnb != null) {
            this.a.put(xnb, b(xnb, obj));
        }
    }

    public void a(C7694xnb xnb, Mpb mpb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(mpb, "value");
        this.a.put(xnb, new Ypb(mpb));
    }

    public void a(C7694xnb xnb, C7280rnb rnb, C7694xnb xnb2) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(rnb, "enumClassId");
        C7471uYa.b(xnb2, "enumEntryName");
        this.a.put(xnb, new Spb(rnb, xnb2));
    }

    public b a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return new C7070okb(this, xnb);
    }

    public a a(C7694xnb xnb, C7280rnb rnb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(rnb, "classId");
        ArrayList arrayList = new ArrayList();
        C7208qkb qkb = this.b;
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        a a2 = qkb.a(rnb, zdb, arrayList);
        if (a2 != null) {
            return new C7001nkb(this, a2, xnb, arrayList);
        }
        C7471uYa.a();
        throw null;
    }

    public void a() {
        this.d.add(new C6383eeb(this.c.z(), this.a, this.e));
    }
}
