package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: qhb reason: default package and case insensitive filesystem */
/* compiled from: DeclaredMemberIndex.kt */
public interface C7205qhb {

    /* renamed from: qhb$a */
    /* compiled from: DeclaredMemberIndex.kt */
    public static final class a implements C7205qhb {
        public static final a a = new a();

        private a() {
        }

        public Rib b(C7694xnb xnb) {
            C7471uYa.b(xnb, "name");
            return null;
        }

        public Set<C7694xnb> b() {
            return SWa.a();
        }

        public List<Uib> a(C7694xnb xnb) {
            C7471uYa.b(xnb, "name");
            return C6918mWa.a();
        }

        public Set<C7694xnb> a() {
            return SWa.a();
        }
    }

    Collection<Uib> a(C7694xnb xnb);

    Set<C7694xnb> a();

    Rib b(C7694xnb xnb);

    Set<C7694xnb> b();
}
