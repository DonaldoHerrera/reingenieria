package defpackage;

import com.soundcloud.flippernative.api.ErrorReason;
import com.soundcloud.flippernative.api.PlayerListener;
import com.soundcloud.flippernative.api.PlayerState;
import com.soundcloud.flippernative.api.audio_performance;
import com.soundcloud.flippernative.api.error_message;
import com.soundcloud.flippernative.api.state_change;

/* renamed from: cma reason: default package and case insensitive filesystem */
/* compiled from: FlipperWrapper.kt */
public final class C3967cma extends PlayerListener {
    final /* synthetic */ C3959bma a;

    C3967cma(C3959bma bma) {
        this.a = bma;
    }

    private final C4600kma a(state_change state_change) {
        String uri = state_change.getUri();
        C7471uYa.a((Object) uri, "uri");
        PlayerState state = state_change.getState();
        C7471uYa.a((Object) state, "state");
        ErrorReason reason = state_change.getReason();
        C7471uYa.a((Object) reason, "reason");
        C4600kma kma = new C4600kma(uri, state, reason, state_change.getBuffering(), state_change.getPosition(), state_change.getDuration(), state_change.getError().category());
        return kma;
    }

    public void onBufferingChanged(state_change state_change) {
        C7471uYa.b(state_change, "event");
        Tla a2 = this.a.g;
        C4560fma fma = C4560fma.INFO;
        StringBuilder sb = new StringBuilder();
        sb.append("onBufferingChanged() received in ");
        sb.append(C3959bma.c.a(state_change));
        a2.a(fma, sb.toString());
        this.a.g.a(a(state_change));
    }

    public void onDurationChanged(state_change state_change) {
        C7471uYa.b(state_change, "event");
    }

    public void onError(error_message error_message) {
        C7471uYa.b(error_message, "error");
        Tla a2 = this.a.g;
        String category = error_message.getCategory();
        C7471uYa.a((Object) category, "error.category");
        String playerVariant = error_message.getPlayerVariant();
        C7471uYa.a((Object) playerVariant, "error.playerVariant");
        String sourceFile = error_message.getSourceFile();
        C7471uYa.a((Object) sourceFile, "error.sourceFile");
        int line = error_message.getLine();
        String errorMessage = error_message.getErrorMessage();
        C7471uYa.a((Object) errorMessage, "error.errorMessage");
        String cdn = error_message.getCdn();
        C7471uYa.a((Object) cdn, "error.cdn");
        String format = error_message.getFormat();
        C7471uYa.a((Object) format, "error.format");
        Vla vla = new Vla(category, playerVariant, sourceFile, line, errorMessage, cdn, format, error_message.getBitRate());
        a2.a(vla);
    }

    public void onPerformanceEvent(audio_performance audio_performance) {
        C7471uYa.b(audio_performance, "event");
        this.a.g.a(new C4568gma(audio_performance.getTs().const_get_value(), C3959bma.c.a(audio_performance)));
    }

    public void onProgressChanged(state_change state_change) {
        C7471uYa.b(state_change, "event");
        Tla a2 = this.a.g;
        String uri = state_change.getUri();
        C7471uYa.a((Object) uri, "event.uri");
        C4576hma hma = new C4576hma(uri, state_change.getPosition(), state_change.getDuration());
        a2.a(hma);
    }

    public void onSeekingStatusChanged(state_change state_change) {
        C7471uYa.b(state_change, "stateChangeEvent");
        Tla a2 = this.a.g;
        String uri = state_change.getUri();
        C7471uYa.a((Object) uri, "stateChangeEvent.uri");
        a2.a(new C4592jma(uri, state_change.getSeekingInProgress(), state_change.getPosition()));
    }

    public void onStateChanged(state_change state_change) {
        C7471uYa.b(state_change, "event");
        Tla a2 = this.a.g;
        C4560fma fma = C4560fma.INFO;
        StringBuilder sb = new StringBuilder();
        sb.append("onStateChanged() called in ");
        sb.append(C3959bma.c.a(state_change));
        a2.a(fma, sb.toString());
        this.a.g.a(a(state_change));
    }
}
