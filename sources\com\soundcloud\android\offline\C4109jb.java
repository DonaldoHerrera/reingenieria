package com.soundcloud.android.offline;

import com.google.common.base.Predicate;
import java.util.Collection;

/* renamed from: com.soundcloud.android.offline.jb reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4109jb implements Predicate {
    private final /* synthetic */ Collection a;

    public /* synthetic */ C4109jb(Collection collection) {
        this.a = collection;
    }

    public final boolean apply(Object obj) {
        return this.a.contains((C3508cda) obj);
    }
}
