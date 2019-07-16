package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lq reason: default package and case insensitive filesystem */
/* compiled from: HttpDataSource */
public interface C1489lq extends Zp {
    public static final Rq<String> b = Qp.a;

    /* renamed from: lq$a */
    /* compiled from: HttpDataSource */
    public static abstract class a implements b {
        private final f a = new f();

        /* access modifiers changed from: protected */
        public abstract C1489lq a(f fVar);

        public final C1489lq a() {
            return a(this.a);
        }
    }

    /* renamed from: lq$b */
    /* compiled from: HttpDataSource */
    public interface b extends defpackage.Zp.a {
    }

    /* renamed from: lq$c */
    /* compiled from: HttpDataSource */
    public static class c extends IOException {
        public final int a;
        public final C0470aq b;

        public c(String str, C0470aq aqVar, int i) {
            super(str);
            this.b = aqVar;
            this.a = i;
        }

        public c(IOException iOException, C0470aq aqVar, int i) {
            super(iOException);
            this.b = aqVar;
            this.a = i;
        }

        public c(String str, IOException iOException, C0470aq aqVar, int i) {
            super(str, iOException);
            this.b = aqVar;
            this.a = i;
        }
    }

    /* renamed from: lq$d */
    /* compiled from: HttpDataSource */
    public static final class d extends c {
        public final String c;

        public d(String str, C0470aq aqVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(str);
            super(sb.toString(), aqVar, 1);
            this.c = str;
        }
    }

    /* renamed from: lq$e */
    /* compiled from: HttpDataSource */
    public static final class e extends c {
        public final int c;
        public final String d;
        public final Map<String, List<String>> e;

        public e(int i, String str, Map<String, List<String>> map, C0470aq aqVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Response code: ");
            sb.append(i);
            super(sb.toString(), aqVar, 1);
            this.c = i;
            this.d = str;
            this.e = map;
        }
    }

    /* renamed from: lq$f */
    /* compiled from: HttpDataSource */
    public static final class f {
        private final Map<String, String> a = new HashMap();
        private Map<String, String> b;

        public synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }
}
