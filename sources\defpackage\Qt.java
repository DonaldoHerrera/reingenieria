package defpackage;

import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: Qt reason: default package */
final class Qt implements Entry<String, Object> {
    private Object a;
    private final Ut b;
    private final /* synthetic */ Nt c;

    Qt(Nt nt, Ut ut, Object obj) {
        this.c = nt;
        this.b = ut;
        Pu.a(obj);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return ((String) getKey()).equals(entry.getKey()) && getValue().equals(entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        String b2 = this.b.b();
        return this.c.b.b() ? b2.toLowerCase(Locale.US) : b2;
    }

    public final Object getValue() {
        return this.a;
    }

    public final int hashCode() {
        return ((String) getKey()).hashCode() ^ getValue().hashCode();
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.a;
        Pu.a(obj);
        this.a = obj;
        this.b.a(this.c.a, obj);
        return obj2;
    }
}
