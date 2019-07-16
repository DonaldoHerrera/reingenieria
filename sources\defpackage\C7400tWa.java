package defpackage;

import java.util.List;

/* renamed from: tWa reason: default package and case insensitive filesystem */
/* compiled from: ReversedViews.kt */
class C7400tWa extends C7331sWa {
    /* access modifiers changed from: private */
    public static final int c(List<?> list, int i) {
        int a = C6918mWa.a(list);
        if (i >= 0 && a >= i) {
            return C6918mWa.a(list) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C6785kZa(0, C6918mWa.a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static final int d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C6785kZa(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static <T> List<T> d(List<T> list) {
        C7471uYa.b(list, "$this$asReversed");
        return new NWa(list);
    }
}
