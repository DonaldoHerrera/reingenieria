package defpackage;

import com.soundcloud.android.foundation.events.C3704f;
import com.soundcloud.android.foundation.events.C3704f.b;
import com.soundcloud.android.foundation.events.C3704f.c;
import com.soundcloud.android.foundation.events.C3704f.d;
import com.soundcloud.android.foundation.events.C3708j;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.foundation.events.v;

/* renamed from: bua reason: default package and case insensitive filesystem */
/* compiled from: PresentationExtensions.kt */
public final class C5672bua {
    public static final Mca a(C3855qda qda, C3710l lVar, PromotedSourceInfo promotedSourceInfo) {
        C7471uYa.b(qda, "$this$toShareOptions");
        C7471uYa.b(lVar, "contextMetadata");
        Mca mca = new Mca(qda.s(), qda.m(), qda.A(), lVar, promotedSourceInfo, b(qda), null, 64, null);
        return mca;
    }

    public static final C3708j b(C3855qda qda) {
        C7471uYa.b(qda, "$this$toEntityMetadata");
        return new C3708j(qda.d(), qda.e(), qda.B(), qda.a());
    }

    public static /* synthetic */ C3710l a(C3855qda qda, String str, v vVar, p pVar, C3508cda cda, int i, Object obj) {
        if ((i & 2) != 0) {
            vVar = null;
        }
        if ((i & 4) != 0) {
            pVar = null;
        }
        if ((i & 8) != 0) {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
        }
        return a(qda, str, vVar, pVar, cda);
    }

    public static final C3710l a(C3855qda qda, String str, v vVar, p pVar, C3508cda cda) {
        String str2 = str;
        v vVar2 = vVar;
        p pVar2 = pVar;
        C3508cda cda2 = cda;
        C7471uYa.b(qda, "$this$toEventContextMetadata");
        C7471uYa.b(str, "pageName");
        C7471uYa.b(cda, "pageUrn");
        C3710l lVar = new C3710l(null, str2, vVar2, false, cda2, pVar2, a(qda), null, null, null, null, null, null, null, 16265, null);
        return lVar;
    }

    public static final C3704f a(C3855qda qda) {
        C7471uYa.b(qda, "$this$toAttributingActivity");
        if (qda.n()) {
            return new c(qda.v());
        }
        if (qda.x() != null) {
            return new d(qda.y());
        }
        return new b(qda.e());
    }
}
