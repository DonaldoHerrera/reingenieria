package defpackage;

import android.os.PowerManager;
import com.soundcloud.android.playback.core.b;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.e;
import com.soundcloud.android.playback.core.k;
import java.util.List;

/* renamed from: Yla reason: default package */
/* compiled from: FlipperKit.kt */
public class Yla implements b {
    private final Ula a;
    private final PowerManager b;
    private final d c;

    public Yla(Ula ula, PowerManager powerManager, d dVar) {
        C7471uYa.b(ula, "flipperConfiguration");
        C7471uYa.b(powerManager, "powerManager");
        C7471uYa.b(dVar, "logger");
        this.a = ula;
        this.b = powerManager;
        this.c = dVar;
    }

    public k a() {
        Nla nla = new Nla(new C4552ema(this.a), new C4632oma(new C7522vGa(this.b), this.c), null, this.c, 4, null);
        return nla;
    }

    public List<e> b() {
        return C3959bma.c.a();
    }
}
