package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zze extends zzj {
    private int zzt;

    protected zze(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zzt = Arrays.hashCode(bArr);
    }

    protected static byte[] zza(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzi)) {
            try {
                zzi zzi = (zzi) obj;
                if (zzi.zzc() != hashCode()) {
                    return false;
                }
                Dr zzb = zzi.zzb();
                if (zzb == null) {
                    return false;
                }
                return Arrays.equals(getBytes(), (byte[]) Er.c(zzb));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public abstract byte[] getBytes();

    public int hashCode() {
        return this.zzt;
    }

    public final Dr zzb() {
        return Er.a(getBytes());
    }

    public final int zzc() {
        return hashCode();
    }
}
