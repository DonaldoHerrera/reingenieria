package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: Bx reason: default package */
final class Bx extends Cx<FieldDescriptorType, Object> {
    Bx(int i) {
        super(i, null);
    }

    public final void b() {
        if (!a()) {
            for (int i = 0; i < c(); i++) {
                Entry b = b(i);
                if (((C1918zw) b.getKey()).B()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : d()) {
                if (((C1918zw) entry.getKey()).B()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
