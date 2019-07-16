package com.soundcloud.android.offline;

import java.util.Set;

/* renamed from: com.soundcloud.android.offline.pa reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4144pa implements C7118pQa {
    private final /* synthetic */ Id a;

    public /* synthetic */ C4144pa(Id id) {
        this.a = id;
    }

    public final Object apply(Object obj) {
        Id id = this.a;
        OfflineContentService.a(id, (Set) obj);
        return id;
    }
}
