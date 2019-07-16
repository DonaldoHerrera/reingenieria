package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.main.ha;
import com.soundcloud.android.payments.ConversionActivity;
import com.soundcloud.android.payments.ProductChoiceActivity;
import com.soundcloud.android.payments.WebCheckoutActivity;

/* renamed from: Yha reason: default package */
/* compiled from: DestinationIntents.kt */
public final class Yha {
    public static final Yha a = new Yha();

    private Yha() {
    }

    @NXa
    public static final Intent a(Context context, C3920yea yea) {
        C7471uYa.b(context, "context");
        C7471uYa.b(yea, "upsellContext");
        Intent intent = new Intent(context, ConversionActivity.class);
        yea.a(intent);
        return intent;
    }

    @NXa
    public static final Intent b(Context context, C2455aV aVVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(aVVar, "plan");
        Intent putExtra = new Intent(context, ProductChoiceActivity.class).putExtra("product_choice_plan", aVVar);
        C7471uYa.a((Object) putExtra, "Intent(context, ProductC…ivity.DEFAULT_PLAN, plan)");
        return putExtra;
    }

    @NXa
    public static final Intent a(Context context, C2455aV aVVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(aVVar, "plan");
        Intent putExtra = new Intent(context, WebCheckoutActivity.class).putExtra("checkout_plan", aVVar);
        C7471uYa.a((Object) putExtra, "Intent(context, WebCheck…XTRA_CHECKOUT_PLAN, plan)");
        return putExtra;
    }

    @NXa
    public static final Intent b(Context context, Bundle bundle) {
        C7471uYa.b(context, "context");
        C7471uYa.b(bundle, "bundle");
        Intent putExtras = new Intent(context, ProductChoiceActivity.class).putExtras(bundle);
        C7471uYa.a((Object) putExtras, "Intent(context, ProductC…s.java).putExtras(bundle)");
        return putExtras;
    }

    @NXa
    public static final Intent a(Context context, Bundle bundle) {
        C7471uYa.b(context, "context");
        C7471uYa.b(bundle, "bundle");
        Intent putExtras = new Intent(context, WebCheckoutActivity.class).putExtras(bundle);
        C7471uYa.a((Object) putExtras, "Intent(context, WebCheck…s.java).putExtras(bundle)");
        return putExtras;
    }

    @NXa
    public static final Intent a(Context context, C3508cda cda, boolean z, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa, C4928GKa<PromotedSourceInfo> gKa2) {
        C7471uYa.b(context, "context");
        C7471uYa.b(cda, "playlist");
        C7471uYa.b(yca, "screen");
        C7471uYa.b(gKa, "queryInfo");
        C7471uYa.b(gKa2, "promotedInfo");
        Intent j = C4557fja.j(context);
        j.setAction("PLAYLIST_DETAIL");
        ha.a(yca, j);
        C5526_Ha.b(j, "urn", cda);
        String str = "promoted_source_info";
        Intent putExtra = j.putExtra("autoplay", z).putExtra("query_source_info", (Parcelable) gKa.d()).putExtra(str, (Parcelable) gKa2.d());
        C7471uYa.a((Object) putExtra, "createHomeIntent(context…O, promotedInfo.orNull())");
        return putExtra;
    }
}
