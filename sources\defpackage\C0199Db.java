package defpackage;

/* renamed from: Db reason: default package and case insensitive filesystem */
/* compiled from: SelfDestructiveThread */
class C0199Db implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ C0202Eb b;

    C0199Db(C0202Eb eb, Object obj) {
        this.b = eb;
        this.a = obj;
    }

    public void run() {
        this.b.c.a(this.a);
    }
}
