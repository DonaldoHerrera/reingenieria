package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.soundcloud.lightcycle.ActivityLightCycle;

/* renamed from: GHa reason: default package and case insensitive filesystem */
/* compiled from: LightCycleLogger.kt */
public final class C4925GHa implements ActivityLightCycle<Activity> {
    final /* synthetic */ String a;

    C4925GHa(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public void onCreate(Activity activity, Bundle bundle) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onCreate activity = [");
        sb.append(activity);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public boolean onOptionsItemSelected(Activity activity, MenuItem menuItem) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(menuItem, "menuItem");
        return false;
    }

    /* renamed from: b */
    public void onPause(Activity activity) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onPause activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: c */
    public void onResume(Activity activity) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onResume activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: d */
    public void onStart(Activity activity) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onStart activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: e */
    public void onStop(Activity activity) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onStop activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public void onNewIntent(Activity activity, Intent intent) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(intent, "intent");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onNewIntent activity = [");
        sb.append(activity);
        sb.append("], intent = [");
        sb.append(intent);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: b */
    public void onRestoreInstanceState(Activity activity, Bundle bundle) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onRestoreInstanceState activity = [");
        sb.append(activity);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: c */
    public void onSaveInstanceState(Activity activity, Bundle bundle) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onSaveInstanceState activity = [");
        sb.append(activity);
        sb.append("], bundle = [");
        sb.append(bundle);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }

    /* renamed from: a */
    public void onDestroy(Activity activity) {
        C7471uYa.b(activity, "activity");
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[LIFE_CYCLE] onDestroy activity = [");
        sb.append(activity);
        sb.append(']');
        C7316sHa.a(4, str, sb.toString());
    }
}
