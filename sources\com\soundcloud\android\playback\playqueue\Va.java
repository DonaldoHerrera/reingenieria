package com.soundcloud.android.playback.playqueue;

/* compiled from: PlayQueueUIItem */
abstract class Va {
    private bb a;
    private b b;
    private boolean c;

    /* compiled from: PlayQueueUIItem */
    enum a {
        TRACK,
        HEADER,
        MAGIC_BOX
    }

    Va(bb bbVar, b bVar, boolean z) {
        this.a = bbVar;
        this.b = bVar;
        this.c = z;
    }

    /* access modifiers changed from: 0000 */
    public abstract a a();

    public void a(bb bbVar) {
        this.a = bbVar;
    }

    /* access modifiers changed from: 0000 */
    public bb b() {
        return this.a;
    }

    public b c() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public abstract long d();

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return a().equals(a.HEADER);
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return a().equals(a.MAGIC_BOX);
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return bb.PLAYING.equals(this.a) || bb.PAUSED.equals(this.a);
    }

    public boolean h() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return a().equals(a.TRACK);
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(boolean z) {
        this.c = z;
    }
}
