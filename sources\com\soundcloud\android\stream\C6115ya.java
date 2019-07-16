package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.upsell.a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.soundcloud.android.stream.ya reason: case insensitive filesystem */
/* compiled from: StreamOperations.kt */
public class C6115ya {
    private final HPa a;
    private final C3700b b;
    private final C6097p c;
    private final a d;

    public C6115ya(HPa hPa, C3700b bVar, C6097p pVar, a aVar) {
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(pVar, "markPromotedItemAsStaleCommand");
        C7471uYa.b(aVar, "inlineUpsellOperations");
        this.a = hPa;
        this.b = bVar;
        this.c = pVar;
        this.d = aVar;
    }

    private C6109va b(List<? extends C6109va> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C6109va) obj).h()) {
                break;
            }
        }
        return (C6109va) obj;
    }

    public C6979nPa a(List<? extends C6109va> list) {
        C7471uYa.b(list, "streamItems");
        C6109va b2 = b(list);
        if (b2 != null) {
            C6979nPa a2 = a(b2);
            if (a2 != null) {
                return a2;
            }
        }
        C6979nPa e = C6979nPa.e();
        C7471uYa.a((Object) e, "Completable.complete()");
        return e;
    }

    private C6979nPa a(C6109va vaVar) {
        C3879tda f = vaVar.f();
        if (f == null || !f.e()) {
            return null;
        }
        C3855qda qda = (C3855qda) vaVar.e().d();
        if (qda != null) {
            C3700b bVar = this.b;
            C7471uYa.a((Object) qda, "it");
            bVar.a((J) a(qda));
        }
        f.d();
        return this.c.c(f.a()).b(this.a).h();
    }

    private Qaa a(C3855qda qda) {
        String str = "PromotedTrackingEvent.fo…s(), Screen.STREAM.get())";
        if (qda.a().u()) {
            Qaa b2 = Qaa.b(qda.a(), qda.t(), Yca.STREAM.a());
            C7471uYa.a((Object) b2, str);
            return b2;
        }
        Qaa d2 = Qaa.d(qda.a(), qda.t(), Yca.STREAM.a());
        C7471uYa.a((Object) d2, str);
        return d2;
    }

    public void a() {
        this.d.a();
    }
}
