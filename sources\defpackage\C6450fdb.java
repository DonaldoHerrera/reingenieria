package defpackage;

import java.util.Collection;

/* renamed from: fdb reason: default package and case insensitive filesystem */
/* compiled from: ModuleDescriptor.kt */
public interface C6450fdb extends C5272Rcb {

    /* renamed from: fdb$a */
    /* compiled from: ModuleDescriptor.kt */
    public static final class a<T> {
        private final String a;

        public a(String str) {
            C7471uYa.b(str, "name");
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: fdb$b */
    /* compiled from: ModuleDescriptor.kt */
    public static final class b {
        public static C5272Rcb a(C6450fdb fdb) {
            return null;
        }

        public static <R, D> R a(C6450fdb fdb, C5332Tcb<R, D> tcb, D d) {
            C7471uYa.b(tcb, "visitor");
            return tcb.a(fdb, d);
        }
    }

    C5301Sbb E();

    Collection<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa);

    C7132pdb a(C7349snb snb);

    boolean a(C6450fdb fdb);
}
