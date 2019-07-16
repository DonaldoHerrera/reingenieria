package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/uniflow/android/EmptyStatus;", "", "()V", "Companion", "Error", "OK", "Waiting", "Lcom/soundcloud/android/uniflow/android/EmptyStatus$Waiting;", "Lcom/soundcloud/android/uniflow/android/EmptyStatus$OK;", "Lcom/soundcloud/android/uniflow/android/EmptyStatus$Error;", "uniflow-android_release"}, mv = {1, 1, 15})
/* renamed from: FEa reason: default package and case insensitive filesystem */
/* compiled from: EmptyStatus.kt */
public abstract class C4891FEa {
    public static final a a = new a(null);

    /* renamed from: FEa$a */
    /* compiled from: EmptyStatus.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final <ErrorType> C4891FEa a(ErrorType errortype, boolean z) {
            if (errortype != null) {
                return new b(errortype);
            }
            if (z) {
                return d.b;
            }
            return c.b;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: FEa$b */
    /* compiled from: EmptyStatus.kt */
    public static final class b<ErrorType> extends C4891FEa {
        private final ErrorType b;

        public b(ErrorType errortype) {
            super(null);
            this.b = errortype;
        }

        public final ErrorType a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.C4891FEa.b) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ErrorType errortype = this.b;
            if (errortype != null) {
                return errortype.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error(error=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: FEa$c */
    /* compiled from: EmptyStatus.kt */
    public static final class c extends C4891FEa {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: FEa$d */
    /* compiled from: EmptyStatus.kt */
    public static final class d extends C4891FEa {
        public static final d b = new d();

        private d() {
            super(null);
        }
    }

    private C4891FEa() {
    }

    public /* synthetic */ C4891FEa(C7264rYa rya) {
        this();
    }
}
