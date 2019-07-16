package defpackage;

import android.app.Activity;
import com.soundcloud.android.playback.C4425ta;
import java.util.List;

/* renamed from: xja reason: default package and case insensitive filesystem */
/* compiled from: Navigator.kt */
public final class C4709xja {
    private final C5052KJa a;
    private final C4425ta b;

    public C4709xja(C5052KJa kJa, C4425ta taVar) {
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(taVar, "expandPlayerCommand");
        this.a = kJa;
        this.b = taVar;
    }

    public final C4700wja a(Activity activity, List<? extends C4613mja> list) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(list, "resultHandlers");
        return new C4700wja(activity, list, this.a, this.b);
    }
}
