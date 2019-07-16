package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InvalidationLiveDataContainer */
class f {
    final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final t b;

    f(t tVar) {
        this.b = tVar;
    }
}
