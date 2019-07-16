package defpackage;

import com.soundcloud.android.playback.core.e;
import com.soundcloud.flippernative.api.MediaType;
import com.soundcloud.flippernative.api.Player;
import com.soundcloud.flippernative.api.PlayerJni;
import com.soundcloud.flippernative.api.VectorMediaType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ama reason: default package and case insensitive filesystem */
/* compiled from: FlipperWrapper.kt */
final class C3951ama extends C7540vYa implements PXa<List<? extends e>> {
    public static final C3951ama a = new C3951ama();

    C3951ama() {
        super(0);
    }

    public final List<e> d() {
        a aVar = C3959bma.c;
        VectorMediaType supportedMediaTypes = Player.getSupportedMediaTypes();
        C7471uYa.a((Object) supportedMediaTypes, "Player.getSupportedMediaTypes()");
        List<MediaType> a2 = aVar.a(supportedMediaTypes);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (MediaType mediaType : a2) {
            String streamingProtocolString = PlayerJni.streamingProtocolString(mediaType.getStreamingProtocol());
            C7471uYa.a((Object) streamingProtocolString, "PlayerJni.streamingProto…ing(it.streamingProtocol)");
            String mediaMimeType = mediaType.getMediaMimeType();
            C7471uYa.a((Object) mediaMimeType, "it.mediaMimeType");
            arrayList.add(new e(streamingProtocolString, mediaMimeType));
        }
        return arrayList;
    }
}
