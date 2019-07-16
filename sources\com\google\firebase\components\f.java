package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public interface f {
    @KeepForSdk
    <T> C2273SE<Set<T>> a(Class<T> cls);

    @KeepForSdk
    <T> Set<T> b(Class<T> cls);

    @KeepForSdk
    <T> C2273SE<T> c(Class<T> cls);

    @KeepForSdk
    <T> T get(Class<T> cls);
}
