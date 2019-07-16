package defpackage;

/* renamed from: gDb reason: default package and case insensitive filesystem */
/* compiled from: ChronoUnit */
public enum C6491gDb implements DDb {
    NANOS("Nanos", C6419fBb.a(1)),
    MICROS("Micros", C6419fBb.a(1000)),
    MILLIS("Millis", C6419fBb.a(1000000)),
    SECONDS("Seconds", C6419fBb.b(1)),
    MINUTES("Minutes", C6419fBb.b(60)),
    HOURS("Hours", C6419fBb.b(3600)),
    HALF_DAYS("HalfDays", C6419fBb.b(43200)),
    DAYS("Days", C6419fBb.b(86400)),
    WEEKS("Weeks", C6419fBb.b(604800)),
    MONTHS("Months", C6419fBb.b(2629746)),
    YEARS("Years", C6419fBb.b(31556952)),
    DECADES("Decades", C6419fBb.b(315569520)),
    CENTURIES("Centuries", C6419fBb.b(3155695200L)),
    MILLENNIA("Millennia", C6419fBb.b(31556952000L)),
    ERAS("Eras", C6419fBb.b(31556952000000000L)),
    FOREVER("Forever", C6419fBb.a(Long.MAX_VALUE, 999999999));
    
    private final String r;
    private final C6419fBb s;

    private C6491gDb(String str, C6419fBb fbb) {
        this.r = str;
        this.s = fbb;
    }

    public <R extends C6967nDb> R a(R r2, long j) {
        return r2.b(j, this);
    }

    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public String toString() {
        return this.r;
    }
}
