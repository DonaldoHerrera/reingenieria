package com.evernote.android.job;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: JobStorage */
class t extends Thread {
    final /* synthetic */ u a;

    t(u uVar, String str) {
        this.a = uVar;
        super(str);
    }

    public void run() {
        HashSet hashSet;
        int i;
        synchronized (this.a.e) {
            hashSet = new HashSet(this.a.e);
        }
        Iterator it = hashSet.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            try {
                int parseInt = Integer.parseInt((String) it.next());
                if (this.a.a((s) null, parseInt)) {
                    it.remove();
                    u.a.c("Deleted job %d which failed to delete earlier", Integer.valueOf(parseInt));
                } else {
                    u.a.b("Couldn't delete job %d which failed to delete earlier", Integer.valueOf(parseInt));
                }
            } catch (NumberFormatException unused) {
                it.remove();
            }
        }
        synchronized (this.a.e) {
            this.a.e.clear();
            if (hashSet.size() > 50) {
                Iterator it2 = hashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = (String) it2.next();
                    int i2 = i + 1;
                    if (i > 50) {
                        break;
                    }
                    this.a.e.add(str);
                    i = i2;
                }
            } else {
                this.a.e.addAll(hashSet);
            }
        }
    }
}
