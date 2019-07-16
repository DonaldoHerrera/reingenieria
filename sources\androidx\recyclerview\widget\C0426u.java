package androidx.recyclerview.widget;

import com.facebook.stetho.server.http.HttpStatus;

/* renamed from: androidx.recyclerview.widget.u reason: case insensitive filesystem */
/* compiled from: FastScroller */
class C0426u implements Runnable {
    final /* synthetic */ C0428w a;

    C0426u(C0428w wVar) {
        this.a = wVar;
    }

    public void run() {
        this.a.a((int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }
}
