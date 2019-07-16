package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.playqueue.D.a;
import java.util.Iterator;

/* compiled from: ShuffledPlayQueue */
class C implements Iterator<T> {
    private int a = -1;
    final /* synthetic */ a b;

    C(a aVar) {
        this.b = aVar;
    }

    public boolean hasNext() {
        int i = this.a + 1;
        this.a = i;
        return i < this.b.size();
    }

    public T next() {
        if (this.a < this.b.size()) {
            return this.b.get(this.a);
        }
        return null;
    }

    public void remove() {
        if (this.a < this.b.size()) {
            this.b.remove(this.a);
        }
    }
}
