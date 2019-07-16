package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

@KeepForSdk
public class ProcessUtils {
    private static String zzhf;
    private static int zzhg;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String getMyProcessName() {
        if (zzhf == null) {
            if (zzhg == 0) {
                zzhg = Process.myPid();
            }
            zzhf = zzd(zzhg);
        }
        return zzhf;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    private static String zzd(int i) {
        String str;
        ? r4;
        ? r0;
        ? r02 = 0;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            BufferedReader zzk = zzk(sb.toString());
            try {
                String trim = zzk.readLine().trim();
                IOUtils.closeQuietly((Closeable) zzk);
                str = trim;
            } catch (IOException unused) {
                r4 = zzk;
                IOUtils.closeQuietly((Closeable) r4);
                str = r02;
                return str;
            } catch (Throwable th) {
                Throwable th2 = th;
                r0 = zzk;
                th = th2;
                IOUtils.closeQuietly((Closeable) r0);
                throw th;
            }
        } catch (IOException unused2) {
            r4 = 0;
            IOUtils.closeQuietly((Closeable) r4);
            str = r02;
            return str;
        } catch (Throwable th3) {
            th = th3;
            r0 = r02;
            IOUtils.closeQuietly((Closeable) r0);
            throw th;
        }
        return str;
    }

    private static BufferedReader zzk(String str) throws IOException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
