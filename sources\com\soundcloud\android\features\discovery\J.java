package com.soundcloud.android.features.discovery;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.soundcloud.android.features.discovery.Q.i;
import com.soundcloud.android.features.discovery.Q.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MultipleContentSelectionCardRenderer.kt */
public class J extends C5541_ta<b> {
    private final Map<C3508cda, Parcelable> a = new LinkedHashMap();
    private final C6781kVa<C3445NY> b;
    private final a c;

    public J(a aVar) {
        C7471uYa.b(aVar, "selectionItemAdapterFactory");
        this.c = aVar;
        C6781kVa<C3445NY> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.b = s;
    }

    private void c(View view, b bVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.selection_title);
        C7471uYa.a((Object) customFontTextView, "view.selection_title");
        a((TextView) customFontTextView, bVar.e());
    }

    public APa<C3445NY> b() {
        return a();
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.discovery_multiple_content_selection_card, viewGroup, false);
        C7471uYa.a((Object) inflate, "view");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i.selection_playlists_carousel);
        C7471uYa.a((Object) recyclerView, "view.selection_playlists_carousel");
        a(inflate, recyclerView);
        return inflate;
    }

    public C6781kVa<C3445NY> a() {
        return this.b;
    }

    private void a(View view, RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C3421FY a2 = this.c.a(a());
        recyclerView.setHasFixedSize(true);
        recyclerView.a((m) new I(this, a2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(a2);
        view.setTag(a2);
    }

    private void b(View view, b bVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.selection_description);
        C7471uYa.a((Object) customFontTextView, "view.selection_description");
        a((TextView) customFontTextView, bVar.b());
    }

    /* access modifiers changed from: private */
    public void b(C3421FY fy, RecyclerView recyclerView) {
        C3508cda j = fy.j();
        if (j != null) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                Parcelable y = layoutManager.y();
                if (y != null) {
                    Map<C3508cda, Parcelable> map = this.a;
                    C7471uYa.a((Object) y, "state");
                    Parcelable parcelable = (Parcelable) map.put(j, y);
                }
            }
        }
    }

    public void a(int i, View view, b bVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(bVar, "item");
        c(view, bVar);
        b(view, bVar);
        a(view, bVar);
    }

    private void a(TextView textView, String str) {
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
            return;
        }
        textView.setVisibility(8);
    }

    private void a(View view, b bVar) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i.selection_playlists_carousel);
        Object tag = view.getTag();
        if (!(tag instanceof C3421FY)) {
            tag = null;
        }
        C3421FY fy = (C3421FY) tag;
        if (fy != null) {
            fy.a(bVar);
            C7471uYa.a((Object) recyclerView, "recyclerView");
            a(fy, recyclerView);
        }
    }

    private void a(C3421FY fy, RecyclerView recyclerView) {
        C3508cda j = fy.j();
        if (j == null || !this.a.containsKey(j)) {
            recyclerView.i(0);
            return;
        }
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.a((Parcelable) this.a.get(j));
        }
    }
}
