package androidx.media;

import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AudioAttributesImplApi21 implements C0379a {
    static Method a;
    public AudioAttributes b;
    public int c = -1;

    AudioAttributesImplApi21() {
    }

    static Method c() {
        try {
            if (a == null) {
                a = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return a;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public int a() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        Method c2 = c();
        String str = "AudioAttributesCompat21";
        if (c2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No AudioAttributes#toLegacyStreamType() on API: ");
            sb.append(VERSION.SDK_INT);
            Log.w(str, sb.toString());
            return -1;
        }
        try {
            return ((Integer) c2.invoke(null, new Object[]{this.b})).intValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getLegacyStreamType() failed on API: ");
            sb2.append(VERSION.SDK_INT);
            Log.w(str, sb2.toString(), e);
            return -1;
        }
    }

    public Object b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.b.equals(((AudioAttributesImplApi21) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.b);
        return sb.toString();
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.b = audioAttributes;
        this.c = i;
    }
}
