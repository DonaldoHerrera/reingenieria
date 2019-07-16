package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: okb reason: default package and case insensitive filesystem */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C7070okb implements b {
    private final ArrayList<Npb<?>> a = new ArrayList<>();
    final /* synthetic */ C7139pkb b;
    final /* synthetic */ C7694xnb c;

    C7070okb(C7139pkb pkb, C7694xnb xnb) {
        this.b = pkb;
        this.c = xnb;
    }

    public void a(Object obj) {
        this.a.add(this.b.b(this.c, obj));
    }

    public void a(C7280rnb rnb, C7694xnb xnb) {
        C7471uYa.b(rnb, "enumClassId");
        C7471uYa.b(xnb, "enumEntryName");
        this.a.add(new Spb(rnb, xnb));
    }

    public void a(Mpb mpb) {
        C7471uYa.b(mpb, "value");
        this.a.add(new Ypb(mpb));
    }

    public void a() {
        C5061Kdb a2 = C7411tgb.a(this.c, this.b.c);
        if (a2 != null) {
            HashMap a3 = this.b.a;
            C7694xnb xnb = this.c;
            Qpb qpb = Qpb.a;
            List a4 = C7089ovb.a(this.a);
            C7706xtb type = a2.getType();
            C7471uYa.a((Object) type, "parameter.type");
            a3.put(xnb, qpb.a(a4, type));
        }
    }
}
