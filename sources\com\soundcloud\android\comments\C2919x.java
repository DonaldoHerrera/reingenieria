package com.soundcloud.android.comments;

import com.soundcloud.android.comments.Oa.a;
import com.soundcloud.android.comments.Oa.b;

/* renamed from: com.soundcloud.android.comments.x reason: case insensitive filesystem */
/* compiled from: TrackCommentRepository.kt */
public final class C2919x {
    private final a a;
    private final b b;

    public C2919x() {
        this(null, null, 3, null);
    }

    public C2919x(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public static /* synthetic */ C2919x a(C2919x xVar, a aVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = xVar.a;
        }
        if ((i & 2) != 0) {
            bVar = xVar.b;
        }
        return xVar.a(aVar, bVar);
    }

    public final a a() {
        return this.a;
    }

    public final C2919x a(a aVar, b bVar) {
        return new C2919x(aVar, bVar);
    }

    public final b b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2919x) {
                C2919x xVar = (C2919x) obj;
                if (C7471uYa.a((Object) this.a, (Object) xVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b bVar = this.b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentUpdates(addCommentUpdate=");
        sb.append(this.a);
        sb.append(", deleteCommentUpdate=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2919x(a aVar, b bVar, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            bVar = null;
        }
        this(aVar, bVar);
    }
}
