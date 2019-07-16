package androidx.core.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: NotificationCompat */
public class k {

    /* compiled from: NotificationCompat */
    public static class a {
        final Bundle a;
        private final o[] b;
        private final o[] c;
        private boolean d;
        boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        /* renamed from: androidx.core.app.k$a$a reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        public static final class C0005a {
            private final int a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<o> f;
            private int g;
            private boolean h;

            public C0005a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            public C0005a a(Bundle bundle) {
                if (bundle != null) {
                    this.e.putAll(bundle);
                }
                return this;
            }

            private C0005a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, boolean z, int i2, boolean z2) {
                ArrayList<o> arrayList;
                this.d = true;
                this.h = true;
                this.a = i;
                this.b = d.a(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                if (oVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(oVarArr));
                }
                this.f = arrayList;
                this.d = z;
                this.g = i2;
                this.h = z2;
            }

            public a a() {
                o[] oVarArr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<o> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        o oVar = (o) it.next();
                        if (oVar.g()) {
                            arrayList.add(oVar);
                        } else {
                            arrayList2.add(oVar);
                        }
                    }
                }
                o[] oVarArr2 = null;
                if (arrayList.isEmpty()) {
                    oVarArr = null;
                } else {
                    oVarArr = (o[]) arrayList.toArray(new o[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    oVarArr2 = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                }
                a aVar = new a(this.a, this.b, this.c, this.e, oVarArr2, oVarArr, this.d, this.g, this.h);
                return aVar;
            }
        }

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.d;
        }

        public o[] c() {
            return this.c;
        }

        public Bundle d() {
            return this.a;
        }

        public int e() {
            return this.g;
        }

        public o[] f() {
            return this.b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, o[] oVarArr2, boolean z, int i3, boolean z2) {
            this.e = true;
            this.g = i2;
            this.h = d.a(charSequence);
            this.i = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.a = bundle;
            this.b = oVarArr;
            this.c = oVarArr2;
            this.d = z;
            this.f = i3;
            this.e = z2;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends e {
        private Bitmap e;
        private Bitmap f;
        private boolean g;

        public b a(CharSequence charSequence) {
            this.b = d.a(charSequence);
            return this;
        }

        public b b(CharSequence charSequence) {
            this.c = d.a(charSequence);
            this.d = true;
            return this;
        }

        public b a(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        public b b(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public void a(j jVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(jVar.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f);
                }
                if (this.d) {
                    bigPicture.setSummaryText(this.c);
                }
            }
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends e {
        private CharSequence e;

        public c a(CharSequence charSequence) {
            this.e = d.a(charSequence);
            return this;
        }

        public c b(CharSequence charSequence) {
            this.b = d.a(charSequence);
            return this;
        }

        public c c(CharSequence charSequence) {
            this.c = d.a(charSequence);
            this.d = true;
            return this;
        }

        public void a(j jVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(jVar.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }
    }

    /* compiled from: NotificationCompat */
    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;
        @Deprecated
        public ArrayList<String> O;
        public Context a;
        public ArrayList<a> b;
        ArrayList<a> c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            this.N = new Notification();
            this.a = context;
            this.I = str;
            this.N.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        public d a(long j2) {
            this.N.when = j2;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.e = a(charSequence);
            return this;
        }

        public d c(CharSequence charSequence) {
            this.d = a(charSequence);
            return this;
        }

        public d d(boolean z2) {
            this.m = z2;
            return this;
        }

        public d e(int i2) {
            this.N.icon = i2;
            return this;
        }

        public d f(int i2) {
            this.D = i2;
            return this;
        }

        public d a(int i2, int i3, boolean z2) {
            this.r = i2;
            this.s = i3;
            this.t = z2;
            return this;
        }

        public d b(PendingIntent pendingIntent) {
            this.N.deleteIntent = pendingIntent;
            return this;
        }

        public d c(int i2) {
            this.k = i2;
            return this;
        }

        public d d(CharSequence charSequence) {
            this.p = a(charSequence);
            return this;
        }

        public d e(CharSequence charSequence) {
            this.N.tickerText = a(charSequence);
            return this;
        }

        private Bitmap b(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0222Ka.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C0222Ka.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
            return bitmap;
        }

