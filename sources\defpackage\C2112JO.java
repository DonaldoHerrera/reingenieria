package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: JO reason: default package and case insensitive filesystem */
/* compiled from: PromotedAnalyticsProvider */
public class C2112JO extends C2109JL {
    private final C2428_L a;

    public C2112JO(C2428_L _l) {
        this.a = _l;
    }

    public void a(J j) {
        List list;
        if (j instanceof a) {
            list = a((a) j);
        } else if (j instanceof K) {
            K k = (K) j;
            list = k.o() != null ? k.o() : Collections.emptyList();
        } else {
            list = j instanceof C3506cba ? ((C3506cba) j).k() : j instanceof C3916yaa ? ((C3916yaa) j).j() : j instanceof C3425GZ ? ((C3425GZ) j).s() : j instanceof Qaa ? ((Qaa) j).s() : j instanceof C3434JZ ? ((C3434JZ) j).p() : j instanceof Paa ? ((Paa) j).i() : j instanceof Taa ? ((Taa) j).l() : Collections.emptyList();
        }
        a(j.e(), list);
    }

    public void flush() {
        this.a.a("promoted");
    }

    private List<String> a(a aVar) {
        if (aVar.u()) {
            return aVar.s();
        }
        return Collections.emptyList();
    }

    private void a(long j, List<String> list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                String str = "promoted";
                if (it.hasNext()) {
                    this.a.a(C2110JM.a(j, str, (String) it.next()));
                } else {
                    this.a.a(str);
                    return;
                }
            }
        }
    }
}
