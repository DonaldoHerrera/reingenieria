package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import bo.app.i;
import com.adjust.sdk.Constants;
import com.appboy.h;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Fg reason: default package */
public class Fg {
    private static final String a = Hg.a(Fg.class);
    public static final List<String> b = Collections.unmodifiableList(Arrays.asList(new String[]{"http", Constants.SCHEME, "ftp", "ftps", "about", "javascript"}));

    public static void a(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        for (String file2 : file.list()) {
                            a(new File(file, file2));
                        }
                    }
                    file.delete();
                }
            } catch (Exception e) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Caught exception while trying to delete file or directory ");
                sb.append(file.getName());
                Hg.b(str, sb.toString(), e);
            }
        }
    }

    public static boolean b(Uri uri) {
        if (uri == null) {
            Hg.c(a, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (!Ng.d(scheme)) {
            return b.contains(scheme);
        }
        Hg.c(a, "Null or blank Uri scheme.");
        return false;
    }

    public static boolean a(Uri uri) {
        boolean z = false;
        if (uri == null) {
            Hg.c(a, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (Ng.d(scheme) || scheme.equals("file")) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0167 A[SYNTHETIC, Splitter:B:100:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x016f A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128 A[SYNTHETIC, Splitter:B:72:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0130 A[Catch:{ Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014c A[SYNTHETIC, Splitter:B:87:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0154 A[Catch:{ Exception -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0162  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x011a=Splitter:B:67:0x011a, B:82:0x013e=Splitter:B:82:0x013e} */
    public static File a(String str, String str2, String str3, String str4) {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        DataInputStream dataInputStream;
        BufferedOutputStream bufferedOutputStream2;
        String str5 = "Exception during closing of file download streams.";
        DataInputStream dataInputStream2 = null;
        if (h.e()) {
            String str6 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("SDK is offline. File not downloaded for url: ");
            sb.append(str2);
            Hg.c(str6, sb.toString());
            return null;
        } else if (Ng.d(str)) {
            Hg.c(a, "Download directory null or blank. File not downloaded.");
            return null;
        } else if (Ng.d(str2)) {
            Hg.c(a, "Zip file url null or blank. File not downloaded.");
            return null;
        } else if (Ng.d(str3)) {
            Hg.c(a, "Output filename null or blank. File not downloaded.");
            return null;
        } else {
            try {
                new File(str).mkdirs();
                if (!Ng.d(str4)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(str4);
                    str3 = sb2.toString();
                }
                File file = new File(str, str3);
                URL url = new URL(str2);
                httpURLConnection = (HttpURLConnection) i.a(url);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str7 = a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("HTTP response code was ");
                        sb3.append(responseCode);
                        sb3.append(". File with url ");
                        sb3.append(str2);
                        sb3.append(" could not be downloaded.");
                        Hg.a(str7, sb3.toString());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                    byte[] bArr = new byte[8192];
                    dataInputStream = new DataInputStream(i.a(url).getInputStream());
                    try {
                        BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(file));
                        while (true) {
                            try {
                                int read = dataInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream3.write(bArr, 0, read);
                            } catch (Exception e) {
                                Throwable th = e;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                e = th;
                                Hg.b(a, "Exception during download of file from url.", e);
                                if (httpURLConnection != null) {
                                }
                                if (dataInputStream != null) {
                                }
                                if (bufferedOutputStream != null) {
                                }
                                return null;
                            } catch (Throwable th2) {
                                dataInputStream2 = dataInputStream;
                                Throwable th3 = th2;
                                bufferedOutputStream = bufferedOutputStream3;
                                th = th3;
                                if (httpURLConnection != null) {
                                }
                                if (dataInputStream2 != null) {
                                }
                                if (bufferedOutputStream != null) {
                                }
                                throw th;
                            }
                        }
                        dataInputStream.close();
                        httpURLConnection.disconnect();
                        bufferedOutputStream3.close();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        try {
                            dataInputStream.close();
                            bufferedOutputStream3.close();
                        } catch (Exception e2) {
                            Hg.b(a, str5, e2);
                        }
                        return file;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedOutputStream2 = null;
                        Hg.b(a, "Exception during download of file from url.", e);
                        if (httpURLConnection != null) {
                        }
                        if (dataInputStream != null) {
                        }
                        if (bufferedOutputStream != null) {
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                        dataInputStream2 = dataInputStream;
                        if (httpURLConnection != null) {
                        }
                        if (dataInputStream2 != null) {
                        }
                        if (bufferedOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedOutputStream2 = null;
                    dataInputStream = null;
                    Hg.b(a, "Exception during download of file from url.", e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (Exception e5) {
                            Hg.b(a, str5, e5);
                            return null;
                        }
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedOutputStream = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataInputStream2 != null) {
                        try {
                            dataInputStream2.close();
                        } catch (Exception e6) {
                            Hg.b(a, str5, e6);
                            throw th;
                        }
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                bufferedOutputStream2 = null;
                httpURLConnection = null;
                dataInputStream = null;
                Hg.b(a, "Exception during download of file from url.", e);
                if (httpURLConnection != null) {
                }
                if (dataInputStream != null) {
                }
                if (bufferedOutputStream != null) {
                }
                return null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
                httpURLConnection = null;
                if (httpURLConnection != null) {
                }
                if (dataInputStream2 != null) {
                }
                if (bufferedOutputStream != null) {
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076 A[SYNTHETIC, Splitter:B:31:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[SYNTHETIC, Splitter:B:41:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A[Catch:{ Exception -> 0x009e }] */
    public static String a(AssetManager assetManager, String str) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String str2 = "Exception attempting to close file download streams for path:";
        try {
            inputStream = assetManager.open(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            } catch (Exception e) {
                e = e;
                bufferedReader = null;
                try {
                    String str3 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception attempting to get asset content for ");
                    sb.append(str);
                    Hg.b(str3, sb.toString(), e);
                    if (inputStream != null) {
                    }
                    if (bufferedReader != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                    }
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                bufferedReader = null;
                th = th3;
                if (inputStream != null) {
                }
                if (bufferedReader != null) {
                }
                throw th;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append(10);
                }
                String sb3 = sb2.toString();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        String str4 = a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append(str);
                        Hg.b(str4, sb4.toString(), e2);
                    }
                }
                bufferedReader.close();
                return sb3;
            } catch (Exception e3) {
                e = e3;
                String str32 = a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Exception attempting to get asset content for ");
                sb5.append(str);
                Hg.b(str32, sb5.toString(), e);
                if (inputStream != null) {
                }
                if (bufferedReader != null) {
                }
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
            bufferedReader = null;
            String str322 = a;
            StringBuilder sb52 = new StringBuilder();
            sb52.append("Exception attempting to get asset content for ");
            sb52.append(str);
            Hg.b(str322, sb52.toString(), e);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    String str5 = a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    sb6.append(str);
                    Hg.b(str5, sb6.toString(), e5);
                    return null;
                }
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            inputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e6) {
                    String str6 = a;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str2);
                    sb7.append(str);
                    Hg.b(str6, sb7.toString(), e6);
                    throw th;
                }
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }
}
