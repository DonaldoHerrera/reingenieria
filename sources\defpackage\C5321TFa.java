package defpackage;

import android.view.View;

/* renamed from: TFa reason: default package and case insensitive filesystem */
/* compiled from: UserMenuRendererFactory */
class C5321TFa {
    private final C7054oVa<a> a;

    C5321TFa(C7054oVa<a> ova) {
        a((T) ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public C5291SFa a(a aVar, View view) {
        a((T) aVar, 1);
        a aVar2 = aVar;
        a((T) view, 2);
        View view2 = view;
        Object obj = this.a.get();
        a((T) obj, 3);
        return new C5291SFa(aVar2, view2, (a) obj);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
