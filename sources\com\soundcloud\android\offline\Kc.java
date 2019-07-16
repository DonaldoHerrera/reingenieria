package com.soundcloud.android.offline;

/* compiled from: OfflineContentClearer.kt */
public class Kc extends C1255eT<Void, Boolean> {
    private final Gd a;
    private final C4088fe b;

    public Kc(Gd gd, C4088fe feVar) {
        C7471uYa.b(gd, "offlineContentStorage");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        this.a = gd;
        this.b = feVar;
    }

    public Boolean a(Void voidR) {
        if (this.a.i().c() != null) {
            return Boolean.valueOf(false);
        }
        this.b.a(false);
        return Boolean.valueOf(true);
    }
}
