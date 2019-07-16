package defpackage;

import com.soundcloud.flippernative.api.CustomLogger;
import com.soundcloud.flippernative.api.LoggingLevel;

/* renamed from: dma reason: default package and case insensitive filesystem */
/* compiled from: FlipperWrapper.kt */
public final class C4544dma extends CustomLogger {
    final /* synthetic */ C3959bma a;

    C4544dma(C3959bma bma) {
        this.a = bma;
    }

    public void log(LoggingLevel loggingLevel, String str) {
        C7471uYa.b(loggingLevel, "level");
        C7471uYa.b(str, "message");
        this.a.g.a(C3959bma.c.a(loggingLevel), str);
    }
}
