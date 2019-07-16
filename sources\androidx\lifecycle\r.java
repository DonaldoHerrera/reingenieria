package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* compiled from: ReportFragment */
public class r extends Fragment {
    private a a;

    /* compiled from: ReportFragment */
    interface a {
        void a();

        void onCreate();

        void onResume();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new r(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.a);
        a(androidx.lifecycle.f.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(androidx.lifecycle.f.a.ON_DESTROY);
        this.a = null;
    }

    public void onPause() {
        super.onPause();
        a(androidx.lifecycle.f.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        b(this.a);
        a(androidx.lifecycle.f.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        c(this.a);
        a(androidx.lifecycle.f.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(androidx.lifecycle.f.a.ON_STOP);
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private void a(androidx.lifecycle.f.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof k) {
            ((k) activity).getLifecycle().b(aVar);
            return;
        }
        if (activity instanceof h) {
            f lifecycle = ((h) activity).getLifecycle();
            if (lifecycle instanceof j) {
                ((j) lifecycle).b(aVar);
            }
        }
    }
}
