package com.soundcloud.android.playlist.view;

import android.content.Context;

/* compiled from: PlaylistEditionItemTouchCallbackFactory */
final class V {
    private final C7054oVa<Context> a;

    V(C7054oVa<Context> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public U a(PlaylistDetailFragment playlistDetailFragment) {
        Object obj = this.a.get();
        a(obj, 1);
        Context context = (Context) obj;
        a(playlistDetailFragment, 2);
        return new U(context, playlistDetailFragment);
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
