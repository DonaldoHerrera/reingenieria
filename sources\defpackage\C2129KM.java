package defpackage;

import android.content.ContentValues;
import com.google.common.base.Function;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.List;

/* renamed from: KM reason: default package and case insensitive filesystem */
/* compiled from: TrackingStorage */
class C2129KM {
    private final C5500ZKa a;
    private final C6834lGa b;

    C2129KM(@g C5500ZKa zKa, C6834lGa lga) {
        this.a = zKa;
        this.b = lga;
    }

    private List<C2110JM> b(String str) {
        C6975nLa a2 = C6975nLa.a(C1992DM.a.name());
        if (str != null) {
            a2.d("backend", (Object) str);
        }
        if (!this.b.a()) {
            a2.a(30);
        }
        return this.a.a(a2).b(C2127KK.a);
    }

    private ContentValues c(C2110JM jm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend", jm.a());
        contentValues.put("timestamp", Long.valueOf(jm.d()));
        contentValues.put("data", jm.b());
        return contentValues;
    }

    /* access modifiers changed from: 0000 */
    public C5413WKa a(C2110JM jm) throws UnsupportedEncodingException {
        return this.a.a(C1992DM.a, c(jm), 4);
    }

    /* access modifiers changed from: 0000 */
    public List<C2110JM> a(String str) {
        return b(str);
    }

    /* access modifiers changed from: 0000 */
    public List<C2110JM> a() {
        return b((String) null);
    }

    static /* synthetic */ C2110JM a(C5326TKa tKa) {
        C2110JM jm = new C2110JM((long) tKa.c("_id"), tKa.d("timestamp"), tKa.e("backend"), tKa.e("data"));
        return jm;
    }

    /* access modifiers changed from: 0000 */
    public C5266RKa a(List<C2110JM> list) {
        int i;
        C5266RKa a2;
        List a3 = C2063HD.a(list, (Function<? super F, ? extends T>) C2146LK.a);
        int i2 = 0;
        while (true) {
            i = i2 + 30;
            a2 = this.a.a(C1992DM.a, C6907mLa.a().b("_id", (Collection<?>) a3.subList(i2, Math.min(i, a3.size()))));
            if (i < a3.size() && a2.b()) {
                i2 = i;
            }
        }
        if (a2.b()) {
            return new C5266RKa(a3.size());
        }
        return (C5266RKa) new C5266RKa(i - 30).a(a2.a());
    }
}
