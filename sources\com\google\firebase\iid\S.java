package com.google.firebase.iid;

final /* synthetic */ class S implements C2197OE {
    private final a a;

    S(a aVar) {
        this.a = aVar;
    }

    public final void a(C2178NE ne) {
        a aVar = this.a;
        synchronized (aVar) {
            if (aVar.a()) {
                FirebaseInstanceId.this.m();
            }
        }
    }
}
