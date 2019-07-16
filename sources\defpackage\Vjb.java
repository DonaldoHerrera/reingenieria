package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Vjb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Vjb extends C7540vYa implements C6308dYa<List<? extends C7349snb>, T, T> {
    final /* synthetic */ C6723jeb a;

    Vjb(C6723jeb jeb) {
        this.a = jeb;
        super(2);
    }

    /* renamed from: a */
    public final <T> T invoke(List<C7349snb> list, T t) {
        boolean z;
        C7471uYa.b(list, "$this$ifPresent");
        C7471uYa.b(t, "qualifier");
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.a.a((C7349snb) it.next()) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            return t;
        }
        return null;
    }
}
