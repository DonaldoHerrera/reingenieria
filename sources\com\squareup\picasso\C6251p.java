package com.squareup.picasso;

import android.os.Message;

/* renamed from: com.squareup.picasso.p reason: case insensitive filesystem */
/* compiled from: Dispatcher */
class C6251p implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ a b;

    C6251p(a aVar, Message message) {
        this.b = aVar;
        this.a = message;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown handler message received: ");
        sb.append(this.a.what);
        throw new AssertionError(sb.toString());
    }
}
