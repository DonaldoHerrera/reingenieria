package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.onboarding.auth.pa;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.z;
import com.soundcloud.android.sync.T;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: Aka reason: default package */
/* compiled from: AddUserInfoTask */
public class Aka extends Cka {
    private final dfa f;
    private final String g;
    private final String h;
    private final File i;
    private final C2526g j;
    private final a k;

    public Aka(SoundCloudApplication soundCloudApplication, String str, String str2, File file, C3800jea jea, dfa dfa, C2526g gVar, T t, a aVar) {
        super(soundCloudApplication, jea, t);
        this.f = dfa;
        this.g = str2;
        this.h = str;
        this.i = file;
        this.j = gVar;
        this.k = aVar;
    }

    private hfa b(File file) {
        b d = hfa.d(C2226PO.CURRENT_USER.a()).d();
        d.a((lfa) kfa.a("user[avatar_data]", file, "application/octet-stream"));
        return d.b();
    }

    private String c(File file) throws FileNotFoundException {
        Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(file));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeStream.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private void d(File file) throws ifa, FileNotFoundException {
        hfa hfa;
        if (file != null && file.canWrite()) {
            if (this.k.a((a) z.a)) {
                hfa = a(file);
            } else {
                hfa = b(file);
            }
            jfa a = this.f.a(hfa);
            if (a.f()) {
                throw a.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Eka doInBackground(Bundle... bundleArr) {
        try {
            d(this.i);
            C3776gea a = a(this.g, this.h);
            a(a, this.j.e(), pa.API);
            return Hka.a(a, pa.API).a();
        } catch (ifa e) {
            return Hka.a(e).a();
        } catch (Lea | IOException e2) {
            return Hka.a(e2).a();
        }
    }

    private hfa a(File file) throws FileNotFoundException {
        String c = c(file);
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_data", c);
        b c2 = hfa.c(C2226PO.UPDATE_USER_AVATAR.a()).c();
        c2.a((Object) hashMap);
        return c2.b();
    }

    private C3776gea a(String str, String str2) throws IOException, Lea, ifa {
        b c = hfa.d(C2226PO.UPDATE_USER.a()).c();
        HashMap hashMap = new HashMap(2);
        if (C5206PKa.b(str)) {
            hashMap.put("username", str);
            hashMap.put("permalink", str2);
        }
        c.a((Object) hashMap);
        return (C3776gea) this.f.a(c.b(), C3776gea.class);
    }
}
