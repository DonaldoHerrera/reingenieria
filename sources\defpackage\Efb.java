package defpackage;

/* renamed from: Efb reason: default package */
/* compiled from: LookupTracker.kt */
public interface Efb {

    /* renamed from: Efb$a */
    /* compiled from: LookupTracker.kt */
    public static final class a implements Efb {
        public static final a a = new a();

        private a() {
        }

        public void a(String str, Gfb gfb, String str2, Hfb hfb, String str3) {
            C7471uYa.b(str, "filePath");
            C7471uYa.b(gfb, "position");
            C7471uYa.b(str2, "scopeFqName");
            C7471uYa.b(hfb, "scopeKind");
            C7471uYa.b(str3, "name");
        }

        public boolean a() {
            return false;
        }
    }

    void a(String str, Gfb gfb, String str2, Hfb hfb, String str3);

    boolean a();
}
