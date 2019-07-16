package defpackage;

/* renamed from: n reason: default package and case insensitive filesystem */
/* compiled from: DrawableContainer */
class C1530n implements Runnable {
    final /* synthetic */ C1561o a;

    C1530n(C1561o oVar) {
        this.a = oVar;
    }

    public void run() {
        this.a.a(true);
        this.a.invalidateSelf();
    }
}
