package com.soundcloud.android.utilities.android;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FiletimeComparator */
public class g implements Comparator<File> {
    private final Map<File, Long> a = new HashMap();
    private final boolean b;

    public g(boolean z) {
        this.b = z;
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        if (this.b) {
            return a(file, this.a).compareTo(a(file2, this.a));
        }
        return a(file2, this.a).compareTo(a(file, this.a));
    }

    private static Long a(File file, Map<File, Long> map) {
        Long l = (Long) map.get(file);
        if (l != null) {
            return l;
        }
        long lastModified = file.lastModified();
        map.put(file, Long.valueOf(lastModified));
        return Long.valueOf(lastModified);
    }
}
