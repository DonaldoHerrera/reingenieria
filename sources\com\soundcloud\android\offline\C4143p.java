package com.soundcloud.android.offline;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.soundcloud.android.offline.p reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4143p implements Comparator {
    private final /* synthetic */ C4163sc a;
    private final /* synthetic */ Map b;

    public /* synthetic */ C4143p(C4163sc scVar, Map map) {
        this.a = scVar;
        this.b = map;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.a(this.b, (Eda) obj, (Eda) obj2);
    }
}
