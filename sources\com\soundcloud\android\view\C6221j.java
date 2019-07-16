package com.soundcloud.android.view;

/* renamed from: com.soundcloud.android.view.j reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C6221j implements Runnable {
    private final /* synthetic */ LoadingTracksLayout a;

    public /* synthetic */ C6221j(LoadingTracksLayout loadingTracksLayout) {
        this.a = loadingTracksLayout;
    }

    public final void run() {
        this.a.requestLayout();
    }
}
