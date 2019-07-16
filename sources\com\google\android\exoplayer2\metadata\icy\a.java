package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.metadata.e;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: IcyDecoder */
public final class a implements b {
    private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);

    public Metadata a(e eVar) {
        ByteBuffer byteBuffer = eVar.c;
        return a(C0471ar.a(byteBuffer.array(), 0, byteBuffer.limit()));
    }

    /* access modifiers changed from: 0000 */
    public Metadata a(String str) {
        Matcher matcher = a.matcher(str);
        String str2 = null;
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String g = C0471ar.g(matcher.group(1));
            String group = matcher.group(2);
            char c = 65535;
            int hashCode = g.hashCode();
            if (hashCode != -315603473) {
                if (hashCode == 1646559960 && g.equals("streamtitle")) {
                    c = 0;
                }
            } else if (g.equals("streamurl")) {
                c = 1;
            }
            if (c == 0) {
                str2 = group;
            } else if (c != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized ICY tag: ");
                sb.append(str2);
                Iq.d("IcyDecoder", sb.toString());
            } else {
                str3 = group;
            }
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new Metadata(new IcyInfo(str2, str3));
    }
}
