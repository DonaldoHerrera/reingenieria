package defpackage;

import android.util.Log;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.c;
import com.evernote.android.job.l;
import com.evernote.android.job.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: XR reason: default package and case insensitive filesystem */
/* compiled from: PeriodicJobsRepository.kt */
public final class C2378XR implements JobCreator {
    private final Map<String, C2342VR> a;
    private final C2360WR b;
    private final String c;

    public C2378XR(C2360WR wr, String str) {
        C7471uYa.b(wr, "periodicJobsHolder");
        C7471uYa.b(str, "immediateSuffix");
        this.b = wr;
        this.c = str;
        Set<C2342VR> keySet = this.b.a().keySet();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) keySet, 10));
        for (C2342VR vr : keySet) {
            arrayList.add(NVa.a(vr.name(), vr));
        }
        this.a = LWa.a((Iterable) arrayList);
        Map<String, C2342VR> map = this.a;
        boolean z = true;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Cxb.a((String) ((Entry) it.next()).getKey(), this.c, false, 2, null)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Job tag cannot end with ");
            sb.append(this.c);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public c a(String str) {
        C7471uYa.b(str, "tag");
        C2342VR vr = (C2342VR) this.a.get(Hxb.b(str, this.c));
        if (vr == null) {
            return null;
        }
        C2472bS bSVar = (C2472bS) this.b.a().get(vr);
        if (bSVar != null) {
            return bSVar.a();
        }
        return null;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        l g = l.g();
        C7471uYa.a((Object) g, "JobManager.instance()");
        Set<s> a2 = g.a();
        C7471uYa.a((Object) a2, "JobManager.instance().allJobRequests");
        Map a3 = this.b.a();
        ArrayList<s> arrayList = new ArrayList<>(a3.size());
        for (Entry value : a3.entrySet()) {
            arrayList.add(C2415ZR.a(((C2472bS) value.getValue()).a(), null, 1, null).a());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            str = "requested";
            str2 = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            s sVar = (s) next;
            boolean z2 = false;
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator it2 = a2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    s sVar2 = (s) it2.next();
                    C7471uYa.a((Object) sVar2, str2);
                    String p = sVar2.p();
                    C7471uYa.a((Object) sVar, str);
                    if (!C7471uYa.a((Object) p, (Object) sVar.p()) || a(sVar2, sVar)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        ArrayList<s> arrayList3 = new ArrayList<>();
        for (Object next2 : arrayList) {
            s sVar3 = (s) next2;
            ArrayList arrayList4 = new ArrayList(C6986nWa.a((Iterable) a2, 10));
            for (s sVar4 : a2) {
                C7471uYa.a((Object) sVar4, str2);
                arrayList4.add(sVar4.p());
            }
            C7471uYa.a((Object) sVar3, str);
            if (!arrayList4.contains(sVar3.p())) {
                arrayList3.add(next2);
            }
        }
        ArrayList<s> arrayList5 = new ArrayList<>();
        for (Object next3 : a2) {
            s sVar5 = (s) next3;
            ArrayList arrayList6 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
            for (s sVar6 : arrayList) {
                C7471uYa.a((Object) sVar6, str2);
                arrayList6.add(sVar6.p());
            }
            C7471uYa.a((Object) sVar5, "scheduled");
            if (!arrayList6.contains(sVar5.p())) {
                arrayList5.add(next3);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            str3 = "SyncJob";
            if (!it3.hasNext()) {
                break;
            }
            s sVar7 = (s) it3.next();
            StringBuilder sb = new StringBuilder();
            sb.append("Rescheduling Job: ");
            C7471uYa.a((Object) sVar7, str2);
            sb.append(sVar7.p());
            sb.append(" because of changes in the Job setup");
            Log.d(str3, sb.toString());
            l.g().a(sVar7.p());
            sVar7.F();
        }
        for (s sVar8 : arrayList3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scheduling Job: ");
            C7471uYa.a((Object) sVar8, str2);
            sb2.append(sVar8.p());
            Log.d(str3, sb2.toString());
            sVar8.F();
        }
        for (s sVar9 : arrayList5) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Removing scheduled Job: ");
            C7471uYa.a((Object) sVar9, str2);
            sb3.append(sVar9.p());
            Log.d(str3, sb3.toString());
            l.g().a(sVar9.p());
        }
    }

    private final boolean a(s sVar, s sVar2) {
        return C7471uYa.a((Object) sVar.p(), (Object) sVar2.p()) && sVar.i() == sVar2.i() && sVar.h() == sVar2.h() && sVar.u() == sVar2.u() && sVar.A() == sVar2.A() && sVar.B() == sVar2.B() && sVar.C() == sVar2.C() && sVar.D() == sVar2.D();
    }
}
