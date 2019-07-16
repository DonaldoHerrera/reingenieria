package defpackage;

/* renamed from: krb reason: default package and case insensitive filesystem */
/* compiled from: DeserializationConfiguration.kt */
public interface C6807krb {

    /* renamed from: krb$a */
    /* compiled from: DeserializationConfiguration.kt */
    public static final class a implements C6807krb {
        public static final a a = new a();

        private a() {
        }

        public boolean a() {
            return b.d(this);
        }

        public boolean b() {
            return b.e(this);
        }

        public boolean c() {
            return b.c(this);
        }

        public boolean d() {
            return b.b(this);
        }

        public boolean e() {
            return b.a(this);
        }
    }

    /* renamed from: krb$b */
    /* compiled from: DeserializationConfiguration.kt */
    public static final class b {
        public static boolean a(C6807krb krb) {
            return false;
        }

        public static boolean b(C6807krb krb) {
            return false;
        }

        public static boolean c(C6807krb krb) {
            return false;
        }

        public static boolean d(C6807krb krb) {
            return true;
        }

        public static boolean e(C6807krb krb) {
            return true;
        }
    }

    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();
}
