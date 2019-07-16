package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.dd reason: case insensitive filesystem */
/* compiled from: StopReasonProvider */
public class C4298dd {
    private final C3814lca a;
    private boolean b;

    /* renamed from: com.soundcloud.android.playback.dd$a */
    /* compiled from: StopReasonProvider */
    public enum a {
        STOP_REASON_PAUSE("pause"),
        STOP_REASON_BUFFERING("buffer_underrun"),
        STOP_REASON_SKIP("skip"),
        STOP_REASON_TRACK_FINISHED("track_finished"),
        STOP_REASON_END_OF_QUEUE("end_of_content"),
        STOP_REASON_NEW_QUEUE("context_change"),
        STOP_REASON_ERROR("playback_error"),
        STOP_REASON_CONCURRENT_STREAMING("concurrent_streaming");
        
        private final String j;

        private a(String str) {
            this.j = str;
        }

        public String a() {
            return this.j;
        }
    }

    public C4298dd(C3814lca lca) {
        this.a = lca;
    }

    private a b(C4431ub ubVar) {
        if (ubVar.m()) {
            return b();
        }
        if (ubVar.l()) {
            return a.STOP_REASON_ERROR;
        }
        if (this.b) {
            return a.STOP_REASON_CONCURRENT_STREAMING;
        }
        return a.STOP_REASON_PAUSE;
    }

    public void a() {
        this.b = true;
    }

    public a a(C4431ub ubVar) {
        if (ubVar.f()) {
            return a.STOP_REASON_BUFFERING;
        }
        a b2 = b(ubVar);
        this.b = false;
        return b2;
    }

    private a b() {
        return this.a.t() ? a.STOP_REASON_TRACK_FINISHED : a.STOP_REASON_END_OF_QUEUE;
    }
}
