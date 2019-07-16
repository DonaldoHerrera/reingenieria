package com.squareup.picasso;

/* renamed from: com.squareup.picasso.h reason: case insensitive filesystem */
/* compiled from: BitmapHunter */
class C6243h implements Runnable {
    final /* synthetic */ U a;

    C6243h(U u) {
        this.a = u;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.a.a());
        sb.append(" mutated input Bitmap but failed to recycle the original.");
        throw new IllegalStateException(sb.toString());
    }
}
