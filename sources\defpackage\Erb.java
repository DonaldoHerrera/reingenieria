package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Erb reason: default package */
/* compiled from: ProtoBasedClassDataFinder.kt */
public final class Erb implements C6399erb {
    private final Map<C7280rnb, C6458flb> a;
    private final Emb b;
    private final Bmb c;
    private final _Xa<C7280rnb, C7822zdb> d;

    public Erb(Klb klb, Emb emb, Bmb bmb, _Xa<? super C7280rnb, ? extends C7822zdb> _xa) {
        C7471uYa.b(klb, "proto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(bmb, "metadataVersion");
        C7471uYa.b(_xa, "classSource");
        this.b = emb;
        this.c = bmb;
        this.d = _xa;
        List m = klb.m();
        C7471uYa.a((Object) m, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) m, 10)), 16));
        for (Object next : m) {
            C6458flb flb = (C6458flb) next;
            Emb emb2 = this.b;
            C7471uYa.a((Object) flb, "klass");
            linkedHashMap.put(Drb.a(emb2, flb.s()), next);
        }
        this.a = linkedHashMap;
    }

    public final Collection<C7280rnb> a() {
        return this.a.keySet();
    }

    public C6331drb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        C6458flb flb = (C6458flb) this.a.get(rnb);
        if (flb != null) {
            return new C6331drb(this.b, flb, this.c, (C7822zdb) this.d.invoke(rnb));
        }
        return null;
    }
}
