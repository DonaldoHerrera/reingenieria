package defpackage;

import java.util.Map;

/* renamed from: fDb reason: default package and case insensitive filesystem */
/* compiled from: ChronoField */
public enum C6423fDb implements C7381tDb {
    NANO_OF_SECOND("NanoOfSecond", C6491gDb.NANOS, C6491gDb.SECONDS, FDb.a(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C6491gDb.NANOS, C6491gDb.DAYS, FDb.a(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C6491gDb.MICROS, C6491gDb.SECONDS, FDb.a(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C6491gDb.MICROS, C6491gDb.DAYS, FDb.a(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C6491gDb.MILLIS, C6491gDb.SECONDS, FDb.a(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C6491gDb.MILLIS, C6491gDb.DAYS, FDb.a(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C6491gDb.SECONDS, C6491gDb.MINUTES, FDb.a(0, 59)),
    SECOND_OF_DAY("SecondOfDay", C6491gDb.SECONDS, C6491gDb.DAYS, FDb.a(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C6491gDb.MINUTES, C6491gDb.HOURS, FDb.a(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", C6491gDb.MINUTES, C6491gDb.DAYS, FDb.a(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C6491gDb.HOURS, C6491gDb.HALF_DAYS, FDb.a(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C6491gDb.HOURS, C6491gDb.HALF_DAYS, FDb.a(1, 12)),
    HOUR_OF_DAY("HourOfDay", C6491gDb.HOURS, C6491gDb.DAYS, FDb.a(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C6491gDb.HOURS, C6491gDb.DAYS, FDb.a(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C6491gDb.HALF_DAYS, C6491gDb.DAYS, FDb.a(0, 1)),
    DAY_OF_WEEK("DayOfWeek", C6491gDb.DAYS, C6491gDb.WEEKS, FDb.a(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C6491gDb.DAYS, C6491gDb.WEEKS, FDb.a(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C6491gDb.DAYS, C6491gDb.WEEKS, FDb.a(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C6491gDb.DAYS, C6491gDb.MONTHS, FDb.a(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", C6491gDb.DAYS, C6491gDb.YEARS, FDb.a(1, 365, 366)),
    EPOCH_DAY("EpochDay", C6491gDb.DAYS, C6491gDb.FOREVER, FDb.a(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C6491gDb.WEEKS, C6491gDb.MONTHS, FDb.a(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C6491gDb.WEEKS, C6491gDb.YEARS, FDb.a(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C6491gDb.MONTHS, C6491gDb.YEARS, FDb.a(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", C6491gDb.MONTHS, C6491gDb.FOREVER, FDb.a(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C6491gDb.YEARS, C6491gDb.FOREVER, FDb.a(1, 999999999, 1000000000)),
    YEAR("Year", C6491gDb.YEARS, C6491gDb.FOREVER, FDb.a(-999999999, 999999999)),
    ERA("Era", C6491gDb.ERAS, C6491gDb.FOREVER, FDb.a(0, 1)),
    INSTANT_SECONDS("InstantSeconds", C6491gDb.SECONDS, C6491gDb.FOREVER, FDb.a(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C6491gDb.SECONDS, C6491gDb.FOREVER, FDb.a(-64800, 64800));
    
    private final String F;
    private final DDb G;
    private final DDb H;
    private final FDb I;

    private C6423fDb(String str, DDb dDb, DDb dDb2, FDb fDb) {
        this.F = str;
        this.G = dDb;
        this.H = dDb2;
        this.I = fDb;
    }

    public int a(long j) {
        return range().a(j, (C7381tDb) this);
    }

    public C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb) {
        return null;
    }

    public long b(long j) {
        range().b(j, this);
        return j;
    }

    public long c(C7036oDb odb) {
        return odb.d(this);
    }

    public boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public FDb range() {
        return this.I;
    }

    public String toString() {
        return this.F;
    }

    public boolean a(C7036oDb odb) {
        return odb.b(this);
    }

    public FDb b(C7036oDb odb) {
        return odb.a((C7381tDb) this);
    }

    public <R extends C6967nDb> R a(R r, long j) {
        return r.a((C7381tDb) this, j);
    }
}
