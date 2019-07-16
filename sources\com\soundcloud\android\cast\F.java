package com.soundcloud.android.cast;

import com.google.android.gms.cast.framework.media.C0650e;
import com.soundcloud.android.playback.core.d;

/* compiled from: RemoteMediaClientLogger */
public class F {
    private final d a;

    public F(d dVar) {
        this.a = dVar;
    }

    private String b(C0650e eVar) {
        if (eVar.g() == null) {
            return "null mediaInfo";
        }
        if (eVar.g().I() == null) {
            return "null customData";
        }
        return eVar.g().I().toString();
    }

    public void a(String str, C0650e eVar) {
        d dVar = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("CastPlayerState::");
        sb.append(str);
        sb.append(", status = ");
        sb.append(a(eVar));
        sb.append(", queue = ");
        sb.append(b(eVar));
        dVar.a("RemoteMediaClientLogger", sb.toString());
    }

    private String a(C0650e eVar) {
        int k = eVar.k();
        if (k == 0) {
            return "PLAYER_STATE_UNKNOWN";
        }
        if (k == 1) {
            return "PLAYER_STATE_IDLE";
        }
        if (k == 2) {
            return "PLAYER_STATE_PLAYING";
        }
        if (k == 3) {
            return "PLAYER_STATE_PAUSED";
        }
        if (k != 4) {
            return k != 5 ? "UNDEFINED STATE" : "PLAYER_STATE_LOADING";
        }
        return "PLAYER_STATE_BUFFERING";
    }
}
