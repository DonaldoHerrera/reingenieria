package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: om reason: default package and case insensitive filesystem */
/* compiled from: AudioFocusManager */
public final class C1578om {
    private final AudioManager a;
    private final a b;
    /* access modifiers changed from: private */
    public final b c;
    private C1485lm d;
    /* access modifiers changed from: private */
    public int e;
    private int f;
    /* access modifiers changed from: private */
    public float g = 1.0f;
    private AudioFocusRequest h;
    private boolean i;

    /* renamed from: om$a */
    /* compiled from: AudioFocusManager */
    private class a implements OnAudioFocusChangeListener {
        private a() {
        }

        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i == -2) {
                    C1578om.this.e = 2;
                } else if (i == -1) {
                    C1578om.this.e = -1;
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown focus change type: ");
                    sb.append(i);
                    Iq.d("AudioFocusManager", sb.toString());
                    return;
                } else {
                    C1578om.this.e = 1;
                }
            } else if (C1578om.this.i()) {
                C1578om.this.e = 2;
            } else {
                C1578om.this.e = 3;
            }
            int a2 = C1578om.this.e;
            if (a2 == -1) {
                C1578om.this.c.c(-1);
                C1578om.this.b(true);
            } else if (a2 != 0) {
                if (a2 == 1) {
                    C1578om.this.c.c(1);
                } else if (a2 == 2) {
                    C1578om.this.c.c(0);
                } else if (a2 != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown audio focus state: ");
                    sb2.append(C1578om.this.e);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            float f = C1578om.this.e == 3 ? 0.2f : 1.0f;
            if (C1578om.this.g != f) {
                C1578om.this.g = f;
                C1578om.this.c.a(f);
            }
        }
    }

    /* renamed from: om$b */
    /* compiled from: AudioFocusManager */
    public interface b {
        void a(float f);

        void c(int i);
    }

    public C1578om(Context context, b bVar) {
        this.a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.c = bVar;
        this.b = new a();
        this.e = 0;
    }

    private int c(boolean z) {
        return z ? 1 : -1;
    }

    private void e() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private int f() {
        int i2;
        int i3 = 1;
        if (this.f == 0) {
            if (this.e != 0) {
                b(true);
            }
            return 1;
        }
        if (this.e == 0) {
            if (C0471ar.a >= 26) {
                i2 = h();
            } else {
                i2 = g();
            }
            this.e = i2 == 1 ? 1 : 0;
        }
        int i4 = this.e;
        if (i4 == 0) {
            return -1;
        }
        if (i4 == 2) {
            i3 = 0;
        }
        return i3;
    }

    private int g() {
        AudioManager audioManager = this.a;
        a aVar = this.b;
        C1485lm lmVar = this.d;
        C1852xq.a(lmVar);
        return audioManager.requestAudioFocus(aVar, C0471ar.d(lmVar.d), this.f);
    }

    private int h() {
        if (this.h == null || this.i) {
            AudioFocusRequest audioFocusRequest = this.h;
            Builder builder = audioFocusRequest == null ? new Builder(this.f) : new Builder(audioFocusRequest);
            boolean i2 = i();
            C1485lm lmVar = this.d;
            C1852xq.a(lmVar);
            this.h = builder.setAudioAttributes(lmVar.a()).setWillPauseWhenDucked(i2).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.a.requestAudioFocus(this.h);
    }

    /* access modifiers changed from: private */
    public boolean i() {
        C1485lm lmVar = this.d;
        return lmVar != null && lmVar.b == 1;
    }

    private void c() {
        b(false);
    }

    private void d() {
        this.a.abandonAudioFocus(this.b);
    }

    public void b() {
        b(true);
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (this.f != 0 || this.e != 0) {
            if (this.f != 1 || this.e == -1 || z) {
                if (C0471ar.a >= 26) {
                    e();
                } else {
                    d();
                }
                this.e = 0;
            }
        }
    }

    public float a() {
        return this.g;
    }

    public int a(boolean z) {
        if (z) {
            return f();
        }
        return -1;
    }

    public int a(boolean z, int i2) {
        if (!z) {
            c();
            return -1;
        }
        return i2 == 1 ? c(z) : f();
    }
}
