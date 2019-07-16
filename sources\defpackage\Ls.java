package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: Ls reason: default package */
public final class Ls {
    private static final OutputStream a = new Ks();

    public static InputStream a(InputStream inputStream, long j) {
        return new Ns(inputStream, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }
}
