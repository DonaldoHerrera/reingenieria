package defpackage;

/* renamed from: Yjb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Yjb extends C7540vYa implements _Xa<C4935Gcb, C7706xtb> {
    public static final Yjb a = new Yjb();

    Yjb() {
        super(1);
    }

    /* renamed from: a */
    public final C7706xtb invoke(C4935Gcb gcb) {
        C7471uYa.b(gcb, "it");
        C7615wdb l = gcb.l();
        if (l != null) {
            C7471uYa.a((Object) l, "it.extensionReceiverParameter!!");
            C7706xtb type = l.getType();
            C7471uYa.a((Object) type, "it.extensionReceiverParameter!!.type");
            return type;
        }
        C7471uYa.a();
        throw null;
    }
}
