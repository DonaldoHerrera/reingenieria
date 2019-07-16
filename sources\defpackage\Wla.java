package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.flippernative.api.CustomLogger;
import com.soundcloud.flippernative.api.Player;
import com.soundcloud.flippernative.api.Player.LogLevel;
import com.soundcloud.flippernative.api.PlayerConfiguration;
import com.soundcloud.flippernative.api.PlayerListener;
import java.io.File;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/playback/flipper/FlipperFactory;", "", "flipperConfiguration", "Lcom/soundcloud/android/playback/flipper/FlipperConfiguration;", "(Lcom/soundcloud/android/playback/flipper/FlipperConfiguration;)V", "create", "Lcom/soundcloud/flippernative/api/Player;", "listener", "Lcom/soundcloud/flippernative/api/PlayerListener;", "logListener", "Lcom/soundcloud/flippernative/api/CustomLogger;", "Companion", "flipper_release"}, mv = {1, 1, 15})
/* renamed from: Wla reason: default package */
/* compiled from: FlipperFactory.kt */
public final class Wla {
    public static final a a = new a(null);
    private final Ula b;

    /* renamed from: Wla$a */
    /* compiled from: FlipperFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Wla(Ula ula) {
        C7471uYa.b(ula, "flipperConfiguration");
        this.b = ula;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r4 != null) goto L_0x002f;
     */
    public final Player a(PlayerListener playerListener, CustomLogger customLogger) {
        String str;
        PlayerListener playerListener2 = playerListener;
        C7471uYa.b(playerListener2, CastExtraArgs.LISTENER);
        C7471uYa.b(customLogger, "logListener");
        Ula ula = this.b;
        Player.setLogLevel(LogLevel.Debug);
        Player.setCustomLogger(customLogger);
        File a2 = ula.a().a();
        if (a2 != null) {
            str = a2.getAbsolutePath();
        }
        str = "";
        PlayerConfiguration playerConfiguration = new PlayerConfiguration(str, (String) ula.a().c(), ula.a().size(), ula.a().d(), 500, ula.c(), "", ula.e(), ula.b());
        Long d = ula.d();
        if (d != null) {
            playerConfiguration.setNativeBufferSize(d.longValue());
        }
        return new Player(playerConfiguration, playerListener2);
    }
}
