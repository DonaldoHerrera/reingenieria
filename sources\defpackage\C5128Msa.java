package defpackage;

import com.soundcloud.android.offline.Gd;

/* renamed from: Msa reason: default package and case insensitive filesystem */
/* compiled from: RemovePlaylistCommand.kt */
public class C5128Msa extends C1255eT<C3508cda, Boolean> {
    private final C5218Psa a;
    private final Gd b;

    public C5128Msa(C5218Psa psa, Gd gd) {
        C7471uYa.b(psa, "removePlaylistFromDatabaseCommand");
        C7471uYa.b(gd, "offlineContentStorage");
        this.a = psa;
        this.b = gd;
    }

    public Boolean a(C3508cda cda) {
        C7471uYa.b(cda, "input");
        if (((C6431fLa) this.a.a(cda)).b()) {
            Throwable c = this.b.c(cda).c();
            if (c != null) {
                C7316sHa.b(c, "Unable to remove playlist from offline storage");
                return Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(true);
    }
}
