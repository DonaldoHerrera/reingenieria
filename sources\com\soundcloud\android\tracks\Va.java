package com.soundcloud.android.tracks;

import com.soundcloud.android.accounts.C2526g;

/* compiled from: TrackStatsDisplayPolicy.kt */
public class Va {
    private final C2526g a;

    public Va(C2526g gVar) {
        C7471uYa.b(gVar, "accountOperations");
        this.a = gVar;
    }

    private boolean c(C6185ma maVar) {
        return maVar.G() || C7471uYa.a((Object) this.a.c(), (Object) maVar.e());
    }

    public boolean a(C6185ma maVar) {
        C7471uYa.b(maVar, "trackItem");
        return maVar.L() && maVar.C() > 0 && c(maVar);
    }

    public boolean b(C6185ma maVar) {
        C7471uYa.b(maVar, "trackItem");
        return maVar.J() && c(maVar);
    }

    public boolean b(C3855qda qda) {
        C7471uYa.b(qda, "playableItem");
        if (qda instanceof C6185ma) {
            if (qda.z() > 0 && c((C6185ma) qda)) {
                return true;
            }
        } else if (qda.z() > 0) {
            return true;
        }
        return false;
    }

    public boolean a(C3855qda qda) {
        C7471uYa.b(qda, "playableItem");
        if (qda instanceof C6185ma) {
            if (qda.q() > 0 && c((C6185ma) qda)) {
                return true;
            }
        } else if (qda.q() > 0) {
            return true;
        }
        return false;
    }
}
