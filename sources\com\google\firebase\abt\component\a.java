package com.google.firebase.abt.component;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
public class a {
    private final Map<String, C2064HE> a = new HashMap();
    private final Context b;
    private final C2102JE c;

    protected a(Context context, C2102JE je) {
        this.b = context;
        this.c = je;
    }

    @KeepForSdk
    public synchronized C2064HE a(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new C2064HE(this.b, this.c, str));
        }
        return (C2064HE) this.a.get(str);
    }
}
