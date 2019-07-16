package com.soundcloud.android.cast;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.C0646a;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

/* renamed from: com.soundcloud.android.cast.h reason: case insensitive filesystem */
/* compiled from: CastImagePicker */
public class C2734h extends C0646a {
    public WebImage a(MediaMetadata mediaMetadata, ImageHints imageHints) {
        if (mediaMetadata == null || !mediaMetadata.G()) {
            return null;
        }
        List i = mediaMetadata.i();
        if (i.size() == 1) {
            return (WebImage) i.get(0);
        }
        if (imageHints.F() == 0) {
            return (WebImage) i.get(0);
        }
        return (WebImage) i.get(1);
    }
}
