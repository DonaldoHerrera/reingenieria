package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.f;
import com.google.firebase.components.i;

final /* synthetic */ class a implements i {
    static final i a = new a();

    private a() {
    }

    public final Object create(f fVar) {
        return C2121KE.a((FirebaseApp) fVar.get(FirebaseApp.class), (Context) fVar.get(Context.class), (C2235QE) fVar.get(C2235QE.class));
    }
}
