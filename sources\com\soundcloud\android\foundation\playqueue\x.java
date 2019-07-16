package com.soundcloud.android.foundation.playqueue;

/* compiled from: CurrentPlayQueueItemEvent.kt */
public final class x extends k {
    private final q e;
    private final C3508cda f;
    private final int g;

    public x(q qVar, C3508cda cda, int i) {
        C7471uYa.b(qVar, "currentPlayQueueItem");
        C7471uYa.b(cda, "collectionUrn");
        super(qVar, cda, i, null);
        this.e = qVar;
        this.f = cda;
        this.g = i;
    }

    public C3508cda a() {
        return this.f;
    }

    public q b() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (C7471uYa.a((Object) b(), (Object) xVar.b()) && C7471uYa.a((Object) a(), (Object) xVar.a())) {
                    if (c() == xVar.c()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        q b = b();
        int i = 0;
        int hashCode = (b != null ? b.hashCode() : 0) * 31;
        C3508cda a = a();
        if (a != null) {
            i = a.hashCode();
        }
        return ((hashCode + i) * 31) + c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PositionChangedEvent(currentPlayQueueItem=");
        sb.append(b());
        sb.append(", collectionUrn=");
        sb.append(a());
        sb.append(", position=");
        sb.append(c());
        sb.append(")");
        return sb.toString();
    }
}
