package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements j {
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<e<?>> getComponents() {
        a a = e.a(C2102JE.class);
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(Context.class));
        a.a(q.b(C2235QE.class));
        a.a(a.a);
        a.c();
        return Arrays.asList(new e[]{a.b(), C2383YE.a("fire-analytics", "16.5.0")});
    }
}
