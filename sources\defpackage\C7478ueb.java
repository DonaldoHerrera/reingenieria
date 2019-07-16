package defpackage;

import java.util.Collection;

/* renamed from: ueb reason: default package and case insensitive filesystem */
/* compiled from: AdditionalClassPartsProvider.kt */
public interface C7478ueb {

    /* renamed from: ueb$a */
    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class a implements C7478ueb {
        public static final a a = new a();

        private a() {
        }

        public Collection<C7684xdb> a(C7694xnb xnb, C5029Jcb jcb) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(jcb, "classDescriptor");
            return C6918mWa.a();
        }

        public Collection<C7706xtb> b(C5029Jcb jcb) {
            C7471uYa.b(jcb, "classDescriptor");
            return C6918mWa.a();
        }

        public Collection<C7694xnb> c(C5029Jcb jcb) {
            C7471uYa.b(jcb, "classDescriptor");
            return C6918mWa.a();
        }

        public Collection<C4997Icb> a(C5029Jcb jcb) {
            C7471uYa.b(jcb, "classDescriptor");
            return C6918mWa.a();
        }
    }

    Collection<C4997Icb> a(C5029Jcb jcb);

    Collection<C7684xdb> a(C7694xnb xnb, C5029Jcb jcb);

    Collection<C7706xtb> b(C5029Jcb jcb);

    Collection<C7694xnb> c(C5029Jcb jcb);
}
