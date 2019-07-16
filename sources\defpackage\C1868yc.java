package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: yc reason: default package and case insensitive filesystem */
/* compiled from: ViewGroup.kt */
public final class C1868yc implements Iwb<View> {
    final /* synthetic */ ViewGroup a;

    C1868yc(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public Iterator<View> iterator() {
        return Ac.b(this.a);
    }
}
