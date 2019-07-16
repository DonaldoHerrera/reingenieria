package com.soundcloud.android.offline;

import com.evernote.android.job.s.d;

/* compiled from: DownloadConnectionHelper.kt */
public class Lb {
    private final C6834lGa a;
    private final C4088fe b;

    public Lb(C6834lGa lga, C4088fe feVar) {
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(feVar, "offlineSettings");
        this.a = lga;
        this.b = feVar;
    }

    public d a() {
        if (this.b.l()) {
            return d.UNMETERED;
        }
        return d.CONNECTED;
    }

    public boolean b() {
        if (this.b.l()) {
            return this.a.a();
        }
        return this.a.d();
    }

    public boolean c() {
        return !this.a.d();
    }
}
