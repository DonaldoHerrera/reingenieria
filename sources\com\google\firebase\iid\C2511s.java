package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.f;
import com.google.firebase.components.i;

/* renamed from: com.google.firebase.iid.s reason: case insensitive filesystem */
final /* synthetic */ class C2511s implements i {
    static final i a = new C2511s();

    private C2511s() {
    }

    public final Object create(f fVar) {
        return new FirebaseInstanceId((FirebaseApp) fVar.get(FirebaseApp.class), (C2235QE) fVar.get(C2235QE.class), (C2402ZE) fVar.get(C2402ZE.class));
    }
}
