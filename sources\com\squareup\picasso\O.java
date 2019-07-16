package com.squareup.picasso;

import android.os.Message;

/* compiled from: Stats */
class O implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ a b;

    O(a aVar, Message message) {
        this.b = aVar;
        this.a = message;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled stats message.");
        sb.append(this.a.what);
        throw new AssertionError(sb.toString());
    }
}
