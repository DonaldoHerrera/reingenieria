package defpackage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soundcloud.android.playback.core.e;
import com.soundcloud.flippernative.api.CustomLogger;
import com.soundcloud.flippernative.api.LoggingLevel;
import com.soundcloud.flippernative.api.MediaType;
import com.soundcloud.flippernative.api.Player;
import com.soundcloud.flippernative.api.PlayerListener;
import com.soundcloud.flippernative.api.VectorMediaType;
import com.soundcloud.flippernative.api.audio_performance;
import com.soundcloud.flippernative.api.state_change;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EVa(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/soundcloud/android/playback/flipper/FlipperWrapper;", "", "flipperCallbacks", "Lcom/soundcloud/android/playback/flipper/FlipperCallbacks;", "flipperFactory", "Lcom/soundcloud/android/playback/flipper/FlipperFactory;", "(Lcom/soundcloud/android/playback/flipper/FlipperCallbacks;Lcom/soundcloud/android/playback/flipper/FlipperFactory;)V", "flipper", "Lcom/soundcloud/flippernative/api/Player;", "listener", "Lcom/soundcloud/flippernative/api/PlayerListener;", "logListener", "Lcom/soundcloud/flippernative/api/CustomLogger;", "playerVersion", "", "getPlayerVersion", "()Ljava/lang/String;", "level", "", "volume", "getVolume", "()D", "setVolume", "(D)V", "destroy", "", "open", "", "mediaUri", "positionMs", "", "openEncrypted", "key", "", "initVector", "pause", "play", "prefetch", "seek", "stop", "Companion", "flipper_release"}, mv = {1, 1, 15})
/* renamed from: bma reason: default package and case insensitive filesystem */
/* compiled from: FlipperWrapper.kt */
public class C3959bma {
    /* access modifiers changed from: private */
    public static final C7744yVa a = BVa.a(Zla.a);
    /* access modifiers changed from: private */
    public static final C7744yVa b = BVa.a(C3951ama.a);
    public static final a c = new a(null);
    private final PlayerListener d = new C3967cma(this);
    private final CustomLogger e = new C4544dma(this);
    private final Player f;
    /* access modifiers changed from: private */
    public final Tla g;

    /* renamed from: bma$a */
    /* compiled from: FlipperWrapper.kt */
    public static final class a {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(a.class), "objectMapper", "getObjectMapper()Lcom/fasterxml/jackson/databind/ObjectMapper;")), HYa.a((DYa) new EYa(HYa.a(a.class), "supportedMediaTypes", "getSupportedMediaTypes()Ljava/util/List;"))};

        private a() {
        }

        private final ObjectMapper b() {
            C7744yVa a2 = C3959bma.a;
            a aVar = C3959bma.c;
            DZa dZa = a[0];
            return (ObjectMapper) a2.getValue();
        }

        public final List<e> a() {
            C7744yVa b = C3959bma.b;
            a aVar = C3959bma.c;
            DZa dZa = a[1];
            return (List) b.getValue();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final C4560fma a(LoggingLevel loggingLevel) {
            C7471uYa.b(loggingLevel, "loggingLevel");
            LoggingLevel swigToEnum = LoggingLevel.swigToEnum(loggingLevel.swigValue());
            if (C7471uYa.a((Object) swigToEnum, (Object) LoggingLevel.L_DEBUG)) {
                return C4560fma.DEBUG;
            }
            if (C7471uYa.a((Object) swigToEnum, (Object) LoggingLevel.L_INFO)) {
                return C4560fma.INFO;
            }
            if (C7471uYa.a((Object) swigToEnum, (Object) LoggingLevel.L_WARN)) {
                return C4560fma.WARN;
            }
            if (C7471uYa.a((Object) swigToEnum, (Object) LoggingLevel.L_ERR)) {
                return C4560fma.ERROR;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected logging level ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: private */
        public final List<MediaType> a(VectorMediaType vectorMediaType) {
            ArrayList arrayList = new ArrayList();
            int size = (int) vectorMediaType.size();
            for (int i = 0; i < size; i++) {
                MediaType mediaType = vectorMediaType.get(i);
                C7471uYa.a((Object) mediaType, "get(i)");
                arrayList.add(mediaType);
            }
            return C7676xWa.q(arrayList);
        }

        /* access modifiers changed from: private */
        public final String a(state_change state_change) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append('[');
            sb.append(state_change.getState());
            sb.append(':');
            sb.append(state_change.getReason());
            sb.append("], ");
            sb.append("buffering=");
            sb.append(state_change.getBuffering());
            String str = ", ";
            sb.append(str);
            sb.append("seeking=");
            sb.append(state_change.getSeekingInProgress());
            sb.append(str);
            sb.append("progress=[");
            sb.append(state_change.getPosition());
            sb.append(':');
            sb.append(state_change.getDuration());
            sb.append(']');
            sb.append("]");
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public final Map<String, Object> a(audio_performance audio_performance) {
            Object obj = ((Map) b().readValue(audio_performance.toJson(), (TypeReference) new _la())).get("payload");
            if (obj != null) {
                return (Map) obj;
            }
            throw new OVa("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        }
    }

    public C3959bma(Tla tla, Wla wla) {
        C7471uYa.b(tla, "flipperCallbacks");
        C7471uYa.b(wla, "flipperFactory");
        this.g = tla;
        this.f = wla.a(this.d, this.e);
    }

    public void c() {
        Player.setCustomLogger(null);
        this.f.destroy();
    }

    public String d() {
        String playerVersion = this.f.getPlayerVersion();
        C7471uYa.a((Object) playerVersion, "flipper.playerVersion");
        return playerVersion;
    }

    public double e() {
        return this.f.getVolume();
    }

    public void f() {
        this.f.pause();
    }

    public void g() {
        this.f.play();
    }

    public void h() {
        this.f.stop();
    }

    public void a(String str) {
        C7471uYa.b(str, "mediaUri");
        this.f.prefetch(str);
    }

    public void a(long j) {
        this.f.seek(j);
    }

    public boolean a(String str, long j) {
        C7471uYa.b(str, "mediaUri");
        return this.f.open(str, j);
    }

    public boolean a(String str, byte[] bArr, byte[] bArr2, long j) {
        C7471uYa.b(str, "mediaUri");
        C7471uYa.b(bArr, "key");
        C7471uYa.b(bArr2, "initVector");
        return this.f.openEncrypted(str, bArr, bArr2, j);
    }

    public void a(double d2) {
        this.f.setVolume(d2);
    }
}
