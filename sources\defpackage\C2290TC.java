package defpackage;

import com.google.common.base.Preconditions;
import java.util.AbstractMap.SimpleImmutableEntry;

/* renamed from: TC reason: default package and case insensitive filesystem */
/* compiled from: RemovalNotification */
public final class C2290TC<K, V> extends SimpleImmutableEntry<K, V> {
    private final C2252RC a;

    private C2290TC(K k, V v, C2252RC rc) {
        super(k, v);
        Preconditions.checkNotNull(rc);
        this.a = rc;
    }

    public static <K, V> C2290TC<K, V> a(K k, V v, C2252RC rc) {
        return new C2290TC<>(k, v, rc);
    }
}
