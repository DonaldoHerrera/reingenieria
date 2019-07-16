package com.soundcloud.android.collection;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import java.util.List;

public class CollectionPreviewView extends FrameLayout {
    private C4928GKa<Drawable> a;
    private LayoutInflater b;
    private ViewGroup c;
    private int d;
    private TextView e;
    private boolean f;

    public CollectionPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.CollectionPreviewView);
        this.f = obtainStyledAttributes.getBoolean(r.CollectionPreviewView_collectionTitleEnabled, true);
        if (this.f) {
            a(context, l.collection_preview);
            this.e = (TextView) findViewById(i.title);
            this.e.setText(obtainStyledAttributes.getString(r.CollectionPreviewView_collectionTitle));
            this.e.setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getDrawable(r.CollectionPreviewView_collectionIcon), null, null, null);
        } else {
            a(context, l.preview_thumbnails);
        }
        setBackgroundColor(getResources().getColor(f.white));
        this.a = C4928GKa.b(obtainStyledAttributes.getDrawable(r.CollectionPreviewView_collectionPreviewOverlay));
        obtainStyledAttributes.recycle();
    }

    private void a(Context context, int i) {
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.b.inflate(i, this);
        this.c = (ViewGroup) findViewById(i.thumbnail_container);
    }

    private void b(N n, List<? extends Vca> list, int i) {
        int i2 = this.d - i;
        for (int i3 = 0; i3 < i2; i3++) {
            a();
            a(n, list, i, i3);
        }
    }

    public void setTitle(String str) {
        if (this.f) {
            this.e.setText(str);
        }
    }

    private boolean b() {
        return this.c.getChildCount() == this.d;
    }

    public void a(N n, List<? extends Vca> list, int i) {
        int max = Math.max(i - list.size(), 0);
        this.d = i;
        this.c.removeAllViews();
        a(max);
        b(n, list, max);
    }

    private void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a();
        }
    }

    private void a(N n, List<? extends Vca> list, int i, int i2) {
        View childAt = this.c.getChildAt(i + i2);
        Vca vca = (Vca) list.get(i2);
        n.c(vca.a(), vca.b(), C3721b.c(this.c.getResources()), (ImageView) childAt.findViewById(i.preview_artwork));
        if (this.a.c()) {
            ImageView imageView = (ImageView) childAt.findViewById(i.artwork_overlay);
            imageView.setImageDrawable((Drawable) this.a.b());
            imageView.setVisibility(0);
        }
    }

    public CollectionPreviewView(Context context, Drawable drawable) {
        super(context);
        this.a = C4928GKa.b(drawable);
        a(context, l.collection_preview);
    }

    private void a() {
        this.b.inflate(l.collections_preview_item_icon_sm, this.c);
        if (b()) {
            ViewGroup viewGroup = this.c;
            viewGroup.getChildAt(viewGroup.getChildCount() - 1).setBackgroundResource(h.bg_collection_empty_slot_end);
        }
    }
}
