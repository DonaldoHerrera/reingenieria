package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.b;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: Ak reason: default package */
/* compiled from: ViewIndexer */
public class Ak {
    /* access modifiers changed from: private */
    public static final String a = "Ak";
    private static Ak b;
    /* access modifiers changed from: private */
    public final Handler c = new Handler(Looper.getMainLooper());
    private WeakReference<Activity> d;
    /* access modifiers changed from: private */
    public Timer e;
    /* access modifiers changed from: private */
    public String f = null;

    /* renamed from: Ak$a */
    /* compiled from: ViewIndexer */
    private static class a implements Callable<String> {
        private WeakReference<View> a;

        a(View view) {
            this.a = new WeakReference<>(view);
        }

        public String call() {
            View view = (View) this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public Ak(Activity activity) {
        this.d = new WeakReference<>(activity);
        b = this;
    }

    public void c() {
        if (((Activity) this.d.get()) != null) {
            Timer timer = this.e;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.e = null;
                } catch (Exception e2) {
                    Log.e(a, "Error unscheduling indexing job", e2);
                }
            }
        }
    }

    public void b() {
        Activity activity = (Activity) this.d.get();
        if (activity != null) {
            B.m().execute(new C1846xk(this, new C1816wk(this, activity, activity.getClass().getSimpleName())));
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        B.m().execute(new C1876yk(this, str));
    }

    public static GraphRequest a(String str, AccessToken accessToken, String str2, String str3) {
        if (str == null) {
            return null;
        }
        GraphRequest a2 = GraphRequest.a(accessToken, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (b) null);
        Bundle i = a2.i();
        if (i == null) {
            i = new Bundle();
        }
        i.putString("tree", str);
        i.putString("app_version", Qk.c());
        i.putString("platform", "android");
        i.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            i.putString("device_session_id", Pk.m());
        }
        a2.a(i);
        a2.a((b) new C1906zk());
        return a2;
    }
}
