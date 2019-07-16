package defpackage;

/* renamed from: Sm reason: default package */
/* compiled from: SimpleDecoder */
class Sm extends Thread {
    final /* synthetic */ Tm a;

    Sm(Tm tm) {
        this.a = tm;
    }

    public void run() {
        this.a.i();
    }
}
