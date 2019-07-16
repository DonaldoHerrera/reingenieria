package com.google.firebase.iid;

final /* synthetic */ class Q implements Vy {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    Q(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final Wy then(Object obj) {
        return this.a.b(this.b, this.c, this.d, (String) obj);
    }
}
