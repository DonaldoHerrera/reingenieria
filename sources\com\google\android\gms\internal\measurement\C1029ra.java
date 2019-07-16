package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.core.content.b;

/* renamed from: com.google.android.gms.internal.measurement.ra reason: case insensitive filesystem */
final class C1029ra implements C1000ma {
    static C1029ra a;
    private final Context b;

    private C1029ra(Context context) {
        this.b = context;
        this.b.getContentResolver().registerContentObserver(C0969ha.a, true, new C1041ta(this, null));
    }

    static C1029ra a(Context context) {
        C1029ra raVar;
        synchronized (C1029ra.class) {
            if (a == null) {
                a = b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1029ra(context) : new C1029ra();
            }
            raVar = a;
        }
        return raVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String a(String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) C1018pa.a(new C1024qa(this, str));
        } catch (SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ String b(String str) {
        return C0969ha.a(this.b.getContentResolver(), str, (String) null);
    }

    private C1029ra() {
        this.b = null;
    }
}
