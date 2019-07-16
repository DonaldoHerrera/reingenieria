package defpackage;

/* renamed from: web reason: default package and case insensitive filesystem */
/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface C7616web {

    /* renamed from: web$a */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements C7616web {
        public static final a a = new a();

        private a() {
        }

        public boolean a(C5029Jcb jcb, C7684xdb xdb) {
            C7471uYa.b(jcb, "classDescriptor");
            C7471uYa.b(xdb, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: web$b */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements C7616web {
        public static final b a = new b();

        private b() {
        }

        public boolean a(C5029Jcb jcb, C7684xdb xdb) {
            C7471uYa.b(jcb, "classDescriptor");
            C7471uYa.b(xdb, "functionDescriptor");
            return !xdb.getAnnotations().b(C7685xeb.a());
        }
    }

    boolean a(C5029Jcb jcb, C7684xdb xdb);
}
