package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.concurrent.Callable;

/* renamed from: nxa reason: default package and case insensitive filesystem */
/* compiled from: SharingStickerUriProvider.kt */
final class C7023nxa<V> implements Callable<T> {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    C7023nxa(Activity activity, String str, String str2) {
        this.a = activity;
        this.b = str;
        this.c = str2;
    }

    public final Bitmap call() {
        View inflate = this.a.getLayoutInflater().inflate(l.social_sharing_sticker_view, null, false);
        CustomFontTextView customFontTextView = (CustomFontTextView) inflate.findViewById(i.shareStickerTitle);
        C7471uYa.a((Object) customFontTextView, "shareStickerTitle");
        customFontTextView.setText(this.b);
        CustomFontTextView customFontTextView2 = (CustomFontTextView) inflate.findViewById(i.shareStickerSubtitle);
        C7471uYa.a((Object) customFontTextView2, "shareStickerSubtitle");
        customFontTextView2.setText(this.c);
        inflate.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
