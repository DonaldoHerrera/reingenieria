package defpackage;

import java.util.Collection;

/* renamed from: Gqb reason: default package */
/* compiled from: ResolutionScope.kt */
public interface Gqb {

    /* renamed from: Gqb$a */
    /* compiled from: ResolutionScope.kt */
    public static final class a {
        public static /* synthetic */ Collection a(Gqb gqb, C7700xqb xqb, _Xa _xa, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    xqb = C7700xqb.l;
                }
                if ((i & 2) != 0) {
                    _xa = Eqb.b.a();
                }
                return gqb.a(xqb, _xa);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa);

    C5122Mcb b(C7694xnb xnb, Dfb dfb);
}
