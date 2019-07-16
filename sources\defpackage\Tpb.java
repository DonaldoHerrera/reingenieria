package defpackage;

/* renamed from: Tpb reason: default package */
/* compiled from: constantValues.kt */
public abstract class Tpb extends Npb<RVa> {
    public static final a b = new a(null);

    /* renamed from: Tpb$a */
    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public final Tpb a(String str) {
            C7471uYa.b(str, "message");
            return new b(str);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: Tpb$b */
    /* compiled from: constantValues.kt */
    public static final class b extends Tpb {
        private final String c;

        public b(String str) {
            C7471uYa.b(str, "message");
            this.c = str;
        }

        public String toString() {
            return this.c;
        }

        public Etb a(C6450fdb fdb) {
            C7471uYa.b(fdb, "module");
            Etb c2 = C7154ptb.c(this.c);
            C7471uYa.a((Object) c2, "ErrorUtils.createErrorType(message)");
            return c2;
        }
    }

    public Tpb() {
        super(RVa.a);
    }

    public RVa a() {
        throw new UnsupportedOperationException();
    }
}
