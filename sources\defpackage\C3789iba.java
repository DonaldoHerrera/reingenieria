package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.C0623u;
import com.google.android.exoplayer2.V;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.c.C0035c;
import com.soundcloud.android.playback.core.b;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.e;
import com.soundcloud.android.playback.core.k;
import java.util.List;

/* renamed from: iba reason: default package and case insensitive filesystem */
/* compiled from: ExoPlayerKit.kt */
public class C3789iba implements b {
    private final Context a;
    private final C3781hba b;
    private final C6834lGa c;
    private final C5694cGa d;
    private final d e;

    public C3789iba(Context context, C3781hba hba, C6834lGa lga, C5694cGa cga, d dVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(hba, "exoPlayerConfiguration");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(dVar, "logger");
        this.a = context;
        this.b = hba;
        this.c = lga;
        this.d = cga;
        this.e = dVar;
    }

    public k a() {
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(new C0035c(new C1242dq()));
        C3781hba hba = this.b;
        C6834lGa lga = this.c;
        C5694cGa cga = this.d;
        d dVar = this.e;
        V a2 = C0623u.a(this.a, defaultTrackSelector);
        C7471uYa.a((Object) a2, "ExoPlayerFactory.newSimp…e(context, trackSelector)");
        C3757eba eba = new C3757eba(hba, lga, cga, dVar, a2, new C1304fq(this.a, this.b.b()));
        return eba;
    }

    public List<e> b() {
        return C6850lWa.a(new e("progressive", "audio/mpeg"));
    }
}
