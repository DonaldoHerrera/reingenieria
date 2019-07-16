package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.firebase.iid.m reason: case insensitive filesystem */
abstract class C2506m<T> {
    final int a;
    final Xy<T> b = new Xy<>();
    final int c;
    final Bundle d;

    C2506m(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    public final void a(T t) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.b.a(t);
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a();

    public String toString() {
        int i = this.c;
        int i2 = this.a;
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void a(C2509p pVar) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.b.a((Exception) pVar);
    }
}
