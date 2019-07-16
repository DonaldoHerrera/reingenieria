package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ou reason: default package */
public final class Ou {
    /* access modifiers changed from: private */
    public final Fu a;
    private final boolean b;
    private final Su c;
    /* access modifiers changed from: private */
    public final int d;

    private Ou(Su su) {
        this(su, false, Ju.b, BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static Ou a(Fu fu) {
        Pu.a(fu);
        return new Ou(new Ru(fu));
    }

    private Ou(Su su, boolean z, Fu fu, int i) {
        this.c = su;
        this.b = false;
        this.a = fu;
        this.d = BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final List<String> a(CharSequence charSequence) {
        Pu.a(charSequence);
        Iterator a2 = this.c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a2.hasNext()) {
            arrayList.add((String) a2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
