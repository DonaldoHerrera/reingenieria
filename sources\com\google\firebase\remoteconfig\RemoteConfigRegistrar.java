package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar implements j {
    public List<e<?>> getComponents() {
        a a = e.a(RemoteConfigComponent.class);
        a.a(q.b(Context.class));
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(FirebaseInstanceId.class));
        a.a(q.b(com.google.firebase.abt.component.a.class));
        a.a(q.a(C2102JE.class));
        a.a(zzr.zzkd);
        a.a();
        return Arrays.asList(new e[]{a.b(), C2383YE.a("fire-rc", "17.0.0")});
    }
}
