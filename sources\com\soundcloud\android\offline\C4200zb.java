package com.soundcloud.android.offline;

import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.offline.zb reason: case insensitive filesystem */
/* compiled from: DefaultOfflinePropertiesProvider.kt */
final class C4200zb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4180vb a;

    C4200zb(C4180vb vbVar) {
        this.a = vbVar;
    }

    /* renamed from: a */
    public final IPa<Map<C3508cda, C3823mda>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.a(list);
    }
}
