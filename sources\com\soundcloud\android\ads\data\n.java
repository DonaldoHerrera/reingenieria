package com.soundcloud.android.ads.data;

import com.google.common.base.Function;
import com.soundcloud.android.ads.data.g.a;
import com.soundcloud.android.ads.data.g.b;

/* compiled from: VideoAdStorage.kt */
final class n<F, T> implements Function<T, V> {
    public static final n a = new n();

    n() {
    }

    /* renamed from: a */
    public final g apply(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (hVar.a() != null && hVar.c() == null) {
            return new a(hVar.a());
        } else {
            if (hVar.c() != null && hVar.a() == null) {
                return new b(hVar.c());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AdEntity ");
            sb.append(hVar);
            sb.append(" is invalid!");
            throw new C2557a(sb.toString());
        }
    }
}
