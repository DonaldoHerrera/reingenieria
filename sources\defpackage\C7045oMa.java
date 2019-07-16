package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: oMa reason: default package and case insensitive filesystem */
/* compiled from: TableSet */
public final class C7045oMa extends AbstractSet<String> {
    private final String[] a;

    /* renamed from: oMa$a */
    /* compiled from: TableSet */
    private static final class a implements Iterator<String> {
        private final String[] a;
        private int b;

        a(String[] strArr) {
            this.a = strArr;
        }

        public boolean hasNext() {
            return this.b < this.a.length;
        }

        public String next() {
            String[] strArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return strArr[i];
        }
    }

    public C7045oMa(String... strArr) {
        this.a = strArr;
    }

    public boolean contains(Object obj) {
        for (String equals : this.a) {
            if (equals.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<String> iterator() {
        return new a(this.a);
    }

    public int size() {
        return this.a.length;
    }
}
