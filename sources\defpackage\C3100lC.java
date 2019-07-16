package defpackage;

import com.google.common.base.Function;
import java.util.concurrent.ExecutionException;

/* renamed from: lC reason: default package and case insensitive filesystem */
/* compiled from: LoadingCache */
public interface C3100lC<K, V> extends C2948dC<K, V>, Function<K, V> {
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;
}
