package defpackage;

import android.net.Uri;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hfa reason: default package */
/* compiled from: ApiRequest */
public class hfa {
    private final Uri a;
    private final String b;
    private final boolean c;
    private final C2215PD<String, String> d;
    private final Map<String, String> e;
    private final boolean f;
    private final a g;

    /* renamed from: hfa$a */
    /* compiled from: ApiRequest */
    protected enum a {
        PRIVATE("application/json; charset=utf-8"),
        PUBLIC("application/json"),
        NOT_SET("");
        
        private String e;

        private a(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    /* renamed from: hfa$b */
    /* compiled from: ApiRequest */
    public static class b {
        private final Uri a;
        private final String b;
        private boolean c;
        private final C2215PD<String, String> d;
        private final Map<String, String> e;
        private Object f;
        private List<lfa> g;
        private d h;
        private boolean i;
        private a j;

        public b(String str, String str2) {
            this(str, str2, false, a.NOT_SET);
        }

        public b a() {
            this.i = true;
            return this;
        }

        public hfa b() {
            Preconditions.checkNotNull(this.b);
            a aVar = this.j;
            if (aVar == a.NOT_SET) {
                throw new IllegalStateException("Must specify api mode");
            } else if (this.f != null) {
                gfa gfa = new gfa(this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, this.f, this.i, this.j);
                return gfa;
            } else if (this.g != null) {
                ffa ffa = new ffa(this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, this.g, this.h, this.i, this.j);
                return ffa;
            } else {
                hfa hfa = new hfa(this.a, this.b, this.c, this.d, this.e, this.i, aVar);
                return hfa;
            }
        }

        public b c() {
            this.c = true;
            this.j = a.PRIVATE;
            return this;
        }

        public b d() {
            this.c = false;
            this.j = a.PUBLIC;
            return this;
        }

        private b(String str, String str2, boolean z, a aVar) {
            this.d = ofa.a(str);
            this.a = Uri.parse(str).buildUpon().clearQuery().build();
            this.b = str2;
            this.e = new HashMap();
            this.i = z;
            this.j = aVar;
        }

        public b a(String str, Object... objArr) {
            for (Object obj : objArr) {
                this.d.put(str, obj.toString());
            }
            return this;
        }

        public b a(String str, C4928GKa<String> gKa) {
            gKa.a((C7733yKa<? super T>) new cfa<Object>(this, str));
            return this;
        }

        public /* synthetic */ void a(String str, String str2) {
            a(str, str2);
        }

        public b a(c cVar, Object... objArr) {
            return this.d.get(cVar.d).size() == 0 ? a(cVar.d, objArr) : this;
        }

        public b a(Object obj) {
            this.f = obj;
            return this;
        }

        public b a(lfa lfa) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(lfa);
            return this;
        }

        public b b(String str, String str2) {
            this.e.put(str, str2);
            return this;
        }

        public b a(d dVar) {
            this.h = dVar;
            return this;
        }
    }

    /* renamed from: hfa$c */
    /* compiled from: ApiRequest */
    public enum c {
        PAGE_SIZE("limit"),
        OAUTH_TOKEN("oauth_token");
        
        /* access modifiers changed from: private */
        public final String d;

        private c(String str) {
            this.d = str;
        }

        public String toString() {
            return this.d;
        }
    }

    /* renamed from: hfa$d */
    /* compiled from: ApiRequest */
    public interface d {
        void a(long j, long j2) throws IOException;
    }

    protected hfa(Uri uri, String str, boolean z, C2215PD<String, String> pd, Map<String, String> map, boolean z2, a aVar) {
        this.a = uri;
        Preconditions.checkNotNull(str);
        this.b = str;
        this.c = z;
        this.d = pd;
        this.e = map;
        this.f = z2;
        this.g = aVar;
    }

    public static b a(String str) {
        return new b(str, "DELETE");
    }

    public static b b(String str) {
        return new b(str, "GET");
    }

    public static b c(String str) {
        return new b(str, "POST");
    }

    public static b d(String str) {
        return new b(str, "PUT");
    }

    public C2215PD<String, String> e() {
        return this.d;
    }

    public Uri f() {
        return this.a;
    }

    public boolean g() {
        return this.c;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a().a("uri", (Object) this.a.toString()).a("httpMethod", (Object) this.b).a("isPrivate", this.c).toString();
    }

    public boolean a() {
        return this.f;
    }

    public String b() {
        return this.g.a();
    }

    public Map<String, String> c() {
        return Collections.unmodifiableMap(this.e);
    }

    public String d() {
        return this.b;
    }
}
