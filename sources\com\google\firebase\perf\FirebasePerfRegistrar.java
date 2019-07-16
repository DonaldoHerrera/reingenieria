package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebasePerfRegistrar implements j {
    @Keep
    public List<e<?>> getComponents() {
        a a = e.a(a.class);
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(RemoteConfigComponent.class));
        a.a(b.a);
        a.c();
        return Arrays.asList(new e[]{a.b(), C2383YE.a("fire-perf", "17.0.2")});
    }
}
