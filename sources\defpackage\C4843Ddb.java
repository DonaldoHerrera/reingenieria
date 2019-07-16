package defpackage;

import java.util.Collection;

/* renamed from: Ddb reason: default package and case insensitive filesystem */
/* compiled from: SupertypeLoopChecker.kt */
public interface C4843Ddb {

    /* renamed from: Ddb$a */
    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements C4843Ddb {
        public static final a a = new a();

        private a() {
        }

        public Collection<C7706xtb> a(Ptb ptb, Collection<? extends C7706xtb> collection, _Xa<? super Ptb, ? extends Iterable<? extends C7706xtb>> _xa, _Xa<? super C7706xtb, RVa> _xa2) {
            C7471uYa.b(ptb, "currentTypeConstructor");
            C7471uYa.b(collection, "superTypes");
            C7471uYa.b(_xa, "neighbors");
            C7471uYa.b(_xa2, "reportLoop");
            return collection;
        }
    }

    Collection<C7706xtb> a(Ptb ptb, Collection<? extends C7706xtb> collection, _Xa<? super Ptb, ? extends Iterable<? extends C7706xtb>> _xa, _Xa<? super C7706xtb, RVa> _xa2);
}
