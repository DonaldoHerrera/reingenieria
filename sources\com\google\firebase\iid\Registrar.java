package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public final class Registrar implements j {

    private static class a implements C2254RE {
        private final FirebaseInstanceId a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<e<?>> getComponents() {
        com.google.firebase.components.e.a a2 = e.a(FirebaseInstanceId.class);
        a2.a(q.b(FirebaseApp.class));
        a2.a(q.b(C2235QE.class));
        a2.a(q.b(C2402ZE.class));
        a2.a(C2511s.a);
        a2.a();
        e b = a2.b();
        com.google.firebase.components.e.a a3 = e.a(C2254RE.class);
        a3.a(q.b(FirebaseInstanceId.class));
        a3.a(r.a);
        return Arrays.asList(new e[]{b, a3.b(), C2383YE.a("fire-iid", "18.0.0")});
    }
}
