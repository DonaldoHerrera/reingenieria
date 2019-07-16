package defpackage;

import java.util.Arrays;

/* renamed from: CKa reason: default package and case insensitive filesystem */
/* compiled from: MoreObjects */
public final class C4804CKa {

    /* renamed from: CKa$a */
    /* compiled from: MoreObjects */
    public static final class a {
        private final String a;
        private final C0140a b = new C0140a();
        private C0140a c = this.b;
        private boolean d;

        /* renamed from: CKa$a$a reason: collision with other inner class name */
        /* compiled from: MoreObjects */
        private static final class C0140a {
            String a;
            Object b;
            C0140a c;

            private C0140a() {
            }
        }

        a(String str) {
            if (str != null) {
                this.a = str;
                return;
            }
            throw new NullPointerException();
        }

        private C0140a b() {
            C0140a aVar = new C0140a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public a a() {
            this.d = true;
            return this;
        }

        public String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (C0140a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                if (!z || aVar.b != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public a a(String str, Object obj) {
            b(str, obj);
            return this;
        }

        private a b(String str, Object obj) {
            C0140a b2 = b();
            b2.b = obj;
            if (str != null) {
                b2.a = str;
                return this;
            }
            throw new NullPointerException();
        }

        public a a(String str, boolean z) {
            b(str, String.valueOf(z));
            return this;
        }

        public a a(String str, int i) {
            b(str, String.valueOf(i));
            return this;
        }

        public a a(String str, long j) {
            b(str, String.valueOf(j));
            return this;
        }
    }

    private C4804CKa() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(a(obj.getClass()));
    }

    public static a a(String str) {
        return new a(str);
    }

    static String a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }
}
