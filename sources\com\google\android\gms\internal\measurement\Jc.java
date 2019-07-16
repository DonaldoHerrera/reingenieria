package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class Jc extends Kc<FieldDescriptorType, Object> {
    Jc(int i) {
        super(i, null);
    }

    public final void b() {
        if (!a()) {
            for (int i = 0; i < c(); i++) {
                Entry b = b(i);
                if (((C1072yb) b.getKey()).A()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : d()) {
                if (((C1072yb) entry.getKey()).A()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
