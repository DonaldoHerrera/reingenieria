package com.google.android.gms.internal.firebase-perf;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.vc reason: case insensitive filesystem */
final class C0902vc extends C0906wc<FieldDescriptorType, Object> {
    C0902vc(int i) {
        super(i, null);
    }

    public final void b() {
        if (!a()) {
            for (int i = 0; i < c(); i++) {
                Entry b = b(i);
                if (((C0878pb) b.getKey()).z()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : d()) {
                if (((C0878pb) entry.getKey()).z()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
