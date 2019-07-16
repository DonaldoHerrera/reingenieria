package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo */
public final class q {
    private UUID a;
    private a b;
    private e c;
    private Set<String> d;
    private int e;

    /* compiled from: WorkInfo */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public q(UUID uuid, a aVar, e eVar, List<String> list, int i) {
        this.a = uuid;
        this.b = aVar;
        this.c = eVar;
        this.d = new HashSet(list);
        this.e = i;
    }

    public a a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.e == qVar.e && this.a.equals(qVar.a) && this.b == qVar.b && this.c.equals(qVar.c)) {
            return this.d.equals(qVar.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WorkInfo{mId='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.b);
        sb.append(", mOutputData=");
        sb.append(this.c);
        sb.append(", mTags=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
