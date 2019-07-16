package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nua reason: default package and case insensitive filesystem */
/* compiled from: FabricReporter */
public class C7017nua implements C3824mea {
    private final List<C1387ih> a = new ArrayList();

    private static C1387ih b(C3816lea lea) {
        C1387ih ihVar = new C1387ih(lea.b());
        for (C3808kea kea : lea.a()) {
            if (kea.b() instanceof Number) {
                ihVar.a(kea.a(), (Number) kea.b());
            } else {
                ihVar.a(kea.a(), kea.b().toString());
            }
        }
        return ihVar;
    }

    public void a(C3816lea lea) {
        synchronized (this.a) {
            this.a.add(b(lea));
            if (C5328TMa.h()) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    Rg.L().a((C1387ih) it.next());
                    it.remove();
                }
            }
        }
    }
}
