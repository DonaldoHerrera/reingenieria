package defpackage;

import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.events.C.a;
import java.util.Collection;
import java.util.Set;

/* renamed from: uaa reason: default package and case insensitive filesystem */
/* compiled from: EventsExtensions.kt */
public final class C3884uaa {
    public static final boolean a(C c) {
        C7471uYa.b(c, "$this$containsTrackChange");
        Set<C3508cda> keySet = c.a().keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        for (C3508cda x : keySet) {
            if (x.x()) {
                return true;
            }
        }
        return false;
    }

    public static final a a(C c, C3508cda cda) {
        C7471uYa.b(c, "$this$repostStatusForUrn");
        C7471uYa.b(cda, "urn");
        return (a) c.a().get(cda);
    }
}
