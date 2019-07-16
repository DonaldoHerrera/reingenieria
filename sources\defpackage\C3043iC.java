package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: iC reason: default package and case insensitive filesystem */
/* compiled from: CacheLoader */
public abstract class C3043iC<K, V> {

    /* renamed from: iC$a */
    /* compiled from: CacheLoader */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    protected C3043iC() {
    }

    public abstract V a(K k) throws Exception;

    public C3347xE<V> a(K k, V v) throws Exception {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        return C3267tE.a(a(k));
    }
}
