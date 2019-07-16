package com.evernote.android.job;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: JobCreatorHolder */
class h {
    private static final Dj a = new Dj("JobCreatorHolder");
    private final List<JobCreator> b = new CopyOnWriteArrayList();

    public void a(JobCreator jobCreator) {
        this.b.add(jobCreator);
    }

    public c a(String str) {
        c cVar = null;
        boolean z = false;
        for (JobCreator a2 : this.b) {
            z = true;
            cVar = a2.a(str);
            if (cVar != null) {
                break;
            }
        }
        if (!z) {
            a.d("no JobCreator added");
        }
        return cVar;
    }

    public boolean a() {
        return this.b.isEmpty();
    }
}
