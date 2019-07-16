package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: EMa reason: default package and case insensitive filesystem */
/* compiled from: DaggerCollections */
public final class C4868EMa {
    static <T> HashSet<T> a(int i) {
        return new HashSet<>(d(i));
    }

    public static <K, V> LinkedHashMap<K, V> b(int i) {
        return new LinkedHashMap<>(d(i));
    }

    public static <T> List<T> c(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    private static int d(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
