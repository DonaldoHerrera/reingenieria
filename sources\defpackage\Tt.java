package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: Tt reason: default package */
public class Tt extends AbstractMap<String, Object> implements Cloneable {
    Map<String, Object> a;
    final Mt b;

    /* renamed from: Tt$a */
    final class a extends AbstractSet<Entry<String, Object>> {
        private final St a;

        a() {
            this.a = (St) new Nt(Tt.this, Tt.this.b.b()).entrySet();
        }

        public final void clear() {
            Tt.this.a.clear();
            this.a.clear();
        }

        public final Iterator<Entry<String, Object>> iterator() {
            return new b(Tt.this, this.a);
        }

        public final int size() {
            return Tt.this.a.size() + this.a.size();
        }
    }

    /* renamed from: Tt$b */
    final class b implements Iterator<Entry<String, Object>> {
        private boolean a;
        private final Iterator<Entry<String, Object>> b;
        private final Iterator<Entry<String, Object>> c;

        b(Tt tt, St st) {
            this.b = (Pt) st.iterator();
            this.c = tt.a.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.b.hasNext() || this.c.hasNext();
        }

        public final /* synthetic */ Object next() {
            if (!this.a) {
                if (this.b.hasNext()) {
                    return (Entry) this.b.next();
                }
                this.a = true;
            }
            return (Entry) this.c.next();
        }

        public final void remove() {
            if (this.a) {
                this.c.remove();
            }
            this.b.remove();
        }
    }

    /* renamed from: Tt$c */
    public enum c {
        IGNORE_CASE
    }

    public Tt() {
        this(EnumSet.noneOf(c.class));
    }

    public Tt a(String str, Object obj) {
        Ut a2 = this.b.a(str);
        if (a2 != null) {
            a2.a((Object) this, obj);
        } else {
            if (this.b.b()) {
                str = str.toLowerCase(Locale.US);
            }
            this.a.put(str, obj);
        }
        return this;
    }

    /* renamed from: b */
    public final Object put(String str, Object obj) {
        Ut a2 = this.b.a(str);
        if (a2 != null) {
            Object a3 = a2.a((Object) this);
            a2.a((Object) this, obj);
            return a3;
        }
        if (this.b.b()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.a.put(str, obj);
    }

    public Set<Entry<String, Object>> entrySet() {
        return new a();
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        Ut a2 = this.b.a(str);
        if (a2 != null) {
            return a2.a((Object) this);
        }
        if (this.b.b()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.a.get(str);
    }

    /* renamed from: i */
    public Tt clone() {
        try {
            Tt tt = (Tt) super.clone();
            Ot.a((Object) this, (Object) tt);
            tt.a = (Map) Ot.a(this.a);
            return tt;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final Mt j() {
        return this.b;
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            a((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.b.a(str) == null) {
            if (this.b.b()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.a.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public Tt(EnumSet<c> enumSet) {
        this.a = new Gt();
        this.b = Mt.a(getClass(), enumSet.contains(c.IGNORE_CASE));
    }
}
