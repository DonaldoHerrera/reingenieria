package defpackage;

import android.text.TextUtils;
import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.events.C.a.C0091a;
import com.soundcloud.android.foundation.events.C.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: sCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncer */
public class C7309sCa<ApiModel> implements Callable<Boolean> {
    private final C6556hCa a;
    private final C6352eCa b;
    private final C7516vCa c;
    private final C7378tCa d;
    private final _S<ApiModel, ApiModel> e;
    private final C6776kQa<Iterable<ApiModel>> f;
    private final C5327TLa g;

    public C7309sCa(C6556hCa hca, C6352eCa eca, C7516vCa vca, C7378tCa tca, _S<ApiModel, ApiModel> _s, C6776kQa<Iterable<ApiModel>> kqa, C5327TLa tLa) {
        this.a = hca;
        this.b = eca;
        this.c = vca;
        this.d = tca;
        this.e = _s;
        this.f = kqa;
        this.g = tLa;
    }

    public Boolean a(List<C3508cda> list) throws Exception {
        NavigableSet call = this.b.call();
        TreeSet treeSet = new TreeSet(C6760kCa.a);
        treeSet.addAll(this.a.call());
        String str = "PostsSyncer";
        b a2 = SDb.a(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Syncing Posts : Local Count = ");
        sb.append(treeSet.size());
        sb.append(" , Remote Count = ");
        sb.append(call.size());
        a2.a(sb.toString(), new Object[0]);
        Set a3 = a((Set<C6760kCa>) call, (Set<C6760kCa>) treeSet);
        Set a4 = a((Set<C6760kCa>) treeSet, (Set<C6760kCa>) call);
        a(a3, list);
        a(a4, list);
        if (!a3.isEmpty() || !a4.isEmpty()) {
            String str2 = ",";
            if (!a4.isEmpty()) {
                SDb.a(str).a("Removing items %s", TextUtils.join(str2, a4));
                this.d.a(a4);
            }
            if (!a3.isEmpty()) {
                SDb.a(str).a("Adding items %s", TextUtils.join(str2, a3));
                a(a3);
                this.c.a(a3);
            }
            a(a3, true);
            a(a4, false);
            return Boolean.valueOf(true);
        }
        SDb.a(str).a("Returning with no change", new Object[0]);
        return Boolean.valueOf(false);
    }

    public Boolean call() throws Exception {
        return a(Collections.emptyList());
    }

    private void a(Set<C6760kCa> set, List<C3508cda> list) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (list.contains(((C6760kCa) it.next()).c())) {
                it.remove();
            }
        }
    }

    private void a(Set<C6760kCa> set, boolean z) {
        HashMap hashMap = new HashMap(set.size());
        HashSet hashSet = new HashSet(set.size());
        for (C6760kCa kca : set) {
            if (kca.a()) {
                C3508cda c2 = kca.c();
                hashMap.put(c2, z ? new C0091a(c2, null) : new b(c2, null));
            } else {
                hashSet.add(kca.c());
            }
        }
        if (!hashMap.isEmpty()) {
            this.g.c(C3876taa.s, new C(hashMap));
        }
        if (!hashSet.isEmpty()) {
            this.g.c(C3876taa.o, z ? C3490aba.a((Set<C3508cda>) hashSet) : C3490aba.b((Set<C3508cda>) hashSet));
        }
    }

    private void a(Set<C6760kCa> set) throws Exception {
        ArrayList arrayList = new ArrayList(set.size());
        for (C6760kCa c2 : set) {
            arrayList.add(c2.c());
        }
        this.f.accept(((_S) this.e.a(arrayList)).call());
    }

    private Set<C6760kCa> a(Set<C6760kCa> set, Set<C6760kCa> set2) {
        TreeSet treeSet = new TreeSet(C6760kCa.a);
        treeSet.addAll(set);
        treeSet.removeAll(set2);
        return treeSet;
    }
}
