package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2852h;
import java.util.Comparator;

/* renamed from: com.soundcloud.android.features.library.downloads.e reason: case insensitive filesystem */
/* compiled from: Comparisons.kt */
public final class C3571e<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return YWa.a(((C2852h) t2).b(), ((C2852h) t).b());
    }
}
