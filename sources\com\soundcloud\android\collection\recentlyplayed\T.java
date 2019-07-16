package com.soundcloud.android.collection.recentlyplayed;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
public final class T<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return YWa.a(Long.valueOf(((C2804ca) t2).i()), Long.valueOf(((C2804ca) t).i()));
    }
}
