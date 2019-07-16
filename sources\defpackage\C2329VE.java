package defpackage;

import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.f;
import com.google.firebase.components.q;
import java.util.Iterator;
import java.util.Set;

/* renamed from: VE reason: default package and case insensitive filesystem */
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class C2329VE implements C2402ZE {
    private final String a;
    private final C2347WE b;

    C2329VE(Set<C2365XE> set, C2347WE we) {
        this.a = a(set);
        this.b = we;
    }

    public static e<C2402ZE> b() {
        a a2 = e.a(C2402ZE.class);
        a2.a(q.c(C2365XE.class));
        a2.a(C2311UE.a());
        return a2.b();
    }

    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(a(this.b.b()));
        return sb.toString();
    }

    private static String a(Set<C2365XE> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2365XE xe = (C2365XE) it.next();
            sb.append(xe.a());
            sb.append('/');
            sb.append(xe.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    static /* synthetic */ C2402ZE a(f fVar) {
        return new C2329VE(fVar.b(C2365XE.class), C2347WE.a());
    }
}
