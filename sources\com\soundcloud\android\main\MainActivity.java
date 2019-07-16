package com.soundcloud.android.main;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ads.PrestitialAdsController;
import com.soundcloud.android.creators.record.UploadActivity;
import com.soundcloud.android.deeplinks.ResolveActivity;
import com.soundcloud.android.deeplinks.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.ui.ac.b;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import java.util.List;

public class MainActivity extends LoggedInActivity implements ja {
    @LightCycle
    PrestitialAdsController A;
    @LightCycle
    PlayerController B;
    @LightCycle
    C5235QJa C;
    @LightCycle
    C4628oia D;
    C3832nea E;
    ba F;
    C4412qb G;
    X H;
    C2526g I;
    C5052KJa J;
    private Bundle K;
    @LightCycle
    ActivityLightCycle<Activity> x = C4987IHa.a.a("MainActivity");
    i y;
    @LightCycle
    MainNavigationPresenter z;

    public final class LightCycleBinder {
        public static void bind(MainActivity mainActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(mainActivity);
            mainActivity.bind(LightCycles.lift(mainActivity.x));
            mainActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) mainActivity.z));
            mainActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) mainActivity.A));
            mainActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) mainActivity.B));
            mainActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) mainActivity.C));
            mainActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) mainActivity.D));
        }
    }

    private void a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && ResolveActivity.a(data, getResources()) && !Y.a(data)) {
            b(data);
        }
    }

    private void b(Uri uri) {
        startActivity(new Intent(this, ResolveActivity.class).setAction("android.intent.action.VIEW").setData(uri));
        finish();
    }

    public void i() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("audio/*");
        startActivityForResult(intent, 8008);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 8008) {
            if (i2 != -1) {
                SDb.b("Could not pick audio file %s", Integer.valueOf(i2));
            } else if (intent != null) {
                a(intent.getData());
            } else {
                this.J.a(new Fca(p.error_could_not_extract_shared_audio_file));
                SDb.b("No data in result %s", Integer.valueOf(i2));
            }
        } else if (i == 8007) {
            this.D.b(i2);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.I.g() && !this.B.l() && !this.H.f()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a(getIntent());
        this.K = bundle;
        super.onCreate(bundle);
        this.E.a(this, bundle);
        this.F.a((FragmentActivity) this);
        bind(LightCycles.lift((ActivityLightCycle<Source>) this.H));
        if (bundle == null) {
            this.H.a(getIntent());
            this.F.a(getIntent());
        }
        this.G.i();
        this.B.a((b) this.z);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.B.b((b) this.z);
        this.F.a(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        a(intent);
        super.onNewIntent(intent);
        if (!this.H.a(intent).booleanValue()) {
            this.F.a(intent);
        }
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.y.a();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setActivityContentView();
        this.H.a(this, this.K);
        this.z.c((RootActivity) this);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (intent == null) {
            intent = new Intent();
        }
        super.startActivityForResult(intent, i);
    }

    /* access modifiers changed from: protected */
    public List<C4613mja> w() {
        List<C4613mja> w = super.w();
        w.add(this.F);
        return w;
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    @SuppressLint({"sc.CreateIntent"})
    private void a(Uri uri) {
        Intent intent = new Intent(this, UploadActivity.class);
        intent.setAction(C2929h.i);
        intent.putExtra("android.intent.extra.STREAM", uri);
        startActivity(intent);
    }
}
