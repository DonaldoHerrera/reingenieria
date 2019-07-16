package defpackage;

import com.evernote.android.job.JobCreator;
import com.evernote.android.job.c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: UR reason: default package and case insensitive filesystem */
/* compiled from: JobsRepository.kt */
public class C2324UR implements JobCreator {
    private final Map<String, C2286SR> a;
    private final C2305TR b;

    public C2324UR(C2305TR tr) {
        C7471uYa.b(tr, "jobsHolder");
        this.b = tr;
        Set<C2286SR> keySet = this.b.a().keySet();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) keySet, 10));
        for (C2286SR sr : keySet) {
            arrayList.add(NVa.a(sr.name(), sr));
        }
        this.a = LWa.a((Iterable) arrayList);
    }

    public c a(String str) {
        C7471uYa.b(str, "tag");
        C2286SR sr = (C2286SR) this.a.get(str);
        if (sr == null) {
            return null;
        }
        C2472bS bSVar = (C2472bS) this.b.a().get(sr);
        if (bSVar != null) {
            return bSVar.a();
        }
        return null;
    }
}
