package defpackage;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: NE reason: default package and case insensitive filesystem */
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class C2178NE<T> {
    private final Class<T> a;
    private final T b;

    @KeepForSdk
    public T a() {
        return this.b;
    }

    @KeepForSdk
    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
