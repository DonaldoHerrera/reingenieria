package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Api.ClientKey;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: com.google.android.gms.internal.cast.fa reason: case insensitive filesystem */
public final class C0704fa {
    public static final ClientKey<N> a = new ClientKey<>();
    public static final ClientKey<va> b = new ClientKey<>();
    public static final ClientKey<wa> c = new ClientKey<>();
    private static final ClientKey<Object> d = new ClientKey<>();
    private static final ClientKey<Object> e = new ClientKey<>();
    private static final Charset f;
    private static final String g = X.b("com.google.cast.multizone");
    public static boolean h = true;

    static {
        Charset charset;
        try {
            charset = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            charset = null;
        }
        f = charset;
    }
}
