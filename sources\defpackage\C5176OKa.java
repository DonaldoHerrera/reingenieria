package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: OKa reason: default package and case insensitive filesystem */
/* compiled from: Joiner */
public class C5176OKa {
    /* access modifiers changed from: private */
    public final String a;

    C5176OKa(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException();
    }

    public <A extends Appendable> A a(A a2, Iterator<?> it) throws IOException {
        if (a2 != null) {
            if (it.hasNext()) {
                a2.append(a(it.next()));
                while (it.hasNext()) {
                    a2.append(this.a);
                    a2.append(a(it.next()));
                }
            }
            return a2;
        }
        throw new NullPointerException();
    }

    public final StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(Iterable<?> iterable) {
        return a(iterable.iterator());
    }

    public final String a(Iterator<?> it) {
        return a(new StringBuilder(), it).toString();
    }

    public final String a(Object[] objArr) {
        return a((Iterable<?>) Arrays.asList(objArr));
    }

    /* access modifiers changed from: 0000 */
    public CharSequence a(Object obj) {
        if (obj != null) {
            return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
        }
        throw new NullPointerException();
    }
}
