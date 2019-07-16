package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.fb reason: case insensitive filesystem */
final class C0753fb extends C0750eb<FieldDescriptorType, Object> {
    C0753fb(int i) {
        super(i, null);
    }

    public final void e() {
        if (!a()) {
            for (int i = 0; i < b(); i++) {
                Entry b = b(i);
                if (((C0737aa) b.getKey()).o()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : c()) {
                if (((C0737aa) entry.getKey()).o()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
