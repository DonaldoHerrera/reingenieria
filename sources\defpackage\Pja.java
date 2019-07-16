package defpackage;

/* renamed from: Pja reason: default package */
/* compiled from: NotificationChannelDsl.kt */
public final class Pja {
    public static final Qja a(_Xa<? super Qja, RVa> _xa) {
        C7471uYa.b(_xa, "channels");
        Qja qja = new Qja();
        _xa.invoke(qja);
        return qja;
    }

    public static final void a(Qja qja, C4542dka dka, _Xa<? super Gja, RVa> _xa) {
        C7471uYa.b(qja, "$this$group");
        C7471uYa.b(dka, "groupProvider");
        C7471uYa.b(_xa, "channelGroup");
        qja.a(dka.a());
        _xa.invoke(new Gja(qja, dka));
    }

    public static final void a(Gja gja, Uja uja) {
        C7471uYa.b(gja, "$this$channel");
        C7471uYa.b(uja, "channel");
        uja.a(gja.b().a());
        gja.a().a(uja.a());
    }
}
