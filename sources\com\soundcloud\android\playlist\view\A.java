package com.soundcloud.android.playlist.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* compiled from: PlaylistDetailToolbarView */
class A extends DefaultSupportFragmentLightCycle<Fragment> {
    private final C4834DJa a;
    private C4928GKa<Menu> b = C4928GKa.a();
    private C4928GKa<C6532gqa> c = C4928GKa.a();
    private ActionBar d;
    private String e;

    A(C4834DJa dJa) {
        this.a = dJa;
    }

    private void b(Fragment fragment) {
        String str = "";
        this.d.b((CharSequence) str);
        fragment.getActivity().setTitle(str);
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        this.a.f((AppCompatActivity) fragment.getActivity());
        this.e = fragment.getString(p.edit_playlist_title);
        this.d = ((AppCompatActivity) fragment.getActivity()).getSupportActionBar();
        b(fragment);
    }

    private void b(C6532gqa gqa, Resources resources) {
        this.d.b((CharSequence) gqa.q() ? this.e : a(gqa.l(), resources));
    }

    public void a(C6532gqa gqa, Resources resources) {
        this.c = C4928GKa.c(gqa);
        a(resources);
    }

    /* access modifiers changed from: 0000 */
    public void a(Menu menu, Resources resources) {
        this.b = C4928GKa.c(menu);
        a(resources);
    }

    private void a(Resources resources) {
        if (this.b.c() && this.c.c() && this.d != null) {
            C6532gqa gqa = (C6532gqa) this.c.b();
            ((Menu) this.b.b()).findItem(i.edit_validate).setVisible(gqa.q());
            b(gqa, resources);
        }
    }

    private String a(C3863rda rda, Resources resources) {
        return C5035Jsa.a(resources, (String) rda.J().d(""), rda.F(), rda.I());
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.d = null;
        this.e = null;
        this.c = C4928GKa.a();
        this.b = C4928GKa.a();
    }
}
