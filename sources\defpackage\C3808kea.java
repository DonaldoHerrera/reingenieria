package defpackage;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/foundation/events/technical/DataPoint;", "T", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/soundcloud/android/foundation/events/technical/DataPoint;", "equals", "", "other", "hashCode", "", "toString", "Companion", "events_release"}, mv = {1, 1, 15})
/* renamed from: kea reason: default package and case insensitive filesystem */
/* compiled from: DataPoint.kt */
public final class C3808kea<T> {
    public static final a a = new a(null);
    private final String b;
    private final T c;

    /* renamed from: kea$a */
    /* compiled from: DataPoint.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C3808kea<Number> a(String str, Number number) {
            C7471uYa.b(str, "key");
            C7471uYa.b(number, "value");
            return new C3808kea<>(str, number);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final C3808kea<String> a(String str, String str2) {
            C7471uYa.b(str, "key");
            C7471uYa.b(str2, "value");
            return new C3808kea<>(str, str2);
        }
    }

    public C3808kea(String str, T t) {
        C7471uYa.b(str, "key");
        this.b = str;
        this.c = t;
    }

    @NXa
    public static final C3808kea<Number> a(String str, Number number) {
        return a.a(str, number);
    }

    @NXa
    public static final C3808kea<String> a(String str, String str2) {
        return a.a(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final T b() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3808kea) {
                C3808kea kea = (C3808kea) obj;
                if (C7471uYa.a((Object) this.b, (Object) kea.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.c;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataPoint(key=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
