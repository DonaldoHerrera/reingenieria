package com.facebook;

import com.facebook.AccessToken.a;

/* renamed from: com.facebook.c reason: case insensitive filesystem */
/* compiled from: AccessTokenManager */
class C0533c implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ C0537g b;

    C0533c(C0537g gVar, a aVar) {
        this.b = gVar;
        this.a = aVar;
    }

    public void run() {
        this.b.b(this.a);
    }
}
