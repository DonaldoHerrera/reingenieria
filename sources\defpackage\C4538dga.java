package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0007\bB\u0013\b\u0002\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/libs/vault/network/RepositoryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "Network", "Server", "Lcom/soundcloud/android/libs/vault/network/RepositoryException$Network;", "Lcom/soundcloud/android/libs/vault/network/RepositoryException$Server;", "vault"}, mv = {1, 1, 15})
/* renamed from: dga reason: default package and case insensitive filesystem */
/* compiled from: RepositoryException.kt */
public abstract class C4538dga extends Exception {
    private final Exception a;

    /* renamed from: dga$a */
    /* compiled from: RepositoryException.kt */
    public static final class a extends C4538dga {
        private final Exception b;

        public a(Exception exc) {
            C7471uYa.b(exc, "cause");
            super(exc, null);
            this.b = exc;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) getCause(), (java.lang.Object) ((defpackage.C4538dga.a) r2).getCause()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public Exception getCause() {
            return this.b;
        }

        public int hashCode() {
            Exception cause = getCause();
            if (cause != null) {
                return cause.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Network(cause=");
            sb.append(getCause());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: dga$b */
    /* compiled from: RepositoryException.kt */
    public static final class b extends C4538dga {
        private final Exception b;

        public b(Exception exc) {
            C7471uYa.b(exc, "cause");
            super(exc, null);
            this.b = exc;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) getCause(), (java.lang.Object) ((defpackage.C4538dga.b) r2).getCause()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public Exception getCause() {
            return this.b;
        }

        public int hashCode() {
            Exception cause = getCause();
            if (cause != null) {
                return cause.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Server(cause=");
            sb.append(getCause());
            sb.append(")");
            return sb.toString();
        }
    }

    private C4538dga(Exception exc) {
        this.a = exc;
    }

    public Exception getCause() {
        return this.a;
    }

    public /* synthetic */ C4538dga(Exception exc, C7264rYa rya) {
        this(exc);
    }
}
