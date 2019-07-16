package com.soundcloud.android;

import android.content.Context;
import com.soundcloud.android.image.S;

/* compiled from: ApplicationModule_ProvideImageProcessorFactory */
public final class F implements C4961HMa<S> {
    private final C7054oVa<Context> a;

    public static S a(Context context) {
        S b = C2933l.b(context);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public S get() {
        return a((Context) this.a.get());
    }
}
