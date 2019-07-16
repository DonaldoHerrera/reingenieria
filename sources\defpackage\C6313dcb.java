package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dcb reason: default package and case insensitive filesystem */
/* compiled from: FunctionClassDescriptor.kt */
final class C6313dcb extends C7540vYa implements _Xa<C7280rnb, RVa> {
    final /* synthetic */ b a;
    final /* synthetic */ ArrayList b;

    C6313dcb(b bVar, ArrayList arrayList) {
        this.a = bVar;
        this.b = arrayList;
        super(1);
    }

    public final void a(C7280rnb rnb) {
        C7471uYa.b(rnb, "id");
        C5029Jcb a2 = C5535_cb.a(C5649bcb.this.l.e(), rnb);
        if (a2 != null) {
            Ptb Q = a2.Q();
            C7471uYa.a((Object) Q, "descriptor.typeConstructor");
            List<C4905Fdb> e = C7676xWa.e(this.a.getParameters(), Q.getParameters().size());
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) e, 10));
            for (C4905Fdb z : e) {
                arrayList.add(new Utb(z.z()));
            }
            this.b.add(C7775ytb.a(C6723jeb.c.a(), a2, arrayList));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Built-in class ");
        sb.append(rnb);
        sb.append(" not found");
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C7280rnb) obj);
        return RVa.a;
    }
}
