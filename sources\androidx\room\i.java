package androidx.room;

/* compiled from: MultiInstanceInvalidationClient */
class i implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ j b;

    i(j jVar, String[] strArr) {
        this.b = jVar;
        this.a = strArr;
    }

    public void run() {
        this.b.a.d.a(this.a);
    }
}
