package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
public class K extends O {
    private final List<C0720na> d = Collections.synchronizedList(new ArrayList());

    public K(String str, String str2, String str3) {
        super(str, str2, null);
    }

    /* access modifiers changed from: protected */
    public final void a(C0720na naVar) {
        this.d.add(naVar);
    }

    public void b() {
        synchronized (this.d) {
            for (C0720na a : this.d) {
                a.a(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final List<C0720na> d() {
        return this.d;
    }
}
