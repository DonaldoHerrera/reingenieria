package com.soundcloud.android.features.record;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import com.soundcloud.android.features.record.G.n;
import com.soundcloud.android.utilities.android.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Recording implements Comparable<Recording>, Parcelable {
    public static final Creator<Recording> CREATOR = new Q();
    private static final Pattern a = Pattern.compile("^.*\\.(amp)$");
    private static final Pattern b = Pattern.compile("^.*\\.(2|pcm|wav)$");
    private static final Pattern c = Pattern.compile("^.*\\.(0|1|mp4|ogg)$");
    public long d;
    public String e;
    public long f;
    public boolean g;
    public String[] h;
    public String i;
    public String j;
    public File k;
    public String l;
    public File m;
    public File n;
    public boolean o;
    private int p;
    private PlaybackStream q;

    public static class a implements FilenameFilter {
        public boolean accept(File file, String str) {
            return Recording.e(str) || Recording.d(str) || Recording.c(str);
        }
    }

    private static class b implements FilenameFilter {
        private final Recording a;

        b(Recording recording) {
            this.a = recording;
        }

        public boolean accept(File file, String str) {
            if (Recording.e(str)) {
                Recording recording = this.a;
                if (recording == null || !recording.k.getName().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class c {
    }

    public Recording() {
    }

    private boolean V() {
        File file = this.n;
        return file != null && file.exists();
    }

    private PlaybackStream W() {
        try {
            return new PlaybackStream(C3671x.a(this.k, f()));
        } catch (IOException e2) {
            Log.w(ba.b, "could not initialize playback stream", e2);
            return new PlaybackStream(C3671x.a);
        }
    }

    private long X() {
        return (this.k.exists() ? this.k : f()).lastModified();
    }

    /* access modifiers changed from: private */
    public static boolean e(String str) {
        return b.matcher(str).matches();
    }

    public boolean J() {
        File file = this.m;
        return file != null && file.exists();
    }

    public boolean K() {
        int i2 = this.p;
        return i2 == 4 || i2 == 5;
    }

    public boolean L() {
        return !this.g;
    }

    public boolean M() {
        return this.p == 2;
    }

    public void N() {
        this.p = 2;
    }

    public boolean O() {
        if (this.o) {
            return false;
        }
        PlaybackStream u = u();
        if (u == null || !u.m()) {
            return !f().exists();
        }
        return !v().exists();
    }

    public boolean P() {
        PlaybackStream u = u();
        return !O() && u != null && u.o() && (!v().exists() || v().length() == 0);
    }

    public boolean Q() {
        return J() && !V();
    }

    public void R() {
        this.p = 5;
    }

    public void S() {
        this.p = 4;
    }

    public void T() {
        this.p = 0;
    }

    public String U() {
        return TextUtils.join(" ", x());
    }

    public String c() {
        return this.k.getAbsolutePath();
    }

    public File d() {
        return C6630iGa.b(this.k, "amp");
    }

    public int describeContents() {
        return 0;
    }

    public File f() {
        return C6630iGa.b(this.k, "ogg");
    }

    public File g() {
        return this.k;
    }

    public long getId() {
        return (long) c().hashCode();
    }

    public String toString() {
        List list;
        StringBuilder sb = new StringBuilder();
        sb.append("Recording{user_id=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", audio_path=");
        sb.append(this.k);
        sb.append(", original_filename=");
        sb.append(this.l);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", artwork_path=");
        sb.append(this.m);
        sb.append(", is_private=");
        sb.append(this.g);
        sb.append(", external_upload=");
        sb.append(this.o);
        sb.append(", upload_status=");
        sb.append(this.p);
        sb.append(", tags=");
        String[] strArr = this.h;
        if (strArr == null) {
            list = null;
        } else {
            list = Arrays.asList(strArr);
        }
        sb.append(list);
        sb.append(", description='");
        sb.append(this.i);
        sb.append('\'');
        sb.append(", genre='");
        sb.append(this.j);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public PlaybackStream u() {
        if (this.q == null && !this.o) {
            this.q = W();
        }
        return this.q;
    }

    public File v() {
        return C6630iGa.a(f(), "_processed");
    }

    public File w() {
        if (e(this.k.getName())) {
            return this.k;
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.d);
        bundle.putString("title_text", this.e);
        bundle.putString("audio_path", this.k.getAbsolutePath());
        bundle.putString("original_filename", this.l);
        File file = this.m;
        if (file != null) {
            bundle.putString("artwork_path", file.getAbsolutePath());
        }
        File file2 = this.n;
        if (file2 != null) {
            bundle.putString("resized_artwork_path", file2.getAbsolutePath());
        }
        bundle.putLong("duration", this.f);
        bundle.putString("description", this.i);
        bundle.putString("genre", this.j);
        bundle.putBoolean("is_private", this.g);
        bundle.putBoolean("external_upload", this.o);
        bundle.putInt("upload_status", this.p);
        if (!this.o) {
            bundle.putParcelable("playback_stream", this.q);
        }
        parcel.writeBundle(bundle);
    }

    public List<String> x() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.h;
        if (strArr != null) {
            for (String str : strArr) {
                if (str.contains(" ")) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = "\"";
                    sb.append(str2);
                    sb.append(str);
                    sb.append(str2);
                    str = sb.toString();
                }
                arrayList.add(str);
            }
        }
        if (this.o) {
            arrayList.add("soundcloud:source=android-3rdparty-upload");
        } else {
            arrayList.add("soundcloud:source=android-record");
        }
        return arrayList;
    }

    public File y() {
        if (v().exists()) {
            return v();
        }
        if (f().exists()) {
            return f();
        }
        if (g().exists()) {
            return g();
        }
        return null;
    }

    public Recording(File file) {
        this.k = file;
    }

    private File a(File file) {
        return new File(file, C6630iGa.b(this.k, "bmp").getName());
    }

    public static boolean c(String str) {
        return a.matcher(str).matches();
    }

    /* access modifiers changed from: private */
    public static boolean d(String str) {
        return c.matcher(str).matches();
    }

    public File b(Context context) {
        return a(C6630iGa.a(context, "recordings/images"));
    }

    public String e(Context context) {
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        if (!this.o || c(context) || d(context)) {
            return a(context.getResources());
        }
        return this.k.getName();
    }

    public void a(PlaybackStream playbackStream) {
        this.f = playbackStream == null ? 0 : playbackStream.c();
        this.q = playbackStream;
    }

    public String b() {
        return C7315sGa.a(this.f, TimeUnit.MILLISECONDS);
    }

    public boolean c(Context context) {
        return this.o && this.k.getParentFile().equals(ba.a(context));
    }

    public boolean d(Context context) {
        return this.o && this.k.getParentFile().equals(ba.a(context));
    }

    public Recording(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(Recording.class.getClassLoader());
        this.d = readBundle.getLong("user_id");
        this.e = readBundle.getString("title_text");
        this.i = readBundle.getString("description");
        this.j = readBundle.getString("genre");
        this.k = new File(readBundle.getString("audio_path"));
        this.l = readBundle.getString("original_filename");
        String str = "artwork_path";
        if (readBundle.containsKey(str)) {
            this.m = new File(readBundle.getString(str));
        }
        String str2 = "resized_artwork_path";
        if (readBundle.containsKey(str2)) {
            this.n = new File(readBundle.getString(str2));
        }
        this.f = readBundle.getLong("duration");
        this.g = readBundle.getBoolean("is_private", false);
        this.o = readBundle.getBoolean("external_upload", false);
        this.p = readBundle.getInt("upload_status");
        if (!this.o) {
            this.q = (PlaybackStream) readBundle.getParcelable("playback_stream");
        }
    }

    private String b(Resources resources) {
        int i2;
        Time time = new Time();
        time.set(X());
        int i3 = time.hour;
        if (i3 <= 12) {
            i2 = n.recorded_dayofweek_morning;
        } else if (i3 <= 17) {
            i2 = n.recorded_dayofweek_afternoon;
        } else if (i3 <= 21) {
            i2 = n.recorded_dayofweek_evening;
        } else {
            i2 = n.recorded_dayofweek_night;
        }
        return resources.getString(i2, new Object[]{time.format("%A")});
    }

    private String a(Resources resources) {
        return resources.getString(n.record_default_title_sounds_from_day_time_of_day, new Object[]{b(resources)});
    }

    public void a() {
        C6630iGa.b(this.m);
        this.m = null;
    }

    /* renamed from: a */
    public int compareTo(Recording recording) {
        return Long.valueOf(X()).compareTo(Long.valueOf(recording.X()));
    }

    public static Recording a(Intent intent) {
        if (intent != null) {
            String str = "recording";
            if (intent.hasExtra(str)) {
                return (Recording) intent.getParcelableExtra(str);
            }
        }
        return null;
    }

    public File e() {
        File file = this.n;
        return (file == null || !file.exists()) ? this.m : this.n;
    }

    public static Recording a(Context context) {
        File a2 = ba.a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(".");
        sb.append("wav");
        return new Recording(new File(a2, sb.toString()));
    }

    public static long a(File file, Recording recording) {
        return a(file, recording, 104857600);
    }

    private static long a(File file, Recording recording, long j2) {
        b bVar = new b(recording);
        int i2 = 0;
        long a2 = C6630iGa.a(file) - j2;
        long j3 = 0;
        long max = Math.max(0, a2);
        if (max > 0) {
            File[] a3 = C6630iGa.a(file, (FilenameFilter) bVar);
            if (a3.length > 0) {
                Arrays.sort(a3, new g(true));
                while (j3 < max && i2 < a3.length) {
                    j3 += a3[i2].length();
                    a3[i2].delete();
                    i2++;
                }
            }
        }
        return j3;
    }
}
