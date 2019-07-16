package com.google.firebase.perf.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C;
import com.google.android.gms.internal.firebase-perf.C0848i;
import com.google.android.gms.internal.firebase-perf.C0860l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class p {
    private final Runtime a;
    private final ActivityManager b;
    private final MemoryInfo c;
    private final String d;
    private final Context e;

    p(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return C0848i.a(C.BYTES.a(this.a.maxMemory()));
    }

    public final int c() {
        return C0848i.a(C.MEGABYTES.a((long) this.b.getMemoryClass()));
    }

    public final int d() {
        if (VERSION.SDK_INT >= 16) {
            return C0848i.a(C.BYTES.a(this.c.totalMem));
        }
        return a("/proc/meminfo");
    }

    private p(Runtime runtime, Context context) {
        String str;
        this.a = runtime;
        this.e = context;
        this.b = (ActivityManager) context.getSystemService("activity");
        this.c = new MemoryInfo();
        this.b.getMemoryInfo(this.c);
        int myPid = Process.myPid();
        List runningAppProcesses = this.b.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
            this.d = str;
        }
        str = this.e.getPackageName();
        this.d = str;
    }

    private static int a(String str) {
        BufferedReader bufferedReader;
        String str2 = "' file: ";
        String str3 = "FirebasePerformance";
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (readLine.startsWith("MemTotal")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
                    int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
                    bufferedReader.close();
                    return parseInt;
                }
            }
            bufferedReader.close();
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(message).length());
            sb.append("Unable to read '");
            sb.append(str);
            sb.append(str2);
            sb.append(message);
            Log.w(str3, sb.toString());
        } catch (NumberFormatException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(message2).length());
            sb2.append("Unable to parse '");
            sb2.append(str);
            sb2.append(str2);
            sb2.append(message2);
            Log.w(str3, sb2.toString());
        } catch (Throwable th) {
            C0860l.a(r4, th);
        }
        return 0;
        throw th;
    }
}
