package dagger.android.support;

import android.util.Log;
import androidx.fragment.app.Fragment;
import dagger.android.b;
import dagger.android.f;

/* compiled from: AndroidSupportInjection */
public final class a {
    public static void a(Fragment fragment) {
        b bVar;
        C5023JMa.a(fragment, "fragment");
        Object b = b(fragment);
        if (b instanceof f) {
            bVar = ((f) b).oa();
            C5023JMa.a(bVar, "%s.androidInjector() returned null", b.getClass());
        } else if (b instanceof g) {
            bVar = ((g) b).a();
            C5023JMa.a(bVar, "%s.supportFragmentInjector() returned null", b.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{b.getClass().getCanonicalName(), f.class.getCanonicalName(), g.class.getCanonicalName()}));
        }
        String str = "dagger.android.support";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), b.getClass().getCanonicalName()}));
        }
        bVar.a(fragment);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.app.Application] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [android.app.Activity, androidx.fragment.app.FragmentActivity]
  assigns: [androidx.fragment.app.FragmentActivity, android.app.Application]
  uses: [?[OBJECT, ARRAY], android.app.Activity, java.lang.Object]
  mth insns count: 27
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    private static Object b(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 != null) {
                if (fragment2 instanceof f) {
                    break;
                }
            } else {
                ? activity = fragment.getActivity();
                if (!(activity instanceof f) && !(activity instanceof g)) {
                    activity = activity.getApplication();
                    if (!(activity instanceof f) && !(activity instanceof g)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
                    }
                }
                return activity;
            }
        } while (!(fragment2 instanceof g));
        return fragment2;
    }
}
