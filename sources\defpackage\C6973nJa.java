package defpackage;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/view/collection/LegacyError;", "", "wrappedException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getWrappedException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: nJa reason: default package and case insensitive filesystem */
/* compiled from: LegacyUniflow.kt */
public final class C6973nJa {
    /* access modifiers changed from: private */
    public static final _Xa<Exception, C6973nJa> a = C6905mJa.a;
    public static final a b = new a(null);
    private final Exception c;

    /* renamed from: nJa$a */
    /* compiled from: LegacyUniflow.kt */
    public static final class a {
        private a() {
        }

        public final _Xa<Exception, C6973nJa> a() {
            return C6973nJa.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6973nJa(Exception exc) {
        C7471uYa.b(exc, "wrappedException");
        this.c = exc;
    }

    public final Exception b() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((defpackage.C6973nJa) r2).c) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6973nJa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Exception exc = this.c;
        if (exc != null) {
            return exc.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyError(wrappedException=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
