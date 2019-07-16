package defpackage;

/* renamed from: jba reason: default package and case insensitive filesystem */
/* compiled from: ExoPlayerProgressHandler.kt */
public final class C3797jba implements Runnable {
    final /* synthetic */ C3805kba a;

    C3797jba(C3805kba kba) {
        this.a = kba;
    }

    public void run() {
        this.a.a().d();
        C3805kba kba = this.a;
        kba.postDelayed(this, kba.b());
    }
}
