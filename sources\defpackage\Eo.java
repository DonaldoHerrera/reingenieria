package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.H;
import java.util.Collections;
import java.util.List;

/* renamed from: Eo reason: default package */
/* compiled from: TsPayloadReader */
public interface Eo {

    /* renamed from: Eo$a */
    /* compiled from: TsPayloadReader */
    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    /* renamed from: Eo$b */
    /* compiled from: TsPayloadReader */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.a = i;
            this.b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.c = list2;
            this.d = bArr;
        }
    }

    /* renamed from: Eo$c */
    /* compiled from: TsPayloadReader */
    public interface c {
        Eo a(int i, b bVar);

        SparseArray<Eo> a();
    }

    /* renamed from: Eo$d */
    /* compiled from: TsPayloadReader */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(this.d);
            this.e = sb.toString();
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }
    }

    void a();

    void a(Pq pq, int i) throws H;

    void a(Zq zq, C0498bn bnVar, d dVar);
}
