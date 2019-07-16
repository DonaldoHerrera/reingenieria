package com.google.android.gms.common.api.internal;

final class zaad implements Ry<TResult> {
    private final /* synthetic */ zaab zafn;
    private final /* synthetic */ Xy zafo;

    zaad(zaab zaab, Xy xy) {
        this.zafn = zaab;
        this.zafo = xy;
    }

    public final void onComplete(Wy<TResult> wy) {
        this.zafn.zafl.remove(this.zafo);
    }
}
