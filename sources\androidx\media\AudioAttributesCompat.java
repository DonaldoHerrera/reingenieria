package androidx.media;

import android.media.AudioAttributes.Builder;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.versionedparcelable.d;

public class AudioAttributesCompat implements d {
    private static final SparseIntArray a = new SparseIntArray();
    static boolean b;
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    public C0379a d;

    public static class a {
        private int a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        public AudioAttributesCompat a() {
            C0379a aVar;
            if (AudioAttributesCompat.b || VERSION.SDK_INT < 21) {
                aVar = new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
            } else {
                Builder usage = new Builder().setContentType(this.b).setFlags(this.c).setUsage(this.a);
                int i = this.d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                aVar = new AudioAttributesImplApi21(usage.build(), this.d);
            }
            return new AudioAttributesCompat(aVar);
        }

        public a b(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.a = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.b && VERSION.SDK_INT > 25) {
                        this.a = i;
                        break;
                    } else {
                        this.a = 12;
                        break;
                    }
                default:
                    this.a = 0;
                    break;
            }
            return this;
        }

        public a a(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.b = i;
            } else {
                this.a = 0;
            }
            return this;
        }
    }

    static {
        a.put(5, 1);
        a.put(6, 2);
        a.put(7, 2);
        a.put(8, 1);
        a.put(9, 1);
        a.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    public int a() {
        return this.d.a();
    }

    public Object c() {
        return this.d.b();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        C0379a aVar = this.d;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.d);
        }
        if (audioAttributesCompat.d == null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString();
    }

    AudioAttributesCompat(C0379a aVar) {
        this.d = aVar;
    }

    static String a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }

    static int a(boolean z, int i, int i2) {
        int i3 = 1;
        if ((i & 1) == 1) {
            if (!z) {
                i3 = 7;
            }
            return i3;
        }
        int i4 = 0;
        if ((i & 4) == 4) {
            if (!z) {
                i4 = 6;
            }
            return i4;
        }
        int i5 = 3;
        switch (i2) {
            case 0:
                if (z) {
                    i5 = Integer.MIN_VALUE;
                }
                return i5;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                break;
            case 3:
                if (!z) {
                    i4 = 8;
                    break;
                }
                break;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
        return i4;
    }
}
