package com.soundcloud.android.comments;

import com.soundcloud.android.comments.C2921y.a;

/* compiled from: CommentsPresenter.kt */
public final class eb {
    private final a a;
    private final int b;

    public eb(a aVar, int i) {
        C7471uYa.b(aVar, "comment");
        this.a = aVar;
        this.b = i;
    }

    public final a a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eb) {
                eb ebVar = (eb) obj;
                if (C7471uYa.a((Object) this.a, (Object) ebVar.a)) {
                    if (this.b == ebVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectedCommentParams(comment=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
