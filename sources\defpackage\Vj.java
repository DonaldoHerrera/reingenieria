package defpackage;

import android.content.Context;
import com.facebook.B;
import com.facebook.internal.C0542c;
import java.util.HashMap;
import java.util.Set;

/* renamed from: Vj reason: default package */
/* compiled from: AppEventCollection */
class Vj {
    private final HashMap<Qj, C1545nk> a = new HashMap<>();

    public synchronized void a(C1514mk mkVar) {
        if (mkVar != null) {
            for (Qj qj : mkVar.a()) {
                C1545nk b = b(qj);
                for (Uj a2 : mkVar.b(qj)) {
                    b.a(a2);
                }
            }
        }
    }

    public synchronized Set<Qj> b() {
        return this.a.keySet();
    }

    private synchronized C1545nk b(Qj qj) {
        C1545nk nkVar;
        nkVar = (C1545nk) this.a.get(qj);
        if (nkVar == null) {
            Context e = B.e();
            nkVar = new C1545nk(C0542c.a(e), C1237dk.a(e));
        }
        this.a.put(qj, nkVar);
        return nkVar;
    }

    public synchronized void a(Qj qj, Uj uj) {
        b(qj).a(uj);
    }

    public synchronized C1545nk a(Qj qj) {
        return (C1545nk) this.a.get(qj);
    }

    public synchronized int a() {
        int i;
        i = 0;
        for (C1545nk a2 : this.a.values()) {
            i += a2.a();
        }
        return i;
    }
}
