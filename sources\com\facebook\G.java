package com.facebook;

import android.util.Pair;
import com.facebook.GraphRequest.b;
import com.facebook.K.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: GraphRequest */
class G implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ K b;

    G(ArrayList arrayList, K k) {
        this.a = arrayList;
        this.b = k;
    }

    public void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((b) pair.first).a((L) pair.second);
        }
        for (a a2 : this.b.j()) {
            a2.a(this.b);
        }
    }
}
