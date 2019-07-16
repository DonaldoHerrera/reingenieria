package defpackage;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: JZa reason: default package */
/* compiled from: KType.kt */
public final class JZa {
    /* access modifiers changed from: private */
    public static final JZa a = new JZa(null, null);
    public static final a b = new a(null);
    private final KZa c;
    private final HZa d;

    /* renamed from: JZa$a */
    /* compiled from: KType.kt */
    public static final class a {
        private a() {
        }

        public final JZa a() {
            return JZa.a;
        }

        public final JZa b(HZa hZa) {
            C7471uYa.b(hZa, C1325gg.TYPE);
            return new JZa(KZa.OUT, hZa);
        }

        public final JZa c(HZa hZa) {
            C7471uYa.b(hZa, C1325gg.TYPE);
            return new JZa(KZa.INVARIANT, hZa);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final JZa a(HZa hZa) {
            C7471uYa.b(hZa, C1325gg.TYPE);
            return new JZa(KZa.IN, hZa);
        }
    }

    public JZa(KZa kZa, HZa hZa) {
        this.c = kZa;
        this.d = hZa;
    }

    public final HZa b() {
        return this.d;
    }

    public final KZa c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JZa) {
                JZa jZa = (JZa) obj;
                if (C7471uYa.a((Object) this.c, (Object) jZa.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        KZa kZa = this.c;
        int i = 0;
        int hashCode = (kZa != null ? kZa.hashCode() : 0) * 31;
        HZa hZa = this.d;
        if (hZa != null) {
            i = hZa.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KTypeProjection(variance=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
