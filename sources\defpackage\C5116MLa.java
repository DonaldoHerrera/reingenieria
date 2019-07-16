package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: MLa reason: default package and case insensitive filesystem */
/* compiled from: Table */
public interface C5116MLa {

    /* renamed from: MLa$a */
    /* compiled from: Table */
    public static final class a implements Iterable<String> {
        private final List<String> a;

        a(String... strArr) {
            this.a = Arrays.asList(strArr);
        }

        public static a a(String... strArr) {
            return new a(strArr);
        }

        public Iterator<String> iterator() {
            return this.a.iterator();
        }
    }

    a a();

    String name();
}
