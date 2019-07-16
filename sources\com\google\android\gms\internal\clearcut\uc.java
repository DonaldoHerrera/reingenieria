package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.a.b;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.phenotype.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class uc implements b {
    private static final Charset a = Charset.forName("UTF-8");
    private static final C0781p b;
    private static final C0781p c;
    private static final ConcurrentHashMap<String, C0751f<gc>> d = new ConcurrentHashMap<>();
    private static final HashMap<String, C0751f<String>> e = new HashMap<>();
    @VisibleForTesting
    private static Boolean f = null;
    @VisibleForTesting
    private static Long g = null;
    @VisibleForTesting
    private static final C0751f<Boolean> h = b.a("enable_log_sampling_rules", false);
    private final Context i;

    static {
        String str = "com.google.android.gms.clearcut.public";
        b = new C0781p(a.a(str)).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
        c = new C0781p(a.a(str)).a("gms:playlog:service:sampling_").b("LogSampling__");
    }

    public uc(Context context) {
        this.i = context;
        Context context2 = this.i;
        if (context2 != null) {
            C0751f.a(context2);
        }
    }

    @VisibleForTesting
    private static long a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return pc.a(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(a);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return pc.a(allocate.array());
    }

    @VisibleForTesting
    private static gc.b a(String str) {
        String str2;
        int i2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i2 = indexOf + 1;
        } else {
            str2 = "";
            i2 = 0;
        }
        int indexOf2 = str.indexOf(47, i2);
        String str3 = "LogSamplerImpl";
        if (indexOf2 <= 0) {
            String str4 = "Failed to parse the rule: ";
            String valueOf = String.valueOf(str);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i2, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong < 0 || parseLong2 < 0) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("negative values not supported: ");
                sb.append(parseLong);
                sb.append("/");
                sb.append(parseLong2);
                Log.e(str3, sb.toString());
                return null;
            }
            gc.b.a p = gc.b.p();
            p.a(str2);
            p.a(parseLong);
            p.b(parseLong2);
            return (gc.b) p.k();
        } catch (NumberFormatException e2) {
            String str5 = "parseLong() failed while parsing: ";
            String valueOf2 = String.valueOf(str);
            Log.e(str3, valueOf2.length() != 0 ? str5.concat(valueOf2) : new String(str5), e2);
            return null;
        }
    }

    @VisibleForTesting
    private static boolean a(long j, long j2, long j3) {
        if (j2 >= 0 && j3 > 0) {
            if ((j >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Context context) {
        if (f == null) {
            f = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f.booleanValue();
    }

    @VisibleForTesting
    private static long b(Context context) {
        if (g == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (a(context)) {
                j = xc.a(context.getContentResolver(), "android_id", 0);
            }
            g = Long.valueOf(j);
        }
        return g.longValue();
    }

    public final boolean a(zze zze) {
        List<gc.b> list;
        zzr zzr = zze.a;
        String str = zzr.g;
        int i2 = zzr.c;
        lc lcVar = zze.i;
        int i3 = lcVar != null ? lcVar.g : 0;
        String str2 = null;
        if (!((Boolean) h.a()).booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i2 >= 0 ? String.valueOf(i2) : null;
            }
            if (str != null) {
                Context context = this.i;
                if (context != null && a(context)) {
                    C0751f fVar = (C0751f) e.get(str);
                    if (fVar == null) {
                        fVar = c.a(str, (String) null);
                        e.put(str, fVar);
                    }
                    str2 = (String) fVar.a();
                }
                gc.b a2 = a(str2);
                if (a2 != null) {
                    return a(a(a2.m(), b(this.i)), a2.n(), a2.o());
                }
            }
        } else {
            if (str == null || str.isEmpty()) {
                str = i2 >= 0 ? String.valueOf(i2) : null;
            }
            if (str != null) {
                if (this.i == null) {
                    list = Collections.emptyList();
                } else {
                    C0751f fVar2 = (C0751f) d.get(str);
                    if (fVar2 == null) {
                        fVar2 = b.a(str, gc.l(), vc.a);
                        C0751f fVar3 = (C0751f) d.putIfAbsent(str, fVar2);
                        if (fVar3 != null) {
                            fVar2 = fVar3;
                        }
                    }
                    list = ((gc) fVar2.a()).k();
                }
                for (gc.b bVar : list) {
                    if ((!bVar.l() || bVar.k() == 0 || bVar.k() == i3) && !a(a(bVar.m(), b(this.i)), bVar.n(), bVar.o())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
