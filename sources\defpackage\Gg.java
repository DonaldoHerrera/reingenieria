package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import bo.app.i;
import com.appboy.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* renamed from: Gg reason: default package */
public class Gg {
    private static final String a = Hg.a(Gg.class);

    public static Bitmap a(Uri uri) {
        return a((Context) null, uri, (Ff) null);
    }

    private static Bitmap b(Uri uri) {
        try {
            File file = new File(uri.getPath());
            if (file.exists()) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Retrieving image from path: ");
                sb.append(file.getAbsolutePath());
                Hg.c(str, sb.toString());
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (OutOfMemoryError e) {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Out of Memory Error in local bitmap file retrieval for Uri: ");
            sb2.append(uri.toString());
            sb2.append(".");
            Hg.b(str2, sb2.toString(), e);
        } catch (Exception e2) {
            Hg.b(a, "Exception occurred when attempting to retrieve local bitmap.", e2);
        } catch (Throwable th) {
            String str3 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Throwable caught in local bitmap file retrieval for Uri: ");
            sb3.append(uri.toString());
            Hg.b(str3, sb3.toString(), th);
        }
        return null;
    }

    public static Bitmap a(Context context, Uri uri, Ff ff) {
        if (uri == null) {
            Hg.c(a, "Null Uri received. Not getting image.");
            return null;
        } else if (Fg.a(uri)) {
            return b(uri);
        } else {
            if (!Fg.b(uri)) {
                Hg.e(a, "Uri with unknown scheme received. Not getting image.");
                return null;
            } else if (context == null || ff == null) {
                return a(uri, 0, 0);
            } else {
                DisplayMetrics a2 = a(context);
                return a(uri, a(a2.densityDpi, ff.b()), a(a2.densityDpi, ff.a()));
            }
        }
    }

    public static DisplayMetrics a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int a(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018f A[SYNTHETIC, Splitter:B:104:0x018f] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019b A[SYNTHETIC, Splitter:B:109:0x019b] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01c1 A[SYNTHETIC, Splitter:B:119:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cd A[SYNTHETIC, Splitter:B:124:0x01cd] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0200 A[SYNTHETIC, Splitter:B:136:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x020c A[SYNTHETIC, Splitter:B:141:0x020c] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0237 A[SYNTHETIC, Splitter:B:151:0x0237] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0243 A[SYNTHETIC, Splitter:B:156:0x0243] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x026d A[SYNTHETIC, Splitter:B:166:0x026d] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0279 A[SYNTHETIC, Splitter:B:171:0x0279] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0285 A[SYNTHETIC, Splitter:B:178:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0291 A[SYNTHETIC, Splitter:B:183:0x0291] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:99:0x0172=Splitter:B:99:0x0172, B:114:0x01a4=Splitter:B:114:0x01a4, B:146:0x0215=Splitter:B:146:0x0215, B:161:0x024b=Splitter:B:161:0x024b, B:131:0x01de=Splitter:B:131:0x01de} */
    private static Bitmap a(Uri uri, int i, int i2) {
        InputStream inputStream;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream3;
        InputStream inputStream4;
        InputStream inputStream5;
        InputStream inputStream6;
        InputStream inputStream7;
        String str = " width ";
        String str2 = "IOException during closing of bitmap download stream.";
        String str3 = "IOException during closing of bitmap metadata download stream.";
        String uri2 = uri.toString();
        if (h.e()) {
            String str4 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("SDK is in offline mode, not downloading remote bitmap with uri: ");
            sb.append(uri2);
            Hg.c(str4, sb.toString());
            return null;
        }
        try {
            URL url = new URL(uri2);
            httpURLConnection = (HttpURLConnection) i.a(url);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    String str5 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("HTTP response code was ");
                    sb2.append(responseCode);
                    sb2.append(". Bitmap with url ");
                    sb2.append(url);
                    sb2.append(" could not be downloaded.");
                    Hg.e(str5, sb2.toString());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                inputStream2 = i.a(url).getInputStream();
                if (i == 0 || i2 == 0) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e) {
                            Hg.b(a, str3, e);
                        }
                    }
                    return decodeStream;
                }
                try {
                    String str6 = a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Sampling bitmap with destination image bounds: (height ");
                    sb3.append(i2);
                    sb3.append(str);
                    sb3.append(i);
                    sb3.append(")");
                    Hg.a(str6, sb3.toString());
                    inputStream = i.a(url).getInputStream();
                    try {
                        Options a2 = a(inputStream);
                        if (a2.outHeight != 0) {
                            if (a2.outWidth != 0) {
                                Bitmap a3 = a(inputStream2, a2, i, i2);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e2) {
                                        Hg.b(a, str3, e2);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        Hg.b(a, str2, e3);
                                    }
                                }
                                return a3;
                            }
                        }
                        String str7 = a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("The bitmap metadata with image url ");
                        sb4.append(url);
                        sb4.append(" had bounds: (height ");
                        sb4.append(a2.outHeight);
                        sb4.append(str);
                        sb4.append(a2.outWidth);
                        sb4.append("). Returning a bitmap with no sampling.");
                        Hg.e(str7, sb4.toString());
                        Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream2);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e4) {
                                Hg.b(a, str3, e4);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                Hg.b(a, str2, e5);
                            }
                        }
                        return decodeStream2;
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        String str8 = a;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Out of Memory Error in image bitmap download for Uri: ");
                        sb5.append(uri2);
                        sb5.append(".");
                        Hg.b(str8, sb5.toString(), e);
                        if (httpURLConnection != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        return null;
                    } catch (UnknownHostException e7) {
                        e = e7;
                        String str9 = a;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Unknown Host Exception in image bitmap download for Uri: ");
                        sb6.append(uri2);
                        sb6.append(". Device may be offline.");
                        Hg.b(str9, sb6.toString(), e);
                        if (httpURLConnection != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        return null;
                    } catch (MalformedURLException e8) {
                        e = e8;
                        String str10 = a;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Malformed URL Exception in image bitmap download for Uri: ");
                        sb7.append(uri2);
                        sb7.append(". Image Uri may be corrupted.");
                        Hg.b(str10, sb7.toString(), e);
                        if (httpURLConnection != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        return null;
                    } catch (Exception e9) {
                        e = e9;
                        String str11 = a;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Exception in image bitmap download for Uri: ");
                        sb8.append(uri2);
                        Hg.b(str11, sb8.toString(), e);
                        if (httpURLConnection != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            String str12 = a;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("Throwable caught in image bitmap download for Uri: ");
                            sb9.append(uri2);
                            Hg.b(str12, sb9.toString(), th);
                            if (httpURLConnection != null) {
                            }
                            if (inputStream2 != null) {
                            }
                            if (inputStream != null) {
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (httpURLConnection != null) {
                            }
                            if (inputStream2 != null) {
                            }
                            if (inputStream != null) {
                            }
                            throw th;
                        }
                    }
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    inputStream = null;
                    String str82 = a;
                    StringBuilder sb52 = new StringBuilder();
                    sb52.append("Out of Memory Error in image bitmap download for Uri: ");
                    sb52.append(uri2);
                    sb52.append(".");
                    Hg.b(str82, sb52.toString(), e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e11) {
                            Hg.b(a, str3, e11);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (UnknownHostException e12) {
                    e = e12;
                    inputStream = null;
                    String str92 = a;
                    StringBuilder sb62 = new StringBuilder();
                    sb62.append("Unknown Host Exception in image bitmap download for Uri: ");
                    sb62.append(uri2);
                    sb62.append(". Device may be offline.");
                    Hg.b(str92, sb62.toString(), e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e13) {
                            Hg.b(a, str3, e13);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (MalformedURLException e14) {
                    e = e14;
                    inputStream = null;
                    String str102 = a;
                    StringBuilder sb72 = new StringBuilder();
                    sb72.append("Malformed URL Exception in image bitmap download for Uri: ");
                    sb72.append(uri2);
                    sb72.append(". Image Uri may be corrupted.");
                    Hg.b(str102, sb72.toString(), e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Hg.b(a, str3, e15);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (Exception e16) {
                    e = e16;
                    inputStream = null;
                    String str112 = a;
                    StringBuilder sb82 = new StringBuilder();
                    sb82.append("Exception in image bitmap download for Uri: ");
                    sb82.append(uri2);
                    Hg.b(str112, sb82.toString(), e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e17) {
                            Hg.b(a, str3, e17);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e18) {
                            Hg.b(a, str3, e18);
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e19) {
                            Hg.b(a, str2, e19);
                        }
                    }
                    throw th;
                }
            } catch (OutOfMemoryError e20) {
                e = e20;
                inputStream3 = null;
                inputStream = inputStream2;
                String str822 = a;
                StringBuilder sb522 = new StringBuilder();
                sb522.append("Out of Memory Error in image bitmap download for Uri: ");
                sb522.append(uri2);
                sb522.append(".");
                Hg.b(str822, sb522.toString(), e);
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
                if (inputStream != null) {
                }
                return null;
            } catch (UnknownHostException e21) {
                e = e21;
                inputStream4 = null;
                inputStream = inputStream2;
                String str922 = a;
                StringBuilder sb622 = new StringBuilder();
                sb622.append("Unknown Host Exception in image bitmap download for Uri: ");
                sb622.append(uri2);
                sb622.append(". Device may be offline.");
                Hg.b(str922, sb622.toString(), e);
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
                if (inputStream != null) {
                }
                return null;
            } catch (MalformedURLException e22) {
                e = e22;
                inputStream5 = null;
                inputStream = inputStream2;
                String str1022 = a;
                StringBuilder sb722 = new StringBuilder();
                sb722.append("Malformed URL Exception in image bitmap download for Uri: ");
                sb722.append(uri2);
                sb722.append(". Image Uri may be corrupted.");
                Hg.b(str1022, sb722.toString(), e);
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
                if (inputStream != null) {
                }
                return null;
            } catch (Exception e23) {
                e = e23;
                inputStream6 = null;
                inputStream = inputStream2;
                String str1122 = a;
                StringBuilder sb822 = new StringBuilder();
                sb822.append("Exception in image bitmap download for Uri: ");
                sb822.append(uri2);
                Hg.b(str1122, sb822.toString(), e);
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
                if (inputStream != null) {
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                inputStream2 = null;
                inputStream = inputStream2;
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
                if (inputStream != null) {
                }
                throw th;
            }
        } catch (OutOfMemoryError e24) {
            e = e24;
            httpURLConnection = null;
            inputStream3 = null;
            inputStream = inputStream2;
            String str8222 = a;
            StringBuilder sb5222 = new StringBuilder();
            sb5222.append("Out of Memory Error in image bitmap download for Uri: ");
            sb5222.append(uri2);
            sb5222.append(".");
            Hg.b(str8222, sb5222.toString(), e);
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (inputStream != null) {
            }
            return null;
        } catch (UnknownHostException e25) {
            e = e25;
            httpURLConnection = null;
            inputStream4 = null;
            inputStream = inputStream2;
            String str9222 = a;
            StringBuilder sb6222 = new StringBuilder();
            sb6222.append("Unknown Host Exception in image bitmap download for Uri: ");
            sb6222.append(uri2);
            sb6222.append(". Device may be offline.");
            Hg.b(str9222, sb6222.toString(), e);
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (inputStream != null) {
            }
            return null;
        } catch (MalformedURLException e26) {
            e = e26;
            httpURLConnection = null;
            inputStream5 = null;
            inputStream = inputStream2;
            String str10222 = a;
            StringBuilder sb7222 = new StringBuilder();
            sb7222.append("Malformed URL Exception in image bitmap download for Uri: ");
            sb7222.append(uri2);
            sb7222.append(". Image Uri may be corrupted.");
            Hg.b(str10222, sb7222.toString(), e);
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (inputStream != null) {
            }
            return null;
        } catch (Exception e27) {
            e = e27;
            httpURLConnection = null;
            inputStream6 = null;
            inputStream = inputStream2;
            String str11222 = a;
            StringBuilder sb8222 = new StringBuilder();
            sb8222.append("Exception in image bitmap download for Uri: ");
            sb8222.append(uri2);
            Hg.b(str11222, sb8222.toString(), e);
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (inputStream != null) {
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream2 = null;
            inputStream = inputStream2;
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public static int a() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 32, 2147483647L), 1048576));
    }

    static Options a(InputStream inputStream) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    private static Bitmap a(InputStream inputStream, Options options, int i, int i2) {
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    static int a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Calculating sample size for source image bounds: (height ");
        sb.append(options.outHeight);
        String str2 = " width ";
        sb.append(str2);
        sb.append(options.outWidth);
        sb.append(") and destination image bounds: (height ");
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        sb.append(")");
        Hg.a(str, sb.toString());
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        String str3 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Using image sample size of ");
        sb2.append(i5);
        Hg.a(str3, sb2.toString());
        return i5;
    }
}
