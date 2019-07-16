package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kcb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
final class C6789kcb extends C7540vYa implements _Xa<C6450fdb, C5059Kbb> {
    public static final C6789kcb a = new C6789kcb();

    C6789kcb() {
        super(1);
    }

    /* renamed from: a */
    public final C5059Kbb invoke(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7349snb c = C6857lcb.b;
        C7471uYa.a((Object) c, "KOTLIN_FQ_NAME");
        List ra = fdb.a(c).ra();
        ArrayList arrayList = new ArrayList();
        for (Object next : ra) {
            if (next instanceof C5059Kbb) {
                arrayList.add(next);
            }
        }
        return (C5059Kbb) C7676xWa.f((List<? extends T>) arrayList);
    }
}
