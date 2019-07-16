package defpackage;

import java.util.List;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "T", "", "()V", "Failure", "Partial", "Success", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Success;", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Partial;", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Failure;", "domain"}, mv = {1, 1, 15})
/* renamed from: Ida reason: default package */
/* compiled from: ListResponse.kt */
public abstract class Ida<T> {

    @EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0012*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Failure;", "T", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "exception", "Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "(Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;)V", "getException", "()Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Ida$a */
    /* compiled from: ListResponse.kt */
    public static final class a<T> extends Ida<T> {
        public static final C0072a a = new C0072a(null);
        private final Kda b;

        /* renamed from: Ida$a$a reason: collision with other inner class name */
        /* compiled from: ListResponse.kt */
        public static final class C0072a {
            private C0072a() {
            }

            public /* synthetic */ C0072a(C7264rYa rya) {
                this();
            }
        }

        public final Kda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Ida.a) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Kda kda = this.b;
            if (kda != null) {
                return kda.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(exception=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001b*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001bB-\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Partial;", "T", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "found", "", "missing", "Lcom/soundcloud/android/foundation/domain/Urn;", "exception", "Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "(Ljava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;)V", "getException", "()Lcom/soundcloud/android/foundation/domain/repository/RepositoryException;", "getFound", "()Ljava/util/List;", "getMissing", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Ida$b */
    /* compiled from: ListResponse.kt */
    public static final class b<T> extends Ida<T> {
        public static final a a = new a(null);
        private final List<T> b;
        private final List<C3508cda> c;
        private final Kda d;

        /* renamed from: Ida$b$a */
        /* compiled from: ListResponse.kt */
        public static final class a {
            private a() {
            }

            public final <T> Ida<T> a(List<? extends T> list, List<C3508cda> list2, Kda kda) {
                C7471uYa.b(list, "found");
                C7471uYa.b(list2, "missing");
                return new b(list, list2, kda);
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public b(List<? extends T> list, List<C3508cda> list2, Kda kda) {
            C7471uYa.b(list, "found");
            C7471uYa.b(list2, "missing");
            super(null);
            this.b = list;
            this.c = list2;
            this.d = kda;
        }

        public final Kda a() {
            return this.d;
        }

        public final List<T> b() {
            return this.b;
        }

        public final List<C3508cda> c() {
            return this.c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<T> list = this.b;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C3508cda> list2 = this.c;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            Kda kda = this.d;
            if (kda != null) {
                i = kda.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Partial(found=");
            sb.append(this.b);
            sb.append(", missing=");
            sb.append(this.c);
            sb.append(", exception=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0012*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/foundation/domain/repository/ListResponse$Success;", "T", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "items", "", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "domain"}, mv = {1, 1, 15})
    /* renamed from: Ida$c */
    /* compiled from: ListResponse.kt */
    public static final class c<T> extends Ida<T> {
        public static final a a = new a(null);
        private final List<T> b;

        /* renamed from: Ida$c$a */
        /* compiled from: ListResponse.kt */
        public static final class a {
            private a() {
            }

            public final <T> Ida<T> a(List<? extends T> list) {
                C7471uYa.b(list, "items");
                return new c(list);
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public c(List<? extends T> list) {
            C7471uYa.b(list, "items");
            super(null);
            this.b = list;
        }

        public final List<T> a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Ida.c) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<T> list = this.b;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(items=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private Ida() {
    }

    public /* synthetic */ Ida(C7264rYa rya) {
        this();
    }
}
