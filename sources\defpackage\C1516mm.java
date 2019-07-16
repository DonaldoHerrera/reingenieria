package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings.Global;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: mm reason: default package and case insensitive filesystem */
/* compiled from: AudioCapabilities */
public final class C1516mm {
    public static final C1516mm a = new C1516mm(new int[]{2}, 8);
    private static final C1516mm b = new C1516mm(new int[]{2, 5, 6}, 8);
    private final int[] c;
    private final int d;

    public C1516mm(int[] iArr, int i) {
        if (iArr != null) {
            this.c = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.c);
        } else {
            this.c = new int[0];
        }
        this.d = i;
    }

    public static C1516mm a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static boolean b() {
        if (C0471ar.a >= 17) {
            if ("Amazon".equals(C0471ar.c)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1516mm)) {
            return false;
        }
        C1516mm mmVar = (C1516mm) obj;
        if (!Arrays.equals(this.c, mmVar.c) || this.d != mmVar.d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.d + (Arrays.hashCode(this.c) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.d);
        sb.append(", supportedEncodings=");
        sb.append(Arrays.toString(this.c));
        sb.append("]");
        return sb.toString();
    }

    @SuppressLint({"InlinedApi"})
    static C1516mm a(Context context, Intent intent) {
        if (b() && Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return b;
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return a;
        }
        return new C1516mm(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public boolean a(int i) {
        return Arrays.binarySearch(this.c, i) >= 0;
    }

    public int a() {
        return this.d;
    }
}
