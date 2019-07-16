package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.k.a;
import androidx.core.app.k.d;
import androidx.core.app.k.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class l implements j {
    private final Builder a;
    private final d b;
    private RemoteViews c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    l(d dVar) {
        this.b = dVar;
        if (VERSION.SDK_INT >= 26) {
            this.a = new Builder(dVar.a, dVar.I);
        } else {
            this.a = new Builder(dVar.a);
        }
        Notification notification = dVar.N;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.d).setContentText(dVar.e).setContentInfo(dVar.j).setContentIntent(dVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.g, (notification.flags & 128) != 0).setLargeIcon(dVar.i).setNumber(dVar.k).setProgress(dVar.r, dVar.s, dVar.t);
        if (VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.a.setSubText(dVar.p).setUsesChronometer(dVar.n).setPriority(dVar.l);
            Iterator it = dVar.b.iterator();
            while (it.hasNext()) {
                a((a) it.next());
            }
            Bundle bundle = dVar.B;
            if (bundle != null) {
                this.f.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.u;
                if (str != null) {
                    this.f.putString("android.support.groupKey", str);
                    if (dVar.v) {
                        this.f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f.putString("android.support.sortKey", str2);
                }
            }
            this.c = dVar.F;
            this.d = dVar.G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(dVar.m);
            if (VERSION.SDK_INT < 21) {
                ArrayList<String> arrayList = dVar.O;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle2 = this.f;
                    ArrayList<String> arrayList2 = dVar.O;
                    bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.g = dVar.M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = dVar.O.iterator();
            while (it2.hasNext()) {
                this.a.addPerson((String) it2.next());
            }
            this.h = dVar.H;
            if (dVar.c.size() > 0) {
                String str3 = "android.car.EXTENSIONS";
                Bundle bundle3 = dVar.c().getBundle(str3);
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), m.a((a) dVar.c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.c().putBundle(str3, bundle3);
                this.f.putBundle(str3, bundle3);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            RemoteViews remoteViews = dVar.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.a.setColorized(dVar.y);
            }
            if (!TextUtils.isEmpty(dVar.I)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    public Builder a() {
        return this.a;
    }

    public Notification b() {
        e eVar = this.b.o;
        if (eVar != null) {
            eVar.a((j) this);
        }
        RemoteViews c2 = eVar != null ? eVar.c(this) : null;
        Notification c3 = c();
        if (c2 != null) {
            c3.contentView = c2;
        } else {
            RemoteViews remoteViews = this.b.F;
            if (remoteViews != null) {
                c3.contentView = remoteViews;
            }
        }
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            RemoteViews b2 = eVar.b(this);
            if (b2 != null) {
                c3.bigContentView = b2;
            }
        }
        if (VERSION.SDK_INT >= 21 && eVar != null) {
            RemoteViews d2 = this.b.o.d(this);
            if (d2 != null) {
                c3.headsUpContentView = d2;
            }
        }
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            Bundle a2 = k.a(c3);
            if (a2 != null) {
                eVar.a(a2);
            }
        }
        return c3;
    }

    /* access modifiers changed from: protected */
    public Notification c() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.a.build();
        }
        if (i >= 24) {
            Notification build = this.a.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.g != 2)) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.a.setExtras(this.f);
            Notification build2 = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.g != 2)) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.a.setExtras(this.f);
            Notification build3 = this.a.build();
            RemoteViews remoteViews4 = this.c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.g != 2)) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else {
            String str = "android.support.actionExtras";
            if (i >= 19) {
                SparseArray a2 = m.a(this.e);
                if (a2 != null) {
                    this.f.putSparseParcelableArray(str, a2);
                }
                this.a.setExtras(this.f);
                Notification build4 = this.a.build();
                RemoteViews remoteViews6 = this.c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.a.getNotification();
            } else {
                Notification build5 = this.a.build();
                Bundle a3 = k.a(build5);
                Bundle bundle = new Bundle(this.f);
                for (String str2 : this.f.keySet()) {
                    if (a3.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                a3.putAll(bundle);
                SparseArray a4 = m.a(this.e);
                if (a4 != null) {
                    k.a(build5).putSparseParcelableArray(str, a4);
                }
                RemoteViews remoteViews8 = this.c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }

    private void a(a aVar) {
        Bundle bundle;
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            Action.Builder builder = new Action.Builder(aVar.e(), aVar.i(), aVar.a());
            if (aVar.f() != null) {
                for (RemoteInput addRemoteInput : o.a(aVar.f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        } else if (i >= 16) {
            this.e.add(m.a(this.a, aVar));
        }
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
