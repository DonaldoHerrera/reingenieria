package com.soundcloud.android.features.discovery;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.soundcloud.android.features.discovery.Q.i;
import com.soundcloud.android.features.discovery.Q.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.utilities.android.e;
import com.soundcloud.android.view.CircularBorderImageView;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: PromotedTrackCardRenderer.kt */
public class O extends C5541_ta<c> {
    /* access modifiers changed from: private */
    public final C6781kVa<c> a;
    /* access modifiers changed from: private */
    public final C6781kVa<c> b;
    /* access modifiers changed from: private */
    public final C6781kVa<c> c;
    private final C6781kVa<c> d;
    private final N e;
    private final Resources f;

    public O(N n, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        this.e = n;
        this.f = resources;
        C6781kVa<c> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C6781kVa<c> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        C6781kVa<c> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.c = s3;
        C6781kVa<c> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.d = s4;
    }

    public APa<c> d() {
        return this.c;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.discovery_promoted_track_card, viewGroup, false);
        C7471uYa.a((Object) inflate, "inflate(R.layout.discove…k_card, viewGroup, false)");
        C7471uYa.a((Object) inflate, "with(LayoutInflater.from…, viewGroup, false)\n    }");
        return inflate;
    }

    public APa<c> c() {
        return this.b;
    }

    public void a(int i, View view, c cVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(cVar, "item");
        View findViewById = view.findViewById(i.title);
        C7471uYa.a((Object) findViewById, "itemView.findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(cVar.f());
        View findViewById2 = view.findViewById(i.creator);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById<TextView>(R.id.creator)");
        ((TextView) findViewById2).setText(cVar.c());
        N n = this.e;
        C3508cda g = cVar.g();
        C4928GKa b2 = C4928GKa.b(cVar.b());
        C7471uYa.a((Object) b2, "fromNullable(artworkUrlTemplate)");
        C3721b b3 = C3721b.b(this.f);
        C7471uYa.a((Object) b3, "ApiImageSize.getFullImageSize(resources)");
        View findViewById3 = view.findViewById(i.image);
        C7471uYa.a((Object) findViewById3, "itemView.findViewById(R.id.image)");
        n.a(g, b2, b3, (ImageView) findViewById3, false);
        a(view, cVar.e().b(), cVar);
        view.setOnClickListener(new L(cVar, this, view));
        ((TextView) view.findViewById(i.creator)).setOnClickListener(new M(cVar, this, view));
        this.d.a(cVar);
    }

    public APa<c> b() {
        return this.a;
    }

    private void a(View view, C3895vda vda, c cVar) {
        String str = "view.promoted_item";
        String str2 = "view.promoted_by_group";
        if (vda != null) {
            View findViewById = view.findViewById(i.promoter_name);
            C7471uYa.a((Object) findViewById, "view.findViewById<TextView>(R.id.promoter_name)");
            ((TextView) findViewById).setText(vda.b());
            N n = this.e;
            C3508cda c2 = vda.c();
            C4928GKa b2 = C4928GKa.b(vda.a());
            C7471uYa.a((Object) b2, "Optional.fromNullable(promoter.avatarUrlTemplate)");
            C3721b c3 = C3721b.c(this.f);
            C7471uYa.a((Object) c3, "ApiImageSize.getListItemImageSize(resources)");
            CircularBorderImageView circularBorderImageView = (CircularBorderImageView) view.findViewById(i.promoter_image);
            C7471uYa.a((Object) circularBorderImageView, "view.promoter_image");
            n.a(c2, b2, c3, (ImageView) circularBorderImageView, true);
            Group group = (Group) view.findViewById(i.promoter_container);
            C7471uYa.a((Object) group, "view.promoter_container");
            e.a(group, new N(this, cVar));
            Group group2 = (Group) view.findViewById(i.promoted_by_group);
            C7471uYa.a((Object) group2, str2);
            group2.setVisibility(0);
            CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.promoted_item);
            C7471uYa.a((Object) customFontTextView, str);
            customFontTextView.setVisibility(8);
            return;
        }
        Group group3 = (Group) view.findViewById(i.promoted_by_group);
        C7471uYa.a((Object) group3, str2);
        group3.setVisibility(8);
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.promoted_item);
        C7471uYa.a((Object) customFontTextView2, str);
        customFontTextView2.setVisibility(0);
    }

    public APa<c> a() {
        return this.d;
    }
}
