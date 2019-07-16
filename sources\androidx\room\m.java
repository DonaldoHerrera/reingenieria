package androidx.room;

/* compiled from: MultiInstanceInvalidationClient */
class m implements Runnable {
    final /* synthetic */ p a;

    m(p pVar) {
        this.a = pVar;
    }

    public void run() {
        p pVar = this.a;
        pVar.d.b(pVar.e);
    }
}
