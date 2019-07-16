package defpackage;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "T", "", "()V", "Cached", "Found", "NotFound", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Found;", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Cached;", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$NotFound;", "domain"}, mv = {1, 1, 15})
/* renamed from: Pda reason: default package */
/* compiled from: SingleItemResponse.kt */
public abstract class Pda<T> {

    @EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0018*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Cached;", "T", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "item", "exception", "Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "(Ljava/lang/Object;Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;)V", "getException", "()Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;)Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Cached;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Pda$a */
    /* compiled from: SingleItemResponse.kt */
    public static final class a<T> extends Pda<T> {
        public static final C0074a a = new C0074a(null);
        private final T b;
        private final Kda c;

        /* renamed from: Pda$a$a reason: collision with other inner class name */
        /* compiled from: SingleItemResponse.kt */
        public static final class C0074a {
            private C0074a() {
            }

            public final <T> Pda<T> a(T t, Kda kda) {
                return new a(t, kda);
            }

            public /* synthetic */ C0074a(C7264rYa rya) {
                this();
            }
        }

        public a(T t, Kda kda) {
            super(null);
            this.b = t;
            this.c = kda;
        }

        public final T a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            T t = this.b;
            int i = 0;
            int hashCode = (t != null ? t.hashCode() : 0) * 31;
            Kda kda = this.c;
            if (kda != null) {
                i = kda.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cached(item=");
            sb.append(this.b);
            sb.append(", exception=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0013*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Found;", "T", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$Found;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Pda$b */
    /* compiled from: SingleItemResponse.kt */
    public static final class b<T> extends Pda<T> {
        public static final a a = new a(null);
        private final T b;

        /* renamed from: Pda$b$a */
        /* compiled from: SingleItemResponse.kt */
        public static final class a {
            private a() {
            }

            public final <T> Pda<T> a(T t) {
                return new b(t);
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public b(T t) {
            super(null);
            this.b = t;
        }

        public final T a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Pda.b) r2).b) != false) goto L_0x0015;
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
            T t = this.b;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Found(item=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0017*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0017B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse$NotFound;", "T", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "itemUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "exception", "Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;)V", "getException", "()Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "getItemUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Pda$c */
    /* compiled from: SingleItemResponse.kt */
    public static final class c<T> extends Pda<T> {
        public static final a a = new a(null);
        private final C3508cda b;
        private final Kda c;

        /* renamed from: Pda$c$a */
        /* compiled from: SingleItemResponse.kt */
        public static final class a {
            private a() {
            }

            public final <T> Pda<T> a(C3508cda cda, Kda kda) {
                C7471uYa.b(cda, "itemUrn");
                return new c(cda, kda);
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public c(C3508cda cda, Kda kda) {
            C7471uYa.b(cda, "itemUrn");
            super(null);
            this.b = cda;
            this.c = kda;
        }

        public final Kda a() {
            return this.c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.b;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            Kda kda = this.c;
            if (kda != null) {
                i = kda.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotFound(itemUrn=");
            sb.append(this.b);
            sb.append(", exception=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private Pda() {
    }

    public /* synthetic */ Pda(C7264rYa rya) {
        this();
    }
}
