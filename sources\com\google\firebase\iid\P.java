package com.google.firebase.iid;

final /* synthetic */ class P implements Py {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;

    P(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
    }

    public final Object then(Wy wy) {
        return this.a.a(this.b, this.c, wy);
    }
}
