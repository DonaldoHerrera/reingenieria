package com.squareup.picasso;

/* renamed from: com.squareup.picasso.g reason: case insensitive filesystem */
/* compiled from: BitmapHunter */
class C6242g implements Runnable {
    final /* synthetic */ U a;

    C6242g(U u) {
        this.a = u;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.a.a());
        sb.append(" returned input Bitmap but recycled it.");
        throw new IllegalStateException(sb.toString());
    }
}
