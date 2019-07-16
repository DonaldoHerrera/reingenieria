package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: LCb reason: default package */
/* compiled from: DateTimeFormatterBuilder */
class LCb extends VCb {
    final /* synthetic */ a b;
    final /* synthetic */ OCb c;

    LCb(OCb oCb, a aVar) {
        this.c = oCb;
        this.b = aVar;
    }

    public String a(C7381tDb tdb, long j, C5555aDb adb, Locale locale) {
        return this.b.a(j, adb);
    }

    public Iterator<Entry<String, Long>> a(C7381tDb tdb, C5555aDb adb, Locale locale) {
        return this.b.a(adb);
    }
}
