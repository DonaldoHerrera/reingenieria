package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* renamed from: Th reason: default package */
/* compiled from: CrashPromptDialog */
class Th {
    private final b a;
    private final Builder b;

    /* renamed from: Th$a */
    /* compiled from: CrashPromptDialog */
    interface a {
        void a(boolean z);
    }

    /* renamed from: Th$b */
    /* compiled from: CrashPromptDialog */
    private static class b {
        private boolean a;
        private final CountDownLatch b;

        private b() {
            this.a = false;
            this.b = new CountDownLatch(1);
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.a = z;
            this.b.countDown();
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
            }
        }

        /* synthetic */ b(Qh qh) {
            this();
        }
    }

    private Th(Builder builder, b bVar) {
        this.a = bVar;
        this.b = builder;
    }

    private static int a(float f, int i) {
        return (int) (f * ((float) i));
    }

    public static Th a(Activity activity, C5567aPa apa, a aVar) {
        b bVar = new b(null);
        Ui ui = new Ui(activity, apa);
        Builder builder = new Builder(activity);
        ScrollView a2 = a(activity, ui.c());
        builder.setView(a2).setTitle(ui.e()).setCancelable(false).setNeutralButton(ui.d(), new Qh(bVar));
        if (apa.d) {
            builder.setNegativeButton(ui.b(), new Rh(bVar));
        }
        if (apa.f) {
            builder.setPositiveButton(ui.a(), new Sh(aVar, bVar));
        }
        return new Th(builder, bVar);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c() {
        this.b.show();
    }

    private static ScrollView a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a2 = a(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a2, a2, a2, a2);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(a(f, 14), a(f, 2), a(f, 10), a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    public void a() {
        this.a.a();
    }
}
