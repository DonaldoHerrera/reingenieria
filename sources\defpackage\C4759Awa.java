package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: Awa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionItemRenderer.kt */
final class C4759Awa implements OnClickListener {
    final /* synthetic */ C4790Bwa a;
    final /* synthetic */ C7366swa b;
    final /* synthetic */ int c;

    C4759Awa(C4790Bwa bwa, C7366swa swa, int i) {
        this.a = bwa;
        this.b = swa;
        this.c = i;
    }

    public final void onClick(View view) {
        this.a.a.a(new C7849zwa(this.b, this.c));
    }
}
