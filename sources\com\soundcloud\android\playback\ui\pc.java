package com.soundcloud.android.playback.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackPageRecycler */
class pc {
    private final List<a> a = new ArrayList(6);
    private final Deque<View> b = new LinkedList();

    /* compiled from: TrackPageRecycler */
    private static class a {
        public final C3508cda a;
        public final View b;

        private a(C3508cda cda, View view) {
            this.a = cda;
            this.b = view;
        }
    }

    pc() {
    }

    private boolean c(C3508cda cda) {
        return e(cda) != null;
    }

    private View d(C3508cda cda) {
        if (!this.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.a.equals(cda)) {
                    it.remove();
                    return aVar.b;
                }
            }
        }
        return null;
    }

    private View e(C3508cda cda) {
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.equals(cda)) {
                return aVar.b;
            }
        }
        return null;
    }

    public boolean a(View view, C3508cda cda) {
        return view == e(cda);
    }

    /* access modifiers changed from: 0000 */
    public View b(C3508cda cda) {
        return d(cda);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C3508cda cda) {
        return c(cda);
    }

    /* access modifiers changed from: 0000 */
    public View a(C7054oVa<View> ova) {
        if (!this.b.isEmpty()) {
            return (View) this.b.pop();
        }
        if (this.a.isEmpty()) {
            return (View) ova.get();
        }
        return ((a) this.a.remove(0)).b;
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda, View view) {
        this.a.add(new a(cda, view));
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        this.b.push(view);
    }
}
