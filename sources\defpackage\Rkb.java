package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Rkb reason: default package */
/* compiled from: KotlinClassHeader.kt */
public final class Rkb {
    private final a a;
    private final C6732jnb b;
    private final C6528gnb c;
    private final String[] d;
    private final String[] e;
    private final String[] f;
    private final String g;
    private final int h;
    private final String i;

    /* renamed from: Rkb$a */
    /* compiled from: KotlinClassHeader.kt */
    public enum a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        /* access modifiers changed from: private */
        public static final Map<Integer, a> h = null;
        public static final C0150a i = null;
        private final int j;

        /* renamed from: Rkb$a$a reason: collision with other inner class name */
        /* compiled from: KotlinClassHeader.kt */
        public static final class C0150a {
            private C0150a() {
            }

            @NXa
            public final a a(int i) {
                a aVar = (a) a.h.get(Integer.valueOf(i));
                return aVar != null ? aVar : a.UNKNOWN;
            }

            public /* synthetic */ C0150a(C7264rYa rya) {
                this();
            }
        }

        static {
            int i2;
            i = new C0150a(null);
            a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(values.length), 16));
            for (a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.j), aVar);
            }
            h = linkedHashMap;
        }

        private a(int i2) {
            this.j = i2;
        }

        @NXa
        public static final a a(int i2) {
            return i.a(i2);
        }
    }

    public Rkb(a aVar, C6732jnb jnb, C6528gnb gnb, String[] strArr, String[] strArr2, String[] strArr3, String str, int i2, String str2) {
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(jnb, "metadataVersion");
        C7471uYa.b(gnb, "bytecodeVersion");
        this.a = aVar;
        this.b = jnb;
        this.c = gnb;
        this.d = strArr;
        this.e = strArr2;
        this.f = strArr3;
        this.g = str;
        this.h = i2;
        this.i = str2;
    }

    public final String[] a() {
        return this.d;
    }

    public final String[] b() {
        return this.e;
    }

    public final a c() {
        return this.a;
    }

    public final C6732jnb d() {
        return this.b;
    }

    public final String e() {
        String str = this.g;
        if (this.a == a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.d;
        List<String> list = null;
        if (!(this.a == a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C6374eWa.a((Object[]) strArr);
        }
        return list != null ? list : C6918mWa.a();
    }

    public final String[] g() {
        return this.f;
    }

    public final boolean h() {
        return (this.h & 2) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" version=");
        sb.append(this.b);
        return sb.toString();
    }
}
