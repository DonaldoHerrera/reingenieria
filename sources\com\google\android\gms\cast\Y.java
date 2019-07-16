package com.google.android.gms.cast;

final class Y implements Runnable {
    private final /* synthetic */ CastRemoteDisplayLocalService a;

    Y(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.a = castRemoteDisplayLocalService;
    }

    public final void run() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.a;
        boolean b = castRemoteDisplayLocalService.p;
        StringBuilder sb = new StringBuilder(59);
        sb.append("onCreate after delay. The local service been started: ");
        sb.append(b);
        castRemoteDisplayLocalService.a(sb.toString());
        if (!this.a.p) {
            this.a.b("The local service has not been been started, stopping it");
            this.a.stopSelf();
        }
    }
}
