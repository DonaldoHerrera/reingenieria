package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.qc reason: case insensitive filesystem */
/* compiled from: DownloadState */
public final class C4152qc {
    final C4146pc a;
    final long b;
    final boolean c;
    private final a d;
    private long e;

    /* renamed from: com.soundcloud.android.offline.qc$a */
    /* compiled from: DownloadState */
    private enum a {
        PROGRESS,
        SUCCESS,
        CANCELLED,
        UNAVAILABLE,
        NOT_ENOUGH_SPACE,
        NOT_ENOUGH_MINIMUM_SPACE,
        INACCESSIBLE_STORAGE,
        CONNECTIVITY_ERROR,
        ERROR
    }

    private C4152qc(a aVar, C4146pc pcVar) {
        this(aVar, pcVar, -1);
    }

    static C4152qc a(C4146pc pcVar, long j) {
        return new C4152qc(a.PROGRESS, pcVar, j);
    }

    static C4152qc b(C4146pc pcVar) {
        return new C4152qc(a.CONNECTIVITY_ERROR, pcVar, true);
    }

    public static C4152qc c(C4146pc pcVar) {
        return new C4152qc(a.ERROR, pcVar);
    }

    static C4152qc d(C4146pc pcVar) {
        return new C4152qc(a.INACCESSIBLE_STORAGE, pcVar);
    }

    static C4152qc e(C4146pc pcVar) {
        return new C4152qc(a.CONNECTIVITY_ERROR, pcVar, false);
    }

    static C4152qc f(C4146pc pcVar) {
        return new C4152qc(a.NOT_ENOUGH_MINIMUM_SPACE, pcVar);
    }

    static C4152qc g(C4146pc pcVar) {
        return new C4152qc(a.NOT_ENOUGH_SPACE, pcVar);
    }

    public static C4152qc h(C4146pc pcVar) {
        return new C4152qc(a.SUCCESS, pcVar, pcVar.g());
    }

    public static C4152qc i(C4146pc pcVar) {
        return new C4152qc(a.UNAVAILABLE, pcVar);
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return this.d == a.NOT_ENOUGH_SPACE;
    }

    public boolean k() {
        return this.d == a.SUCCESS;
    }

    public boolean l() {
        return this.d == a.UNAVAILABLE;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("status", (Object) this.d).a("request", (Object) this.a).a("timestamp", this.b).toString();
    }

    public C4152qc(a aVar, C4146pc pcVar, long j) {
        this(aVar, pcVar, j, false);
    }

    public static C4152qc a(C4146pc pcVar) {
        return new C4152qc(a.CANCELLED, pcVar);
    }

    /* access modifiers changed from: 0000 */
    public long b() {
        return this.a.g();
    }

    public C3508cda c() {
        return this.a.a();
    }

    public boolean d() {
        return this.d == a.CANCELLED;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.d == a.CONNECTIVITY_ERROR;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.d == a.ERROR;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.d == a.PROGRESS;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        return this.d == a.INACCESSIBLE_STORAGE;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.d == a.NOT_ENOUGH_MINIMUM_SPACE;
    }

    private C4152qc(a aVar, C4146pc pcVar, boolean z) {
        this(aVar, pcVar, -1, z);
    }

    public long a() {
        return this.e;
    }

    private C4152qc(a aVar, C4146pc pcVar, long j, boolean z) {
        this.d = aVar;
        this.a = pcVar;
        this.b = System.currentTimeMillis();
        this.e = j;
        this.c = z;
    }
}
