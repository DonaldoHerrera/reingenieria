package com.soundcloud.android.playback.playqueue;

import android.content.Context;

/* compiled from: PlayQueueSwipeToRemoveCallbackFactory */
class Sa {
    private final C7054oVa<Context> a;

    Sa(C7054oVa<Context> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public Ra a(Pa pa) {
        Object obj = this.a.get();
        a(obj, 1);
        Context context = (Context) obj;
        a(pa, 2);
        return new Ra(context, pa);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
