package defpackage;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: It reason: default package */
public final class It {
    private final Map<String, Ht> a = new Gt();
    private final Map<Field, Ht> b = new Gt();
    private final Object c;

    public It(Object obj) {
        this.c = obj;
    }

    public final void a() {
        for (Entry entry : this.a.entrySet()) {
            ((Map) this.c).put((String) entry.getKey(), ((Ht) entry.getValue()).a());
        }
        for (Entry entry2 : this.b.entrySet()) {
            Ut.a((Field) entry2.getKey(), this.c, ((Ht) entry2.getValue()).a());
        }
    }

    public final void a(Field field, Class<?> cls, Object obj) {
        Ht ht = (Ht) this.b.get(field);
        if (ht == null) {
            ht = new Ht(cls);
            this.b.put(field, ht);
        }
        if (cls == ht.a) {
            ht.b.add(obj);
            return;
        }
        throw new IllegalArgumentException();
    }
}
