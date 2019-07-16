package defpackage;

import android.content.Context;
import java.util.WeakHashMap;

/* renamed from: lb reason: default package and case insensitive filesystem */
/* compiled from: DisplayManagerCompat */
public final class C1474lb {
    private static final WeakHashMap<Context, C1474lb> a = new WeakHashMap<>();
    private final Context b;

    private C1474lb(Context context) {
        this.b = context;
    }

    public static C1474lb a(Context context) {
        C1474lb lbVar;
        synchronized (a) {
            lbVar = (C1474lb) a.get(context);
            if (lbVar == null) {
                lbVar = new C1474lb(context);
                a.put(context, lbVar);
            }
        }
        return lbVar;
    }
}
