package defpackage;

/* renamed from: WZa reason: default package */
/* compiled from: reflectLambda.kt */
public final class WZa {
    public static final <R> C7679xZa<R> a(C7537vVa<? extends R> vva) {
        C7471uYa.b(vva, "$this$reflect");
        EVa eVa = (EVa) vva.getClass().getAnnotation(EVa.class);
        if (eVa != null) {
            String[] d1 = eVa.d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                HVa b = C6936mnb.b(d1, eVa.d2());
                C6800knb knb = (C6800knb) b.a();
                Blb blb = (Blb) b.b();
                int[] mv = eVa.mv();
                if ((eVa.xi() & 8) == 0) {
                    z = false;
                }
                C6732jnb jnb = new C6732jnb(mv, z);
                Class cls = vva.getClass();
                C6799kmb w = blb.w();
                C7471uYa.a((Object) w, "proto.typeTable");
                C7684xdb xdb = (C7684xdb) C6312dbb.a(cls, blb, knb, new Jmb(w), jnb, VZa.e);
                if (xdb != null) {
                    return new W_a(XZa.d, xdb);
                }
            }
        }
        return null;
    }
}
