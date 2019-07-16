package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: Ala reason: default package */
/* compiled from: AudioFocusHelper */
public class Ala {
    private final a a;

    /* renamed from: Ala$a */
    /* compiled from: AudioFocusHelper */
    interface a {
        void a();

        boolean a(Cla cla);
    }

    /* renamed from: Ala$b */
    /* compiled from: AudioFocusHelper */
    private static class b extends c {
        private AudioFocusRequest c;

        b(AudioManager audioManager) {
            super(audioManager);
        }

        public boolean a(Cla cla) {
            this.b = cla;
            this.c = cla.c();
            return this.a.requestAudioFocus(this.c) == 1;
        }

        public void a() {
            if (this.b != null) {
                this.a.abandonAudioFocusRequest(this.c);
            }
        }
    }

    /* renamed from: Ala$c */
    /* compiled from: AudioFocusHelper */
    private static class c implements a {
        final AudioManager a;
        Cla b;

        c(AudioManager audioManager) {
            this.a = audioManager;
        }

        public boolean a(Cla cla) {
            this.b = cla;
            if (cla.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot request delayed focus on API ");
                sb.append(VERSION.SDK_INT);
                Log.w("AudioFocusHelper", "Cannot request delayed focus", new UnsupportedOperationException(sb.toString()).fillInStackTrace());
            }
            return this.a.requestAudioFocus(this.b.e(), this.b.b().a(), this.b.d()) == 1;
        }

        public void a() {
            Cla cla = this.b;
            if (cla != null) {
                this.a.abandonAudioFocus(cla.e());
            }
        }
    }

    public Ala(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (VERSION.SDK_INT >= 26) {
            this.a = new b(audioManager);
        } else {
            this.a = new c(audioManager);
        }
    }

    public void a(Cla cla) {
        this.a.a();
    }

    public boolean b(Cla cla) {
        return this.a.a(cla);
    }
}
