package com.squareup.picasso;

/* compiled from: Picasso */
class F implements Runnable {
    final /* synthetic */ Exception a;
    final /* synthetic */ b b;

    F(b bVar, Exception exc) {
        this.b = bVar;
        this.a = exc;
    }

    public void run() {
        throw new RuntimeException(this.a);
    }
}
