package defpackage;

import com.google.android.exoplayer2.H;
import java.util.regex.Pattern;

/* renamed from: Mp reason: default package */
/* compiled from: WebvttParserUtil */
public final class Mp {
    private static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");

    public static boolean a(Pq pq) {
        String j = pq.j();
        return j != null && j.startsWith("WEBVTT");
    }

    public static void b(Pq pq) throws H {
        int c = pq.c();
        if (!a(pq)) {
            pq.e(c);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected WEBVTT. Got ");
            sb.append(pq.j());
            throw new H(sb.toString());
        }
    }

    public static float a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) throws NumberFormatException {
        String[] b = C0471ar.b(str, "\\.");
        long j = 0;
        for (String parseLong : C0471ar.a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }
}
