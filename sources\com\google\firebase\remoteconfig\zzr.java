package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.iid.FirebaseInstanceId;

final /* synthetic */ class zzr implements i {
    static final i zzkd = new zzr();

    private zzr() {
    }

    public final Object create(f fVar) {
        RemoteConfigComponent remoteConfigComponent = new RemoteConfigComponent((Context) fVar.get(Context.class), (FirebaseApp) fVar.get(FirebaseApp.class), (FirebaseInstanceId) fVar.get(FirebaseInstanceId.class), ((a) fVar.get(a.class)).a("frc"), (C2102JE) fVar.get(C2102JE.class));
        return remoteConfigComponent;
    }
}
