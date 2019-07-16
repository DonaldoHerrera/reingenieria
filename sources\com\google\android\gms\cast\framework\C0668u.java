package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.cast.framework.u reason: case insensitive filesystem */
public abstract class C0668u {
    private final Context a;
    private final String b;
    private final a c = new a();

    /* renamed from: com.google.android.gms.cast.framework.u$a */
    private class a extends ba {
        private a() {
        }

        public final int a() {
            return 12451009;
        }

        public final Dr c(String str) {
            r a2 = C0668u.this.a(str);
            if (a2 == null) {
                return null;
            }
            return a2.e();
        }

        public final boolean q() {
            return C0668u.this.c();
        }

        public final String u() {
            return C0668u.this.a();
        }
    }

    protected C0668u(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.a = context.getApplicationContext();
        Preconditions.checkNotEmpty(str);
        this.b = str;
    }

    public abstract r a(String str);

    public final String a() {
        return this.b;
    }

    public final Context b() {
        return this.a;
    }

    public abstract boolean c();

    public final IBinder d() {
        return this.c;
    }
}