        public d c(boolean z2) {
            a(2, z2);
            return this;
        }

        public d d(int i2) {
            this.l = i2;
            return this;
        }

        public long e() {
            if (this.m) {
                return this.N.when;
            }
            return 0;
        }

        public Bundle c() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public int d() {
            return this.l;
        }

        public d a(RemoteViews remoteViews) {
            this.N.contentView = remoteViews;
            return this;
        }

        public d a(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public d a(Bitmap bitmap) {
            this.i = b(bitmap);
            return this;
        }

        public d a(Uri uri) {
            Notification notification = this.N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d a(boolean z2) {
            a(16, z2);
            return this;
        }

        public d a(String str) {
            this.A = str;
            return this;
        }

        public d b(boolean z2) {
            this.x = z2;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        private void a(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.N;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.N;
            notification2.flags = (~i2) & notification2.flags;
        }

        public d b(int i2) {
            Notification notification = this.N;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public d b(String str) {
            this.I = str;
            return this;
        }

        public d a(a aVar) {
            this.b.add(aVar);
            return this;
        }

        public int b() {
            return this.C;
        }

        public d a(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                e eVar2 = this.o;
                if (eVar2 != null) {
                    eVar2.a(this);
                }
            }
            return this;
        }

        public d a(int i2) {
            this.C = i2;
            return this;
        }

        public d a(Notification notification) {
            this.E = notification;
            return this;
        }

        public Notification a() {
            return new l(this).b();
        }

        protected static CharSequence a(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class e {
        protected d a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(j jVar);

        public void a(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                d dVar2 = this.a;
                if (dVar2 != null) {
                    dVar2.a(this);
                }
            }
        }

        public RemoteViews b(j jVar) {
            return null;
        }

        public RemoteViews c(j jVar) {
            return null;
        }

        public RemoteViews d(j jVar) {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0210  */
        public RemoteViews a(boolean z, int i, boolean z2) {
            boolean z3;
            CharSequence charSequence;
            boolean z4;
            CharSequence charSequence2;
            Resources resources = this.a.a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), i);
            int i2 = 0;
            boolean z5 = this.a.d() < -1;
            int i3 = VERSION.SDK_INT;
            if (i3 >= 16 && i3 < 21) {
                String str = "setBackgroundResource";
                if (z5) {
                    remoteViews.setInt(C0230Ma.notification_background, str, C0226La.notification_bg_low);
                    remoteViews.setInt(C0230Ma.icon, str, C0226La.notification_template_icon_low_bg);
                } else {
                    remoteViews.setInt(C0230Ma.notification_background, str, C0226La.notification_bg);
                    remoteViews.setInt(C0230Ma.icon, str, C0226La.notification_template_icon_bg);
                }
            }
            d dVar = this.a;
            if (dVar.i != null) {
                if (VERSION.SDK_INT >= 16) {
                    remoteViews.setViewVisibility(C0230Ma.icon, 0);
                    remoteViews.setImageViewBitmap(C0230Ma.icon, this.a.i);
                } else {
                    remoteViews.setViewVisibility(C0230Ma.icon, 8);
                }
                if (z && this.a.N.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(C0222Ka.notification_right_icon_size);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(C0222Ka.notification_small_icon_background_padding) * 2);
                    if (VERSION.SDK_INT >= 21) {
                        d dVar2 = this.a;
                        remoteViews.setImageViewBitmap(C0230Ma.right_icon, a(dVar2.N.icon, dimensionPixelSize, dimensionPixelSize2, dVar2.b()));
                    } else {
                        remoteViews.setImageViewBitmap(C0230Ma.right_icon, a(this.a.N.icon, -1));
                    }
                    remoteViews.setViewVisibility(C0230Ma.right_icon, 0);
                }
            } else if (z && dVar.N.icon != 0) {
                remoteViews.setViewVisibility(C0230Ma.icon, 0);
                if (VERSION.SDK_INT >= 21) {
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(C0222Ka.notification_large_icon_width) - resources.getDimensionPixelSize(C0222Ka.notification_big_circle_margin);
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(C0222Ka.notification_small_icon_size_as_large);
                    d dVar3 = this.a;
                    remoteViews.setImageViewBitmap(C0230Ma.icon, a(dVar3.N.icon, dimensionPixelSize3, dimensionPixelSize4, dVar3.b()));
                } else {
                    remoteViews.setImageViewBitmap(C0230Ma.icon, a(this.a.N.icon, -1));
                }
            }
            CharSequence charSequence3 = this.a.d;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(C0230Ma.title, charSequence3);
            }
            CharSequence charSequence4 = this.a.e;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(C0230Ma.text, charSequence4);
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = VERSION.SDK_INT < 21 && this.a.i != null;
            d dVar4 = this.a;
            CharSequence charSequence5 = dVar4.j;
            if (charSequence5 != null) {
                remoteViews.setTextViewText(C0230Ma.info, charSequence5);
                remoteViews.setViewVisibility(C0230Ma.info, 0);
            } else if (dVar4.k > 0) {
                if (this.a.k > resources.getInteger(C0234Na.status_bar_notification_info_maxnum)) {
                    remoteViews.setTextViewText(C0230Ma.info, resources.getString(C0238Oa.status_bar_notification_info_overflow));
                } else {
                    remoteViews.setTextViewText(C0230Ma.info, NumberFormat.getIntegerInstance().format((long) this.a.k));
                }
                remoteViews.setViewVisibility(C0230Ma.info, 0);
            } else {
                remoteViews.setViewVisibility(C0230Ma.info, 8);
                charSequence = this.a.p;
                if (charSequence != null && VERSION.SDK_INT >= 16) {
                    remoteViews.setTextViewText(C0230Ma.text, charSequence);
                    charSequence2 = this.a.e;
                    if (charSequence2 == null) {
                        remoteViews.setTextViewText(C0230Ma.text2, charSequence2);
                        remoteViews.setViewVisibility(C0230Ma.text2, 0);
                        z4 = true;
                        if (z4 && VERSION.SDK_INT >= 16) {
                            if (z2) {
                                remoteViews.setTextViewTextSize(C0230Ma.text, 0, (float) resources.getDimensionPixelSize(C0222Ka.notification_subtext_size));
                            }
                            remoteViews.setViewPadding(C0230Ma.line1, 0, 0, 0, 0);
                        }
                        if (this.a.e() != 0) {
                            if (!this.a.n || VERSION.SDK_INT < 16) {
                                remoteViews.setViewVisibility(C0230Ma.time, 0);
                                remoteViews.setLong(C0230Ma.time, "setTime", this.a.e());
                            } else {
                                remoteViews.setViewVisibility(C0230Ma.chronometer, 0);
                                remoteViews.setLong(C0230Ma.chronometer, "setBase", this.a.e() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                                remoteViews.setBoolean(C0230Ma.chronometer, "setStarted", true);
                            }
                            z6 = true;
                        }
                        remoteViews.setViewVisibility(C0230Ma.right_side, !z6 ? 0 : 8);
                        int i4 = C0230Ma.line3;
                        if (!z3) {
                            i2 = 8;
                        }
                        remoteViews.setViewVisibility(i4, i2);
                        return remoteViews;
                    }
                    remoteViews.setViewVisibility(C0230Ma.text2, 8);
                }
                z4 = false;
                if (z2) {
                }
                remoteViews.setViewPadding(C0230Ma.line1, 0, 0, 0, 0);
                if (this.a.e() != 0) {
                }
                remoteViews.setViewVisibility(C0230Ma.right_side, !z6 ? 0 : 8);
                int i42 = C0230Ma.line3;
                if (!z3) {
                }
                remoteViews.setViewVisibility(i42, i2);
                return remoteViews;
            }
            z3 = true;
            z6 = true;
            charSequence = this.a.p;
            remoteViews.setTextViewText(C0230Ma.text, charSequence);
            charSequence2 = this.a.e;
            if (charSequence2 == null) {
            }
        }

        public Bitmap a(int i, int i2) {
            return a(i, i2, 0);
        }

        private Bitmap a(int i, int i2, int i3) {
            Drawable drawable = this.a.a.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap a(int i, int i2, int i3, int i4) {
            int i5 = C0226La.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a2 = a(i5, i4, i2);
            Canvas canvas = new Canvas(a2);
            Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a2;
        }
    }

    public static Bundle a(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return m.a(notification);
        }
        return null;
    }
}
