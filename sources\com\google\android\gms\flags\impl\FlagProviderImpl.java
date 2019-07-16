package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
public class FlagProviderImpl extends Hr {
    private boolean a = false;
    private SharedPreferences b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        return b.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        return d.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        return f.a(this.b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        return h.a(this.b, str, str2);
    }

    public void init(Dr dr) {
        Context context = (Context) Er.c(dr);
        if (!this.a) {
            try {
                this.b = j.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (NameNotFoundException unused) {
            } catch (Exception e) {
                String str = "Could not retrieve sdk flags, continuing with defaults: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }
}
