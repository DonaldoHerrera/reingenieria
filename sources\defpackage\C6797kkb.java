package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: kkb reason: default package and case insensitive filesystem */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class C6797kkb implements d {
    final /* synthetic */ C6661ikb a;
    final /* synthetic */ HashMap b;
    final /* synthetic */ HashMap c;

    /* renamed from: kkb$a */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public final class a extends b implements e {
        final /* synthetic */ C6797kkb d;

        public a(C6797kkb kkb, Gkb gkb) {
            C7471uYa.b(gkb, "signature");
            this.d = kkb;
            super(kkb, gkb);
        }

        public defpackage.Dkb.a a(int i, C7280rnb rnb, C7822zdb zdb) {
            C7471uYa.b(rnb, "classId");
            C7471uYa.b(zdb, "source");
            Gkb a = Gkb.a.a(b(), i);
            List list = (List) this.d.b.get(a);
            if (list == null) {
                list = new ArrayList();
                this.d.b.put(a, list);
            }
            return this.d.a.b(rnb, zdb, list);
        }
    }

    /* renamed from: kkb$b */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public class b implements c {
        private final ArrayList<A> a = new ArrayList<>();
        private final Gkb b;
        final /* synthetic */ C6797kkb c;

        public b(C6797kkb kkb, Gkb gkb) {
            C7471uYa.b(gkb, "signature");
            this.c = kkb;
            this.b = gkb;
        }

        public defpackage.Dkb.a a(C7280rnb rnb, C7822zdb zdb) {
            C7471uYa.b(rnb, "classId");
            C7471uYa.b(zdb, "source");
            return this.c.a.b(rnb, zdb, (List<A>) this.a);
        }

        /* access modifiers changed from: protected */
        public final Gkb b() {
            return this.b;
        }

        public void a() {
            if (!this.a.isEmpty()) {
                this.c.b.put(this.b, this.a);
            }
        }
    }

    C6797kkb(C6661ikb ikb, HashMap hashMap, HashMap hashMap2) {
        this.a = ikb;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public e a(C7694xnb xnb, String str) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(str, "desc");
        defpackage.Gkb.a aVar = Gkb.a;
        String a2 = xnb.a();
        C7471uYa.a((Object) a2, "name.asString()");
        return new a(this, aVar.b(a2, str));
    }

    public c a(C7694xnb xnb, String str, Object obj) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(str, "desc");
        defpackage.Gkb.a aVar = Gkb.a;
        String a2 = xnb.a();
        C7471uYa.a((Object) a2, "name.asString()");
        Gkb a3 = aVar.a(a2, str);
        if (obj != null) {
            Object a4 = this.a.a(str, obj);
            if (a4 != null) {
                this.c.put(a3, a4);
            }
        }
        return new b(this, a3);
    }
}
