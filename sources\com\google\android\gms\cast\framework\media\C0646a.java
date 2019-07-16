package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.v.a;
import com.google.android.gms.common.images.WebImage;

/* renamed from: com.google.android.gms.cast.framework.media.a reason: case insensitive filesystem */
public class C0646a {
    private final v a = new C0040a();

    /* renamed from: com.google.android.gms.cast.framework.media.a$a reason: collision with other inner class name */
    private class C0040a extends a {
        private C0040a() {
        }

        public final int a() {
            return 12451009;
        }

        public final WebImage a(MediaMetadata mediaMetadata, int i) {
            return C0646a.this.a(mediaMetadata, i);
        }

        public final Dr l() {
            return Er.a(C0646a.this);
        }

        public final WebImage a(MediaMetadata mediaMetadata, ImageHints imageHints) {
            return C0646a.this.a(mediaMetadata, imageHints);
        }
    }

    @Deprecated
    public WebImage a(MediaMetadata mediaMetadata, int i) {
        if (mediaMetadata == null || !mediaMetadata.G()) {
            return null;
        }
        return (WebImage) mediaMetadata.i().get(0);
    }

    public WebImage a(MediaMetadata mediaMetadata, ImageHints imageHints) {
        return a(mediaMetadata, imageHints.F());
    }

    public final v a() {
        return this.a;
    }
}
