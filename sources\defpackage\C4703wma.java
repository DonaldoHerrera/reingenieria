package defpackage;

import android.content.Context;
import com.soundcloud.android.playback.core.b;
import com.soundcloud.android.playback.core.d;

/* renamed from: wma reason: default package and case insensitive filesystem */
/* compiled from: MediaPlayerKit.kt */
public class C4703wma implements b {
    private final Context a;
    private final C6834lGa b;
    private final C5694cGa c;
    private final d d;

    public C4703wma(Context context, C6834lGa lga, C5694cGa cga, d dVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(dVar, "logger");
        this.a = context;
        this.b = lga;
        this.c = cga;
        this.d = dVar;
    }

    public C4685uma a() {
        Context applicationContext = this.a.getApplicationContext();
        C7471uYa.a((Object) applicationContext, "context.applicationContext");
        C4685uma uma = new C4685uma(applicationContext, this.b, this.c, this.d, null, null, 48, null);
        return uma;
    }
}
