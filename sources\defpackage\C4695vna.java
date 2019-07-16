package defpackage;

import android.content.Context;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.common.GoogleApiAvailability;
import com.soundcloud.android.playback.core.d;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0012R\u0014\u0010\u0005\u001a\u00020\u00068RX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/playback/players/utilities/GoogleApiWrapper;", "", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/playback/core/Logger;)V", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "getCastContext", "Lcom/google/android/gms/cast/framework/CastContext;", "context", "Landroid/content/Context;", "getCastSessionManager", "Lcom/google/android/gms/cast/framework/SessionManager;", "isCastAvailable", "", "isGooglePlayServicesAvailable", "isGooglePlayServicesPastVersionCode", "versionCode", "", "Companion", "players_release"}, mv = {1, 1, 15})
/* renamed from: vna reason: default package and case insensitive filesystem */
/* compiled from: GoogleApiWrapper.kt */
public class C4695vna {
    public static final a a = new a(null);
    private final d b;

    /* renamed from: vna$a */
    /* compiled from: GoogleApiWrapper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4695vna(d dVar) {
        C7471uYa.b(dVar, "logger");
        this.b = dVar;
    }

    private GoogleApiAvailability a() {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        C7471uYa.a((Object) instance, "GoogleApiAvailability.getInstance()");
        return instance;
    }

    private C0635c c(Context context) {
        try {
            return C0635c.a(context.getApplicationContext());
        } catch (Exception e) {
            d dVar = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get the shared instance of CastContext: ");
            sb.append(e);
            dVar.c("GoogleApiWrapper", sb.toString());
            return null;
        }
    }

    private boolean d(Context context) {
        return a().isGooglePlayServicesAvailable(context) == 0;
    }

    public boolean b(Context context) {
        C7471uYa.b(context, "context");
        return d(context) && a(9256000) && c(context) != null;
    }

    public C0666s a(Context context) {
        C7471uYa.b(context, "context");
        C0635c c = c(context);
        if (c != null) {
            return c.c();
        }
        return null;
    }

    private boolean a(int i) {
        return GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE >= i;
    }
}
