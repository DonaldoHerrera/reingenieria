package com.soundcloud.android.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MonitoredActivity */
abstract class q extends Activity {
    private final ArrayList<b> a = new ArrayList<>();

    /* compiled from: MonitoredActivity */
    public static class a implements b {
        public void a(q qVar) {
        }

        public void b(q qVar) {
        }

        public void c(q qVar) {
        }

        public void d(q qVar) {
        }
    }

    /* compiled from: MonitoredActivity */
    public interface b {
        void a(q qVar);

        void b(q qVar);

        void c(q qVar);

        void d(q qVar);
    }

    q() {
    }

    public void a(b bVar) {
        if (!this.a.contains(bVar)) {
            this.a.add(bVar);
        }
    }

    public void b(b bVar) {
        this.a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(this);
        }
    }
}
