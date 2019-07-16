package com.moat.analytics.mobile.scl;

import com.moat.analytics.mobile.scl.a.b.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class o {
    o() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = com.moat.analytics.mobile.scl.a.b.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r0 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    static a<String> a(String str) {
        InputStream inputStream = null;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() >= 400) {
            return a.a();
        }
        InputStream inputStream2 = httpURLConnection.getInputStream();
        a<String> a = a.a(a(inputStream2));
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused) {
            }
        }
        return a;
    }

    private static String a(InputStream inputStream) {
        char[] cArr = new char[256];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        int i = 0;
        do {
            int read = inputStreamReader.read(cArr, 0, cArr.length);
            if (read <= 0) {
                break;
            }
            i += read;
            sb.append(cArr, 0, read);
        } while (i < 1024);
        return sb.toString();
    }
}
