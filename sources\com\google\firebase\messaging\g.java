package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class g implements Closeable {
    private final URL a;
    private Wy<Bitmap> b;
    private volatile InputStream c;

    private g(URL url) {
        this.a = url;
    }

    public static g a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new g(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00a7=Splitter:B:28:0x00a7, B:12:0x006b=Splitter:B:12:0x006b} */
    public final Bitmap b() throws IOException {
        InputStream inputStream;
        Throwable th;
        Throwable th2;
        Throwable th3;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        String str = "FirebaseMessaging";
        Log.i(str, sb.toString());
        try {
            inputStream = this.a.openConnection().getInputStream();
            InputStream a2 = Ls.a(inputStream, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            try {
                this.c = inputStream;
                Bitmap decodeStream = BitmapFactory.decodeStream(a2);
                if (decodeStream != null) {
                    if (Log.isLoggable(str, 3)) {
                        String valueOf2 = String.valueOf(this.a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                        sb2.append("Successfully downloaded image: ");
                        sb2.append(valueOf2);
                        Log.d(str, sb2.toString());
                    }
                    a(null, a2);
                    if (inputStream != null) {
                        a(null, inputStream);
                    }
                    return decodeStream;
                }
                String valueOf3 = String.valueOf(this.a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                sb3.append("Failed to decode image: ");
                sb3.append(valueOf3);
                String sb4 = sb3.toString();
                Log.w(str, sb4);
                throw new IOException(sb4);
            } catch (Throwable th4) {
                Throwable th5 = th4;
                th2 = r3;
                th3 = th5;
            }
            a(th2, a2);
            throw th3;
        } catch (IOException e) {
            String valueOf4 = String.valueOf(this.a);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
            sb5.append("Failed to download image: ");
            sb5.append(valueOf4);
            Log.w(str, sb5.toString());
            throw e;
        } catch (Throwable th6) {
            if (inputStream != null) {
                a(th, inputStream);
            }
            throw th6;
        }
    }

    public final void close() {
        Ms.a(this.c);
    }

    public final void a(Executor executor) {
        this.b = Zy.a(executor, (Callable<TResult>) new h<TResult>(this));
    }

    public final Wy<Bitmap> a() {
        Wy<Bitmap> wy = this.b;
        Preconditions.checkNotNull(wy);
        return wy;
    }

    private static /* synthetic */ void a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                Ps.a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }
}
