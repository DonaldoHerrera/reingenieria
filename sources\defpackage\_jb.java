package defpackage;

/* renamed from: _jb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class _jb extends C7540vYa implements _Xa<C4935Gcb, C7706xtb> {
    final /* synthetic */ C5061Kdb a;

    _jb(C5061Kdb kdb) {
        this.a = kdb;
        super(1);
    }

    /* renamed from: a */
    public final C7706xtb invoke(C4935Gcb gcb) {
        C7471uYa.b(gcb, "it");
        Object obj = gcb.f().get(this.a.getIndex());
        C7471uYa.a(obj, "it.valueParameters[p.index]");
        C7706xtb type = ((C5061Kdb) obj).getType();
        C7471uYa.a((Object) type, "it.valueParameters[p.index].type");
        return type;
    }
}
