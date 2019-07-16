package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;", "()V", "source", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaElement;", "RuntimeSourceElement", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: Gbb reason: default package and case insensitive filesystem */
/* compiled from: RuntimeSourceElementFactory.kt */
public final class C4934Gbb implements Dib {
    public static final C4934Gbb a = new C4934Gbb();

    /* renamed from: Gbb$a */
    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements Cib {
        private final C6817kwb a;

        public a(C6817kwb kwb) {
            C7471uYa.b(kwb, "javaElement");
            this.a = kwb;
        }

        public C4781Bdb a() {
            C4781Bdb bdb = C4781Bdb.a;
            C7471uYa.a((Object) bdb, "SourceFile.NO_SOURCE_FILE");
            return bdb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(a.class.getName());
            sb.append(": ");
            sb.append(c().toString());
            return sb.toString();
        }

        public C6817kwb c() {
            return this.a;
        }
    }

    private C4934Gbb() {
    }

    public Cib a(Pib pib) {
        C7471uYa.b(pib, "javaElement");
        return new a((C6817kwb) pib);
    }
}
