package defpackage;

/* renamed from: cHa reason: default package and case insensitive filesystem */
/* compiled from: ConnectionChangePublisher.kt */
public class C5695cHa implements C6766kGa {
    private final C5327TLa a;

    public C5695cHa(C5327TLa tLa) {
        C7471uYa.b(tLa, "eventBus");
        this.a = tLa;
    }

    public C5327TLa a() {
        return this.a;
    }

    public void a(C6902mGa mga) {
        C7471uYa.b(mga, "connectionType");
        C5327TLa a2 = a();
        C5443XLa<C6902mGa> xLa = C3876taa.l;
        C7471uYa.a((Object) xLa, "EventQueue.NETWORK_CONNECTION_CHANGED");
        a2.c(xLa, mga);
    }
}
