package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/libs/vault/network/NetworkFetchResult;", "Key", "Model", "", "()V", "Failure", "Success", "Lcom/soundcloud/android/libs/vault/network/NetworkFetchResult$Success;", "Lcom/soundcloud/android/libs/vault/network/NetworkFetchResult$Failure;", "vault"}, mv = {1, 1, 15})
/* renamed from: bga reason: default package and case insensitive filesystem */
/* compiled from: NetworkFetcher.kt */
public abstract class C3953bga<Key, Model> {

    /* renamed from: bga$a */
    /* compiled from: NetworkFetcher.kt */
    public static final class a<Key, Model> extends C3953bga<Key, Model> {
        private final C4538dga a;

        public a(C4538dga dga) {
            C7471uYa.b(dga, "exception");
            super(null);
            this.a = dga;
        }

        public final C4538dga a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3953bga.a) r2).a) != false) goto L_0x0015;
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
            C4538dga dga = this.a;
            if (dga != null) {
                return dga.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(exception=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: bga$b */
    /* compiled from: NetworkFetcher.kt */
    public static final class b<Key, Model> extends C3953bga<Key, Model> {
        private final C3945aga<Key, Model> a;

        public b(C3945aga<Key, Model> aga) {
            C7471uYa.b(aga, "response");
            super(null);
            this.a = aga;
        }

        public final C3945aga<Key, Model> a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3953bga.b) r2).a) != false) goto L_0x0015;
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
            C3945aga<Key, Model> aga = this.a;
            if (aga != null) {
                return aga.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(response=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3953bga() {
    }

    public /* synthetic */ C3953bga(C7264rYa rya) {
        this();
    }
}
