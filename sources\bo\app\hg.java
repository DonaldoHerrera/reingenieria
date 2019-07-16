package bo.app;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.provider.MediaStore.Video.Thumbnails;
import android.webkit.MimeTypeMap;
import bo.app.hh.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class hg implements hh {
    protected final Context a;
    protected final int b;
    protected final int c;

    /* renamed from: bo.app.hg$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            a[a.HTTP.ordinal()] = 1;
            a[a.HTTPS.ordinal()] = 2;
            a[a.FILE.ordinal()] = 3;
            a[a.CONTENT.ordinal()] = 4;
            a[a.ASSETS.ordinal()] = 5;
            a[a.DRAWABLE.ordinal()] = 6;
            try {
                a[a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public hg(Context context) {
        this(context, 5000, 20000);
    }

    public InputStream a(String str, Object obj) {
        switch (AnonymousClass1.a[a.a(str).ordinal()]) {
            case 1:
            case 2:
                return b(str, obj);
            case 3:
                return d(str, obj);
            case 4:
                return e(str, obj);
            case 5:
                return f(str, obj);
            case 6:
                return g(str, obj);
            default:
                return h(str, obj);
        }
    }

    /* access modifiers changed from: protected */
    public InputStream b(String str, Object obj) {
        HttpURLConnection c2 = c(str, obj);
        int i = 0;
        while (c2.getResponseCode() / 100 == 3 && i < 5) {
            c2 = c(c2.getHeaderField("Location"), obj);
            i++;
        }
        try {
            InputStream inputStream = c2.getInputStream();
            if (a(c2)) {
                return new gp(new BufferedInputStream(inputStream, 32768), c2.getContentLength());
            }
            hq.a((Closeable) inputStream);
            StringBuilder sb = new StringBuilder();
            sb.append("Image request failed with response code ");
            sb.append(c2.getResponseCode());
            throw new IOException(sb.toString());
        } catch (IOException e) {
            hq.a(c2.getErrorStream());
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection c(String str, Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, "@#&=*+-_.,:!?()/~'%")).openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        return httpURLConnection;
    }

    /* access modifiers changed from: protected */
    public InputStream d(String str, Object obj) {
        String c2 = a.FILE.c(str);
        if (b(str)) {
            return a(c2);
        }
        return new gp(new BufferedInputStream(new FileInputStream(c2), 32768), (int) new File(c2).length());
    }

    /* access modifiers changed from: protected */
    public InputStream e(String str, Object obj) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (b(parse)) {
            Bitmap thumbnail = Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith("content://com.android.contacts/")) {
            return a(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    /* access modifiers changed from: protected */
    public InputStream f(String str, Object obj) {
        return this.a.getAssets().open(a.ASSETS.c(str));
    }

    /* access modifiers changed from: protected */
    public InputStream g(String str, Object obj) {
        return this.a.getResources().openRawResource(Integer.parseInt(a.DRAWABLE.c(str)));
    }

    /* access modifiers changed from: protected */
    public InputStream h(String str, Object obj) {
        throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[]{str}));
    }

    public hg(Context context, int i, int i2) {
        this.a = context.getApplicationContext();
        this.b = i;
        this.c = i2;
    }

    /* access modifiers changed from: protected */
    public boolean a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() == 200;
    }

    @TargetApi(8)
    private InputStream a(String str) {
        if (VERSION.SDK_INT >= 8) {
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2);
            if (createVideoThumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createVideoThumbnail.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return null;
    }

    private boolean b(Uri uri) {
        String type = this.a.getContentResolver().getType(uri);
        return type != null && type.startsWith("video/");
    }

    private boolean b(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video/");
    }

    /* access modifiers changed from: protected */
    @TargetApi(14)
    public InputStream a(Uri uri) {
        ContentResolver contentResolver = this.a.getContentResolver();
        if (VERSION.SDK_INT >= 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri);
    }
}
