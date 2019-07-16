package defpackage;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: mta reason: default package and case insensitive filesystem */
/* compiled from: PolicyStorage */
public class C6946mta {
    private static final C6975nLa a = ((C6975nLa) C6975nLa.a(e.c).a(e.e, (Object) Integer.valueOf(0)));
    private final C5500ZKa b;
    private final C4898FLa c;
    private final int d;

    public C6946mta(C5500ZKa zKa) {
        this(zKa, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    /* access modifiers changed from: private */
    public Set<C3508cda> b(C5631bLa bla) {
        HashSet hashSet = new HashSet();
        Iterator it = bla.iterator();
        while (it.hasNext()) {
            hashSet.add(C3508cda.d(((C5326TKa) it.next()).d("_id")));
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    public Map<C3508cda, Boolean> c(List<C5631bLa> list) {
        HashMap hashMap = new HashMap();
        for (C5631bLa it : list) {
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                C5326TKa tKa = (C5326TKa) it2.next();
                hashMap.put(C3508cda.d(tKa.d("_id")), Boolean.valueOf(tKa.a("sound_policies_blocked")));
            }
        }
        return hashMap;
    }

    private C6975nLa d() {
        String str = "sound_policies_blocked";
        return (C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundView.name()).a("_id", str).d("_type", (Object) Integer.valueOf(0))).d(str, (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: 0000 */
    public IPa<Map<C3508cda, Boolean>> a(List<C3508cda> list) {
        ArrayList arrayList = new ArrayList((list.size() / this.d) + 1);
        for (List b2 : C2063HD.a(list, this.d)) {
            arrayList.add(this.c.a(b(b2)));
        }
        return APa.b((Iterable<? extends EPa<? extends T>>) arrayList).r().e(new C5511Zsa(this));
    }

    C6946mta(C5500ZKa zKa, int i) {
        this.b = zKa;
        this.c = new C4898FLa(zKa);
        this.d = i;
    }

    private C6975nLa b(List<C3508cda> list) {
        String str = "_id";
        return (C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundView.name()).a(str, "sound_policies_blocked").b(str, (Collection<?>) C5526_Ha.a(list))).d("_type", (Object) Integer.valueOf(0));
    }

    /* access modifiers changed from: 0000 */
    public IPa<Set<C3508cda>> a() {
        return this.c.a(d()).h(new C5453Xsa(this)).g();
    }

    /* access modifiers changed from: 0000 */
    public APa<List<C3508cda>> c() {
        return this.c.a(a).h(C5482Ysa.a);
    }

    /* access modifiers changed from: 0000 */
    public List<C3508cda> b() {
        return this.b.a(a).b(new C1564oT());
    }
}
