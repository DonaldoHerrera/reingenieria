package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* renamed from: Hwa reason: default package and case insensitive filesystem */
/* compiled from: UserSuggestionItemRenderer */
class C4976Hwa extends C4790Bwa {
    C4976Hwa(N n) {
        super(n);
    }

    private int c() {
        return l.search_suggestion_user;
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(c(), viewGroup, false);
    }

    public void a(int i, View view, C7780ywa ywa) {
        C7366swa swa = (C7366swa) ywa;
        a(i, view, swa, h.ic_search_user);
        a(view.findViewById(i.pro_badge), swa);
    }

    private void a(View view, C7366swa swa) {
        view.setVisibility(swa.i() ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public void a(ImageView imageView, Vca vca, Resources resources) {
        a().a(vca.a(), vca.b(), C3721b.c(resources), imageView, true);
    }
}
