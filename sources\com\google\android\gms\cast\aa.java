package com.google.android.gms.cast;

final class aa implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ CastRemoteDisplayLocalService b;

    aa(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z) {
        this.b = castRemoteDisplayLocalService;
        this.a = z;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
