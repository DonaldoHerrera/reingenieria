package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: KLa reason: default package and case insensitive filesystem */
/* compiled from: BulkInsertValues */
public class C5054KLa {
    public final List<C5085LLa> a;
    public final List<List<?>> b;

    /* renamed from: KLa$a */
    /* compiled from: BulkInsertValues */
    public static class a {
        private final List<C5085LLa> a;
        private final List<List<?>> b;

        public a(List<C5085LLa> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Columns are missing.");
            }
            this.a = list;
            this.b = new ArrayList();
        }

        private void b(List<?> list) {
            if (list.size() != this.a.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value size [");
                sb.append(list.size());
                sb.append("] must have same size as columns [");
                sb.append(this.a.size());
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public a a(List<?> list) {
            b(list);
            this.b.add(list);
            return this;
        }

        public C5054KLa a() {
            return new C5054KLa(this.a, this.b);
        }
    }

    C5054KLa(List<C5085LLa> list, List<List<?>> list2) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }
}
