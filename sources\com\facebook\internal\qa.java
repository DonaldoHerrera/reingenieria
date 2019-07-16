package com.facebook.internal;

/* compiled from: WorkQueue */
class qa implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ ra b;

    qa(ra raVar, b bVar) {
        this.b = raVar;
        this.a = bVar;
    }

    public void run() {
        try {
            this.a.b().run();
        } finally {
            this.b.b(this.a);
        }
    }
}
