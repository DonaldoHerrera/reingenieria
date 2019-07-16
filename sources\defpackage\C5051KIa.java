package defpackage;

import android.view.View;
import com.google.common.base.Predicate;

/* renamed from: KIa reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C5051KIa implements Predicate {
    public static final /* synthetic */ C5051KIa a = new C5051KIa();

    private /* synthetic */ C5051KIa() {
    }

    public final boolean apply(Object obj) {
        return "foreground".equals(((View) obj).getTag());
    }
}
