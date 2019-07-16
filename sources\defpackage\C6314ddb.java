package defpackage;

/* renamed from: ddb reason: default package and case insensitive filesystem */
/* compiled from: Modality.kt */
public enum C6314ddb {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a f = null;

    /* renamed from: ddb$a */
    /* compiled from: Modality.kt */
    public static final class a {
        private a() {
        }

        public final C6314ddb a(boolean z, boolean z2) {
            if (z) {
                return C6314ddb.ABSTRACT;
            }
            if (z2) {
                return C6314ddb.OPEN;
            }
            return C6314ddb.FINAL;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        f = new a(null);
    }
}
