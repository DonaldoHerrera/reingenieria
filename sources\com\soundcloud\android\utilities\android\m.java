package com.soundcloud.android.utilities.android;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: ThreadUtils.kt */
public final class m {
    public static final void a(String str) {
        C7471uYa.b(str, "message");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C7471uYa.a((Object) mainLooper, "Looper.getMainLooper()");
        if (currentThread == mainLooper.getThread()) {
            KYa kYa = KYa.a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[ %s ]");
            String sb2 = sb.toString();
            Object[] objArr = {Thread.currentThread()};
            String format = String.format(sb2, Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, "java.lang.String.format(format, *args)");
            throw new IllegalStateException(format);
        }
    }

    public static final void b(String str) {
        C7471uYa.b(str, "message");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C7471uYa.a((Object) mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            KYa kYa = KYa.a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[ %s ]");
            String sb2 = sb.toString();
            Object[] objArr = {Thread.currentThread()};
            String format = String.format(sb2, Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, "java.lang.String.format(format, *args)");
            throw new IllegalStateException(format);
        }
    }
}
