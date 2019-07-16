package defpackage;

import java.util.Map;

/* renamed from: deb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationDescriptor.kt */
public interface C6315deb {

    /* renamed from: deb$a */
    /* compiled from: AnnotationDescriptor.kt */
    public static final class a {
        public static C7349snb a(C6315deb deb) {
            C5029Jcb b = C7148pqb.b(deb);
            if (b == null) {
                return null;
            }
            if (C7154ptb.a((C5272Rcb) b)) {
                b = null;
            }
            if (b != null) {
                return C7148pqb.a((C5272Rcb) b);
            }
            return null;
        }
    }

    Map<C7694xnb, Npb<?>> a();

    C7822zdb getSource();

    C7706xtb getType();

    C7349snb q();
}
