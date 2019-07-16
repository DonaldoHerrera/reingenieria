package com.soundcloud.android.profile;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.soundcloud.android.profile.m reason: case insensitive filesystem */
/* compiled from: BirthdayInfo */
public class C5815m implements Serializable {
    private static final Calendar a = Calendar.getInstance();
    public final int b;

    /* renamed from: com.soundcloud.android.profile.m$a */
    /* compiled from: BirthdayInfo */
    public static class a extends Throwable {
    }

    private C5815m(int i) {
        this.b = i;
    }

    public static C5815m a(int i) {
        return new C5815m(i);
    }

    public int b() {
        return a.get(1) - this.b;
    }

    public int a() {
        return a.get(2) + 1;
    }

    public static C5815m a(C5694cGa cga, String str) throws a {
        try {
            return new C5815m((int) EBb.a(C6827lBb.a((CharSequence) str, JCb.a("MM/dd/yyyy", Locale.US)), C6623iBb.a(cga.a()).a(NBb.of("UTC")).toLocalDate()).a((DDb) C6491gDb.YEARS));
        } catch (Exception unused) {
            throw new a();
        }
    }
}
