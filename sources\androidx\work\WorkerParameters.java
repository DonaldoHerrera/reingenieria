package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    private UUID a;
    private e b;
    private Set<String> c;
    private a d;
    private int e;
    private Executor f;
    private C1811wf g;
    private v h;

    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i, Executor executor, C1811wf wfVar, v vVar) {
        this.a = uuid;
        this.b = eVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.f = executor;
        this.g = wfVar;
        this.h = vVar;
    }

    public Executor a() {
        return this.f;
    }

    public UUID b() {
        return this.a;
    }

    public e c() {
        return this.b;
    }

    public Set<String> d() {
        return this.c;
    }

    public C1811wf e() {
        return this.g;
    }

    public v f() {
        return this.h;
    }
}
