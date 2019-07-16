package com.google.firebase.iid;

import com.google.firebase.components.f;
import com.google.firebase.components.i;

final /* synthetic */ class r implements i {
    static final i a = new r();

    private r() {
    }

    public final Object create(f fVar) {
        return new a((FirebaseInstanceId) fVar.get(FirebaseInstanceId.class));
    }
}
