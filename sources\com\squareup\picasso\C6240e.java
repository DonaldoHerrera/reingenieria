package com.squareup.picasso;

/* renamed from: com.squareup.picasso.e reason: case insensitive filesystem */
/* compiled from: BitmapHunter */
class C6240e implements Runnable {
    final /* synthetic */ U a;
    final /* synthetic */ RuntimeException b;

    C6240e(U u, RuntimeException runtimeException) {
        this.a = u;
        this.b = runtimeException;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.a.a());
        sb.append(" crashed with exception.");
        throw new RuntimeException(sb.toString(), this.b);
    }
}
