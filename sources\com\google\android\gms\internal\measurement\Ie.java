package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class Ie extends yf {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    public final String a(long j) {
        return (String) a(b(j), String.class);
    }

    public final Bundle b(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    public final void h(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }

    public static <T> T a(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get("r");
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    Object[] objArr = {canonicalName, canonicalName2};
                    String str = "AM";
                    Log.w(str, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), objArr), e);
                    throw e;
                }
            }
        }
        return null;
    }
}
