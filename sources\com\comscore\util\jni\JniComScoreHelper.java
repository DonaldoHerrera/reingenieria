package com.comscore.util.jni;

import com.comscore.ConfigurationListener;
import com.comscore.util.Base64Coder;
import com.comscore.util.crashreport.CrashReport;
import com.comscore.util.crashreport.CrashReportDecorator;
import com.comscore.util.crashreport.CrashReportManager;
import com.comscore.util.log.LogLevel;
import com.comscore.util.log.Logger;
import com.comscore.util.log.Logger.OnErrorLogListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;

public abstract class JniComScoreHelper implements ConfigurationListener, OnErrorLogListener {
    protected CrashReportManager crashReporter = new CrashReportManager(createCrashReportDecorator());

    public static class HTTPStream {
        private HttpURLConnection a;
        private InputStream b;
        private long c;

        public HTTPStream(HttpURLConnection httpURLConnection, int[] iArr, StringBuffer stringBuffer) {
            this.a = httpURLConnection;
            try {
                this.b = new BufferedInputStream(this.a.getInputStream());
            } catch (IOException e) {
                if (this.a.getResponseCode() < 400) {
                    throw e;
                }
            } finally {
                iArr[0] = this.a.getResponseCode();
            }
            this.b = iArr[0] >= 400 ? this.a.getErrorStream() : this.a.getInputStream();
            for (Entry entry : this.a.getHeaderFields().entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) entry.getKey());
                    sb.append(": ");
                    sb.append(a(",", (Iterable) entry.getValue()));
                    sb.append("\n");
                    stringBuffer.append(sb.toString());
                }
            }
        }

        private String a(CharSequence charSequence, Iterable<?> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Object next : iterable) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(next);
            }
            return sb.toString();
        }

        public final long getPosition() {
            return this.c;
        }

        public final long getTotalLength() {
            return -1;
        }

        public final boolean isExhausted() {
            return false;
        }

        public final int read(byte[] bArr, int i) {
            int i2 = 0;
            try {
                i2 = this.b.read(bArr, 0, i);
            } catch (IOException unused) {
            }
            if (i2 > 0) {
                this.c += (long) i2;
            }
            return i2;
        }

        public final void release() {
            try {
                this.b.close();
            } catch (IOException unused) {
            }
            this.a.disconnect();
        }

        public final boolean setPosition(long j) {
            return false;
        }
    }

    public JniComScoreHelper() {
        Logger.setOnErrorLogListener(this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:43|44|45|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b4 */
    public static HTTPStream createHTTPStream(String str, boolean z, byte[] bArr, String str2, int i, int[] iArr, StringBuffer stringBuffer, int i2, String str3) {
        HTTPStream hTTPStream;
        if (i < 0) {
            i = 0;
        } else if (i == 0) {
            i = LogLevel.NONE;
        }
        String[] split = str2.split("\\n");
        while (true) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection == null) {
                break;
            }
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
                for (int i3 = 0; i3 < split.length; i3++) {
                    int indexOf = split[i3].indexOf(":");
                    if (indexOf > 0 && indexOf < split[i3].length()) {
                        String substring = split[i3].substring(0, indexOf);
                        String substring2 = split[i3].substring(indexOf + 1);
                        if (substring2.length() > 0) {
                            httpURLConnection.setRequestProperty(substring, substring2);
                        }
                    }
                }
                httpURLConnection.setRequestMethod(str3);
                if (z) {
                    httpURLConnection.setDoOutput(true);
                    if (bArr != null) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(bArr);
                        outputStream.flush();
                    }
                }
                hTTPStream = new HTTPStream(httpURLConnection, iArr, stringBuffer);
                int i4 = iArr[0];
                i2--;
                if (i2 < 0 || (i4 != 301 && i4 != 302 && i4 != 303 && i4 != 307)) {
                    break;
                }
                int indexOf2 = stringBuffer.indexOf("Location:") + 10;
                int indexOf3 = stringBuffer.indexOf("\n", indexOf2);
                if (indexOf3 <= indexOf2) {
                    break;
                }
                String url = new URL(new URL(str), stringBuffer.substring(indexOf2, indexOf3)).toString();
                if (url == str) {
                    break;
                }
                stringBuffer.delete(0, stringBuffer.length());
                str = url;
            } catch (Throwable unused) {
            }
        }
        return hTTPStream;
    }

    protected static String getLocaleValue(boolean z) {
        Locale locale = Locale.getDefault();
        return z ? locale.getDisplayCountry(Locale.US) : locale.getDisplayLanguage(Locale.US);
    }

    private static native void shutdownSdkNative();

    /* access modifiers changed from: protected */
    public CrashReportDecorator createCrashReportDecorator() {
        return new CrashReportDecorator(this);
    }

    /* access modifiers changed from: protected */
    public String decryptRSA(String str, String str2) {
        String str3 = "";
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64Coder.decode(str2.replace("\n", str3).replace("-----BEGIN PRIVATE KEY-----", str3).replace("-----END PRIVATE KEY-----", str3))));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            instance.init(2, generatePrivate);
            return new String(instance.doFinal(Base64Coder.decode(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String encryptRSA(String str, String str2) {
        String str3 = "";
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Coder.decode(str2.replace("\n", str3).replace("-----BEGIN PUBLIC KEY-----", str3).replace("-----END PUBLIC KEY-----", str3))));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            instance.init(1, generatePublic);
            return new String(Base64Coder.encode(instance.doFinal(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract String getAppDataDir();

    public abstract String getApplicationId();

    public abstract String getApplicationName();

    public abstract String getApplicationVersion();

    public abstract String getArchitecture();

    /* access modifiers changed from: protected */
    public abstract int getConnectivityType();

    /* access modifiers changed from: protected */
    public String getCrossPublisherId() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int getCurrentHostApplicationState();

    public abstract String[] getDeviceIds();

    public abstract String getDeviceModel();

    /* access modifiers changed from: protected */
    public String[] getInvalidIds() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getLanguage();

    public abstract String getOsName();

    public abstract String getOsVersion();

    /* access modifiers changed from: protected */
    public abstract Map<String, String> getPlatformLabels(Map<String, String> map);

    public abstract String getRuntimeName();

    public abstract String getRuntimeVersion();

    /* access modifiers changed from: protected */
    public abstract int getScreenHeight();

    /* access modifiers changed from: protected */
    public abstract int getScreenWidth();

    /* access modifiers changed from: protected */
    public abstract boolean isJailBroken();

    /* access modifiers changed from: protected */
    public void libraryPostUpdate(String str, String str2, Map<String, String> map, ArrayList<String> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void libraryUpdate(String str, String str2, Map<String, String> map) {
    }

    /* access modifiers changed from: protected */
    public void onCoreCreated() {
    }

    /* access modifiers changed from: protected */
    public void onCoreDestroyed() {
    }

    /* access modifiers changed from: protected */
    public void onCoreInitializationFinished() {
    }

    /* access modifiers changed from: protected */
    public void onCoreStarted() {
    }

    public void onLogError(String str, Throwable th) {
        this.crashReporter.addReport(new CrashReport(str, th, null));
    }

    public void shutdownSdk() {
        try {
            shutdownSdkNative();
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library: ", (Throwable) e);
        }
    }

    public void start() {
        this.crashReporter.start();
    }

    public abstract boolean subscribeToForegroundNotification();

    public abstract boolean unsubscribeFromForegroundNotification();
}
