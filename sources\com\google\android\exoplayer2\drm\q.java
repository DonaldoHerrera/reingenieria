package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ExoMediaDrm */
public interface q<T extends p> {

    /* compiled from: ExoMediaDrm */
    public static final class a {
    }

    /* compiled from: ExoMediaDrm */
    public static final class b {
    }

    a a(byte[] bArr, List<SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    b a();

    Map<String, String> a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    T b(byte[] bArr) throws MediaCryptoException;

    byte[] b() throws MediaDrmException;

    byte[] b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void c(byte[] bArr) throws DeniedByServerException;

    void d(byte[] bArr);
}
