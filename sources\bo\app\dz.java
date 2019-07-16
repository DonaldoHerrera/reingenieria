package bo.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dz {
    private static final String a = Hg.a(dz.class);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC, Splitter:B:22:0x0050] */
    public static String a(String str, String str2) {
        String str3 = "Caught exception while trying to close system properties reader.";
        BufferedReader bufferedReader = null;
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str});
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream(), "UTF-8"));
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
            } catch (Exception e) {
                e = e;
                bufferedReader = bufferedReader2;
                try {
                    Hg.b(a, "Caught exception while trying to read Appboy logger tag from system properties.", e);
                    if (bufferedReader != null) {
                    }
                    return str2;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e2) {
                        Hg.b(a, str3, e2);
                    }
                }
                throw th;
            }
            try {
                bufferedReader2.close();
            } catch (Exception e3) {
                Hg.b(a, str3, e3);
            }
        } catch (Exception e4) {
            e = e4;
            Hg.b(a, "Caught exception while trying to read Appboy logger tag from system properties.", e);
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return str2;
        }
        return str2;
    }
}
