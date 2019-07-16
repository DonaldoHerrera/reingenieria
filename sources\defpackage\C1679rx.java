package defpackage;

import java.io.IOException;

/* renamed from: rx reason: default package and case insensitive filesystem */
public class C1679rx implements C0261Tw {
    private final String a;
    private final String b;

    public C1679rx(String str) {
        this(str, null);
    }

    public final void a(C1827wv<?> wvVar) throws IOException {
        String str = this.a;
        if (str != null) {
            wvVar.put("key", str);
        }
    }

    private C1679rx(String str, String str2) {
        this.a = str;
        this.b = null;
    }
}
