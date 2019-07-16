package defpackage;

/* renamed from: Zob reason: default package */
/* compiled from: DescriptorRenderer.kt */
public enum Zob {
    ;

    /* renamed from: Zob$a */
    /* compiled from: DescriptorRenderer.kt */
    static final class a extends Zob {
        a(String str, int i) {
            super(str, i, null);
        }

        public String a(String str) {
            C7471uYa.b(str, "string");
            return Cxb.a(Cxb.a(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* renamed from: Zob$b */
    /* compiled from: DescriptorRenderer.kt */
    static final class b extends Zob {
        b(String str, int i) {
            super(str, i, null);
        }

        public String a(String str) {
            C7471uYa.b(str, "string");
            return str;
        }
    }

    public abstract String a(String str);
}
