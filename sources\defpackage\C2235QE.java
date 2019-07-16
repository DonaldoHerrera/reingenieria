package defpackage;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk
/* renamed from: QE reason: default package and case insensitive filesystem */
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public interface C2235QE {
    @KeepForSdk
    <T> void a(Class<T> cls, C2197OE<? super T> oe);

    @KeepForSdk
    <T> void a(Class<T> cls, Executor executor, C2197OE<? super T> oe);
}
