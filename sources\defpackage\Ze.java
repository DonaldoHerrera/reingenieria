package defpackage;

import androidx.work.q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ze reason: default package */
/* compiled from: WorkSpec */
class Ze implements K<List<b>, List<q>> {
    Ze() {
    }

    /* renamed from: a */
    public List<q> apply(List<b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (b a : list) {
            arrayList.add(a.a());
        }
        return arrayList;
    }
}
