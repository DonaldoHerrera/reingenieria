package com.soundcloud.android.foundation.ads;

import java.util.Comparator;

/* renamed from: com.soundcloud.android.foundation.ads.l reason: case insensitive filesystem */
/* compiled from: Comparisons.kt */
public final class C3685l<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return YWa.a(Double.valueOf(((T) t2).j()), Double.valueOf(((T) t).j()));
    }
}
