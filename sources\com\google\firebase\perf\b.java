package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

final /* synthetic */ class b implements i {
    static final i a = new b();

    private b() {
    }

    public final Object create(f fVar) {
        return new a((FirebaseApp) fVar.get(FirebaseApp.class), ((RemoteConfigComponent) fVar.get(RemoteConfigComponent.class)).get("fireperf"));
    }
}
