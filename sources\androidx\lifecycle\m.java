package androidx.lifecycle;

/* compiled from: LiveData */
class m implements Runnable {
    final /* synthetic */ LiveData a;

    m(LiveData liveData) {
        this.a = liveData;
    }

    public void run() {
        Object obj;
        synchronized (this.a.b) {
            obj = this.a.f;
            this.a.f = LiveData.a;
        }
        this.a.b(obj);
    }
}
