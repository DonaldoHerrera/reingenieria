package defpackage;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: Cla reason: default package */
/* compiled from: AudioFocusRequestCompat */
public class Cla {
    private final int a;
    private final OnAudioFocusChangeListener b;
    private final Handler c;
    private final AudioAttributesCompat d;
    private final boolean e;
    private final boolean f;

    /* renamed from: Cla$a */
    /* compiled from: AudioFocusRequestCompat */
    public static final class a {
        private int a;
        private OnAudioFocusChangeListener b;
        private Handler c;
        private AudioAttributesCompat d;
        private boolean e;
        private boolean f;

        public a(int i) {
            this.a = i;
        }

        public a a(OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return a(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public a a(OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.b = onAudioFocusChangeListener;
            this.c = handler;
            return this;
        }

        public a a(AudioAttributesCompat audioAttributesCompat) {
            this.d = audioAttributesCompat;
            return this;
        }

        public Cla a() {
            Cla cla = new Cla(this.a, this.b, this.c, this.d, this.e, this.f);
            return cla;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: Cla$b */
    /* compiled from: AudioFocusRequestCompat */
    public @interface b {
    }

    private AudioAttributes f() {
        AudioAttributesCompat audioAttributesCompat = this.d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.c();
        }
        return new Builder().build();
    }

    public boolean a() {
        return this.f;
    }

    public AudioAttributesCompat b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public AudioFocusRequest c() {
        return new AudioFocusRequest.Builder(this.a).setAudioAttributes(f()).setAcceptsDelayedFocusGain(this.f).setWillPauseWhenDucked(this.e).setOnAudioFocusChangeListener(this.b, this.c).build();
    }

    public int d() {
        return this.a;
    }

    public OnAudioFocusChangeListener e() {
        return this.b;
    }

    private Cla(int i, OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z, boolean z2) {
        this.a = i;
        this.b = onAudioFocusChangeListener;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = z;
        this.f = z2;
    }
}
