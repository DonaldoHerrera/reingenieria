package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: iD reason: default package and case insensitive filesystem */
/* compiled from: CollectPreconditions */
final class C3044iD {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    @CanIgnoreReturnValue
    static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    static void a(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
