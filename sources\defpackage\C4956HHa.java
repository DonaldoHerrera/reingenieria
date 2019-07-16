package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

/* renamed from: HHa reason: default package and case insensitive filesystem */
/* compiled from: LightCycleLogger.kt */
public final class C4956HHa implements SupportFragmentLightCycle<Fragment> {
    final /* synthetic */ String a;

    C4956HHa(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public void onAttach(Fragment fragment, Activity activity) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onAttach Fragment = [");
        sb.append(fragment);
        sb.append("], activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public boolean onOptionsItemSelected(Fragment fragment, MenuItem menuItem) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(menuItem, "menuItem");
        return false;
    }

    /* renamed from: b */
    public void onCreate(Fragment fragment, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onCreate  [");
        sb.append(fragment);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: c */
    public void onSaveInstanceState(Fragment fragment, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onSaveInstanceState Fragment = [");
        sb.append(fragment);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: d */
    public void onPause(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onPause fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: e */
    public void onResume(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onResume fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: f */
    public void onStart(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onStart fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: g */
    public void onStop(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onStop fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(view, "view");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onViewCreated  Fragment = [");
        sb.append(fragment);
        sb.append("], view = [");
        sb.append(view);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: b */
    public void onDestroyView(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onDestroyView fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: c */
    public void onDetach(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onDetach fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public void onActivityCreated(Fragment fragment, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onActivityCreated  Fragment = [");
        sb.append(fragment);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public void onDestroy(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onDestroy fragment = [");
        sb.append(fragment);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }
}
