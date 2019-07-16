package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.offline.xb reason: case insensitive filesystem */
/* compiled from: DefaultOfflinePropertiesProvider.kt */
final class C4190xb<T, R> implements C7118pQa<T, EPa<? extends R>> {
    public static final C4190xb a = new C4190xb();

    C4190xb() {
    }

    /* renamed from: a */
    public final APa<HVa<C3823mda, C3508cda>> apply(Entry<? extends C3823mda, ? extends Collection<C3508cda>> entry) {
        C7471uYa.b(entry, "entry");
        return APa.a((Iterable) entry.getValue()).h(new C4185wb(entry));
    }
}
