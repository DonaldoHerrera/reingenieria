package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* renamed from: HE reason: default package and case insensitive filesystem */
public class C2064HE {
    private final C2102JE a;
    private final String b;
    private Integer c = null;

    @KeepForSdk
    public C2064HE(Context context, C2102JE je, String str) {
        this.a = je;
        this.b = str;
    }

    private final void b() throws C2044GE {
        if (this.a == null) {
            throw new C2044GE("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private final List<a> c() {
        return this.a.a(this.b, "");
    }

    @KeepForSdk
    public void a(List<Map<String, String>> list) throws C2044GE {
        String str;
        b();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Map a2 : list) {
                arrayList.add(C2083IE.a(a2));
            }
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hashSet.add(((C2083IE) obj).a());
            }
            List<a> c2 = c();
            HashSet hashSet2 = new HashSet();
            for (a aVar : c2) {
                hashSet2.add(aVar.b);
            }
            ArrayList arrayList2 = new ArrayList();
            for (a aVar2 : c2) {
                if (!hashSet.contains(aVar2.b)) {
                    arrayList2.add(aVar2);
                }
            }
            a((Collection<a>) arrayList2);
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                C2083IE ie = (C2083IE) obj2;
                if (!hashSet2.contains(ie.a())) {
                    arrayList3.add(ie);
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque(c());
            if (this.c == null) {
                this.c = Integer.valueOf(this.a.a(this.b));
            }
            int intValue = this.c.intValue();
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                C2083IE ie2 = (C2083IE) obj3;
                while (arrayDeque.size() >= intValue) {
                    a(((a) arrayDeque.pollFirst()).b);
                }
                a aVar3 = new a();
                aVar3.a = this.b;
                aVar3.m = ie2.d();
                aVar3.b = ie2.a();
                aVar3.c = ie2.b();
                if (TextUtils.isEmpty(ie2.c())) {
                    str = null;
                } else {
                    str = ie2.c();
                }
                aVar3.d = str;
                aVar3.e = ie2.e();
                aVar3.j = ie2.f();
                this.a.a(aVar3);
                arrayDeque.offer(aVar3);
            }
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @KeepForSdk
    public void a() throws C2044GE {
        b();
        a((Collection<a>) c());
    }

    private final void a(Collection<a> collection) {
        for (a aVar : collection) {
            a(aVar.b);
        }
    }

    private final void a(String str) {
        this.a.clearConditionalUserProperty(str, null, null);
    }
}
