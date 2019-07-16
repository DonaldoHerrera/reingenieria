package defpackage;

import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* renamed from: xK reason: default package and case insensitive filesystem */
/* compiled from: AlphaDialogHelper.kt */
public final class C3353xK implements C7733yKa<C3070jK> {
    /* renamed from: a */
    public void accept(C3070jK jKVar) {
        C7471uYa.b(jKVar, "activityAndBitmap");
        View inflate = LayoutInflater.from(jKVar.a()).inflate(l.dialog_image, null);
        C7471uYa.a((Object) inflate, "view");
        ((ImageView) inflate.findViewById(i.image)).setImageBitmap(jKVar.b());
        ((CustomFontTextView) inflate.findViewById(i.text)).setText(p.alpha_reminder_message);
        a aVar = new a(jKVar.a());
        aVar.c(p.alpha_reminder_title);
        aVar.b(inflate);
        aVar.c(p.alpha_reminder_action, (OnClickListener) new C3333wK(jKVar));
        aVar.c();
    }
}
