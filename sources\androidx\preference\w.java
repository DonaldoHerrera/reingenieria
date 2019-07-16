package androidx.preference;

import androidx.preference.z.d;
import androidx.recyclerview.widget.C0425t.a;
import java.util.List;

/* compiled from: PreferenceGroupAdapter */
class w extends a {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ d c;
    final /* synthetic */ x d;

    w(x xVar, List list, List list2, d dVar) {
        this.d = xVar;
        this.a = list;
        this.b = list2;
        this.c = dVar;
    }

    public int a() {
        return this.b.size();
    }

    public int b() {
        return this.a.size();
    }

    public boolean a(int i, int i2) {
        return this.c.a((Preference) this.a.get(i), (Preference) this.b.get(i2));
    }

    public boolean b(int i, int i2) {
        return this.c.b((Preference) this.a.get(i), (Preference) this.b.get(i2));
    }
}
