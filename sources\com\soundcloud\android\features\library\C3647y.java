package com.soundcloud.android.features.library;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.collection.B;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.features.library.y reason: case insensitive filesystem */
/* compiled from: LibraryOnboardingRenderer.kt */
public final class C3647y extends C5541_ta<B> {
    private final C2332VH<RVa> a;

    public C3647y() {
        C2332VH<RVa> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Unit>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.library_card_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…card_item, parent, false)");
        return inflate;
    }

    public final C2332VH<RVa> a() {
        return this.a;
    }

    public void a(int i, View view, B b) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(b, "item");
        if (view instanceof LibraryCardItem) {
            LibraryCardItem libraryCardItem = (LibraryCardItem) view;
            libraryCardItem.setDescription(p.collections_onboarding_description);
            libraryCardItem.setEnabled(false);
            libraryCardItem.getCloseButton().setOnClickListener(new C3646x(this));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
