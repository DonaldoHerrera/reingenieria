package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: VCb reason: default package */
/* compiled from: DateTimeTextProvider */
public abstract class VCb {
    /* access modifiers changed from: private */
    public static final AtomicReference<VCb> a = new AtomicReference<>();

    /* renamed from: VCb$a */
    /* compiled from: DateTimeTextProvider */
    static class a {
        static final VCb a = a();

        static VCb a() {
            VCb.a.compareAndSet(null, new _Cb());
            return (VCb) VCb.a.get();
        }
    }

    static VCb b() {
        return a.a;
    }

    public abstract String a(C7381tDb tdb, long j, C5555aDb adb, Locale locale);

    public abstract Iterator<Entry<String, Long>> a(C7381tDb tdb, C5555aDb adb, Locale locale);
}
