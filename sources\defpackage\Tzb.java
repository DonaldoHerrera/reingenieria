package defpackage;

import java.io.IOException;

/* renamed from: Tzb reason: default package */
/* compiled from: StreamResetException */
public final class Tzb extends IOException {
    public final C7649wzb a;

    public Tzb(C7649wzb wzb) {
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(wzb);
        super(sb.toString());
        this.a = wzb;
    }
}
