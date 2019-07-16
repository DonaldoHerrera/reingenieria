package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;

public class cg {
    public static boolean a = false;
    /* access modifiers changed from: private */
    public static final String b = Hg.a(cg.class);
    /* access modifiers changed from: private */
    public final SharedPreferences c;
    /* access modifiers changed from: private */
    public bb d;

    class a extends AsyncTask<Void, Void, Void> {
        private a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (!cg.this.c.getBoolean("piqqueue", false) || cg.a) {
                Hg.c(cg.b, "No piq requests queued.");
            } else if (cg.this.d != null) {
                cg.this.d.e();
                cg.a = true;
            } else {
                Hg.c(cg.b, "Not calling placeIQ because Appboy manager is null.");
            }
            return null;
        }
    }

    public cg(Context context, String str, bb bbVar) {
        String str2;
        this.d = bbVar;
        if (str == null) {
            Hg.b(b, "PlaceIQManager received null api key.");
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.piqqueue");
        sb2.append(str2);
        this.c = context.getSharedPreferences(sb2.toString(), 0);
        if (!a) {
            new a().execute(new Void[0]);
        } else {
            Hg.c(b, "Not calling piq because it has already been attempted this app run");
        }
    }

    public void a() {
        Hg.c(b, "Clearing placeIQ request.");
        Editor edit = this.c.edit();
        edit.remove("piqqueue");
        edit.apply();
    }

    public void b() {
        Hg.c(b, "Queuing placeIQ request.");
        Editor edit = this.c.edit();
        edit.putBoolean("piqqueue", true);
        edit.apply();
    }
}
