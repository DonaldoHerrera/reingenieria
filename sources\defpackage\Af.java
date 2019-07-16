package defpackage;

import java.util.List;

/* renamed from: Af reason: default package */
public class Af {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(Af.class);
    private final Boolean A;
    private final Boolean B;
    private final List<String> C;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Of k;
    private final Integer l;
    private final Integer m;
    private final Integer n;
    private final Integer o;
    private final Integer p;
    private final Integer q;
    private final Integer r;
    private final Integer s;
    private final Boolean t;
    private final Boolean u;
    private final Boolean v;
    private final Boolean w;
    private final Boolean x;
    private final Boolean y;
    private final Boolean z;

    /* renamed from: Af$a */
    public static class a {
        /* access modifiers changed from: private */
        public Boolean A;
        /* access modifiers changed from: private */
        public List<String> B;
        /* access modifiers changed from: private */
        public String a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public String d;
        /* access modifiers changed from: private */
        public String e;
        /* access modifiers changed from: private */
        public String f;
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public String h;
        /* access modifiers changed from: private */
        public String i;
        /* access modifiers changed from: private */
        public Of j;
        /* access modifiers changed from: private */
        public Integer k;
        /* access modifiers changed from: private */
        public Integer l;
        /* access modifiers changed from: private */
        public Integer m;
        /* access modifiers changed from: private */
        public Integer n;
        /* access modifiers changed from: private */
        public Integer o;
        /* access modifiers changed from: private */
        public Integer p;
        /* access modifiers changed from: private */
        public Integer q;
        /* access modifiers changed from: private */
        public Integer r;
        /* access modifiers changed from: private */
        public Boolean s;
        /* access modifiers changed from: private */
        public Boolean t;
        /* access modifiers changed from: private */
        public Boolean u;
        /* access modifiers changed from: private */
        public Boolean v;
        /* access modifiers changed from: private */
        public Boolean w;
        /* access modifiers changed from: private */
        public Boolean x;
        /* access modifiers changed from: private */
        public Boolean y;
        /* access modifiers changed from: private */
        public Boolean z;

        public Af a() {
            return new Af(this);
        }

        public a a(String str) {
            if (!Ng.d(str)) {
                this.g = str;
            } else {
                Hg.b(Af.a, "Cannot set Appboy default NotificationChannel name to null or blank string. NotificationChannel name field not set.");
            }
            return this;
        }
    }

    public Integer A() {
        return this.l;
    }

    public String B() {
        return this.e;
    }

    public Integer C() {
        return this.o;
    }

    public Boolean b() {
        return this.u;
    }

    public String c() {
        return this.b;
    }

    public Integer d() {
        return this.q;
    }

    public String e() {
        return this.g;
    }

    public Integer f() {
        return this.n;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.h;
    }

    public Boolean i() {
        return this.x;
    }

    public Boolean j() {
        return this.v;
    }

    public Boolean k() {
        return this.y;
    }

    public Boolean l() {
        return this.t;
    }

    public String m() {
        return this.c;
    }

    public Integer n() {
        return this.r;
    }

    public Integer o() {
        return this.s;
    }

    public Boolean p() {
        return this.w;
    }

    public Boolean q() {
        return this.A;
    }

    public Boolean r() {
        return this.z;
    }

    public String s() {
        return this.f;
    }

    public List<String> t() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppboyConfig{ApiKey='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", GcmSenderId='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", ServerTarget='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", SdkFlavor='");
        sb.append(this.k);
        sb.append('\'');
        sb.append(", SmallNotificationIcon='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", LargeNotificationIcon='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", SessionTimeout=");
        sb.append(this.l);
        sb.append(", LocationUpdateTimeIntervalSeconds=");
        sb.append(this.m);
        sb.append(", DefaultNotificationAccentColor=");
        sb.append(this.n);
        sb.append(", TriggerActionMinimumTimeIntervalSeconds=");
        sb.append(this.o);
        sb.append(", LocationUpdateDistance=");
        sb.append(this.p);
        sb.append(", BadNetworkInterval=");
        sb.append(this.q);
        sb.append(", GoodNetworkInterval=");
        sb.append(this.r);
        sb.append(", GreatNetworkInterval=");
        sb.append(this.s);
        sb.append(", GcmMessagingRegistrationEnabled=");
        sb.append(this.t);
        sb.append(", AdmMessagingRegistrationEnabled=");
        sb.append(this.u);
        sb.append(", DisableUilImageCache=");
        sb.append(this.v);
        sb.append(", HandlePushDeepLinksAutomatically=");
        sb.append(this.w);
        sb.append(", DisableLocationCollection=");
        sb.append(this.x);
        sb.append(", EnableBackgroundLocationCollection=");
        sb.append(this.y);
        sb.append(", IsNewsFeedVisualIndicatorOn=");
        sb.append(this.z);
        sb.append(", IsFrescoLibraryEnabled=");
        sb.append(this.A);
        sb.append(", LocaleToApiMapping=");
        sb.append(this.C);
        sb.append('}');
        return sb.toString();
    }

    public Integer u() {
        return this.p;
    }

    public Integer v() {
        return this.m;
    }

    public String w() {
        return this.j;
    }

    public Boolean x() {
        return this.B;
    }

    public Of y() {
        return this.k;
    }

    public String z() {
        return this.d;
    }

    private Af(a aVar) {
        this.b = aVar.a;
        this.t = aVar.s;
        this.u = aVar.t;
        this.c = aVar.b;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.l = aVar.k;
        this.C = aVar.B;
        this.x = aVar.w;
        this.y = aVar.x;
        this.m = aVar.l;
        this.p = aVar.o;
        this.n = aVar.m;
        this.o = aVar.n;
        this.v = aVar.u;
        this.w = aVar.v;
        this.A = aVar.z;
        this.z = aVar.y;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.d = aVar.c;
        this.k = aVar.j;
        this.h = aVar.g;
        this.i = aVar.h;
        this.B = aVar.A;
        this.j = aVar.i;
    }
}
