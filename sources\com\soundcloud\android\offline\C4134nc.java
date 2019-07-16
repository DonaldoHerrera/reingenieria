package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.soundcloud.android.offline.nc reason: case insensitive filesystem */
/* compiled from: DownloadQueue */
final class C4134nc {
    private final LinkedList<C4146pc> a = new LinkedList<>();

    C4134nc() {
    }

    /* access modifiers changed from: 0000 */
    public void a(Collection<C4146pc> collection) {
        this.a.clear();
        this.a.addAll(collection);
    }

    /* access modifiers changed from: 0000 */
    public List<C4146pc> b() {
        return Collections.unmodifiableList(this.a);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.a.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public C4146pc d() {
        return (C4146pc) this.a.poll();
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return this.a.size();
    }

    /* access modifiers changed from: 0000 */
    public C4146pc a() {
        return (C4146pc) this.a.getFirst();
    }
}
