package defpackage;

import android.os.ResultReceiver;
import com.soundcloud.android.sync.na;
import java.util.List;

/* renamed from: ZAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncRequestFactory */
public class C5490ZAa {
    private final C7054oVa<C5256RAa> a;
    private final C7054oVa<C5256RAa> b;
    private final C7054oVa<C5256RAa> c;

    public C5490ZAa(C7054oVa<C5256RAa> ova, C7054oVa<C5256RAa> ova2, C7054oVa<C5256RAa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public C5432XAa a(na naVar, List<C3508cda> list, ResultReceiver resultReceiver) {
        C5256RAa a2 = a(naVar);
        a2.a(list);
        return new C5432XAa(a2, naVar, resultReceiver);
    }

    private C5256RAa a(na naVar) {
        int i = C5461YAa.a[naVar.ordinal()];
        if (i == 1) {
            return (C5256RAa) this.a.get();
        }
        if (i == 2) {
            return (C5256RAa) this.c.get();
        }
        if (i == 3) {
            return (C5256RAa) this.b.get();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected syncable : ");
        sb.append(naVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
