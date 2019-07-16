package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: Qnb reason: default package */
/* compiled from: LazyField */
public class Qnb extends Rnb {
    private final Wnb e;

    /* renamed from: Qnb$a */
    /* compiled from: LazyField */
    static class a<K> implements Entry<K, Object> {
        private Entry<K, Qnb> a;

        public K getKey() {
            return this.a.getKey();
        }

        public Object getValue() {
            Qnb qnb = (Qnb) this.a.getValue();
            if (qnb == null) {
                return null;
            }
            return qnb.b();
        }

        public Object setValue(Object obj) {
            if (obj instanceof Wnb) {
                return ((Qnb) this.a.getValue()).c((Wnb) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private a(Entry<K, Qnb> entry) {
            this.a = entry;
        }
    }

    /* renamed from: Qnb$b */
    /* compiled from: LazyField */
    static class b<K> implements Iterator<Entry<K, Object>> {
        private Iterator<Entry<K, Object>> a;

        public b(Iterator<Entry<K, Object>> it) {
            this.a = it;
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public void remove() {
            this.a.remove();
        }

        public Entry<K, Object> next() {
            Entry<K, Object> entry = (Entry) this.a.next();
            return entry.getValue() instanceof Qnb ? new a(entry) : entry;
        }
    }

    public Wnb b() {
        return b(this.e);
    }

    public boolean equals(Object obj) {
        return b().equals(obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString();
    }
}
