package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: bob reason: default package and case insensitive filesystem */
/* compiled from: SmallSortedMap */
class C5661bob extends C6393eob<FieldDescriptorType, Object> {
    C5661bob(int i) {
        super(i, null);
    }

    public void d() {
        if (!c()) {
            for (int i = 0; i < a(); i++) {
                Entry a = a(i);
                if (((a) a.getKey()).p()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : b()) {
                if (((a) entry.getKey()).p()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.a((a) obj, obj2);
    }
}
