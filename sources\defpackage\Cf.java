package defpackage;

import android.content.Context;
import bo.app.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Cf reason: default package */
public class Cf {
    private static final String a = Hg.a(Cf.class);
    private final Context b;
    protected final Map<String, Object> mConfigurationCache = Collections.synchronizedMap(new HashMap());
    protected final k mRuntimeAppConfigurationProvider;

    public Cf(Context context) {
        this.b = context;
        this.mRuntimeAppConfigurationProvider = new k(context);
    }

    /* access modifiers changed from: protected */
    public boolean getBooleanValue(String str, boolean z) {
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Boolean) this.mConfigurationCache.get(str)).booleanValue();
        }
        String str2 = " and value: ";
        if (this.mRuntimeAppConfigurationProvider.a(str)) {
            boolean a2 = this.mRuntimeAppConfigurationProvider.a(str, z);
            this.mConfigurationCache.put(str, Boolean.valueOf(a2));
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str2);
            sb.append(a2);
            Hg.a(str3, sb.toString());
            return a2;
        }
        boolean readBooleanResourceValue = readBooleanResourceValue(str, z);
        this.mConfigurationCache.put(str, Boolean.valueOf(readBooleanResourceValue));
        String str4 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(readBooleanResourceValue);
        Hg.a(str4, sb2.toString());
        return readBooleanResourceValue;
    }

    /* access modifiers changed from: protected */
    public int getIntValue(String str, int i) {
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        String str2 = " and value: ";
        if (this.mRuntimeAppConfigurationProvider.a(str)) {
            int a2 = this.mRuntimeAppConfigurationProvider.a(str, i);
            this.mConfigurationCache.put(str, Integer.valueOf(a2));
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str2);
            sb.append(a2);
            Hg.a(str3, sb.toString());
            return a2;
        }
        int readIntegerResourceValue = readIntegerResourceValue(str, i);
        this.mConfigurationCache.put(str, Integer.valueOf(readIntegerResourceValue));
        String str4 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(readIntegerResourceValue);
        Hg.a(str4, sb2.toString());
        return readIntegerResourceValue;
    }

    /* access modifiers changed from: protected */
    public String getStringValue(String str, String str2) {
        if (this.mConfigurationCache.containsKey(str)) {
            return (String) this.mConfigurationCache.get(str);
        }
        String str3 = " and value: ";
        if (this.mRuntimeAppConfigurationProvider.a(str)) {
            String a2 = this.mRuntimeAppConfigurationProvider.a(str, str2);
            this.mConfigurationCache.put(str, a2);
            String str4 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str3);
            sb.append(a2);
            Hg.a(str4, sb.toString());
            return a2;
        }
        String readStringResourceValue = readStringResourceValue(str, str2);
        this.mConfigurationCache.put(str, readStringResourceValue);
        String str5 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append(readStringResourceValue);
        Hg.a(str5, sb2.toString());
        return readStringResourceValue;
    }

    /* access modifiers changed from: protected */
    public boolean readBooleanResourceValue(String str, boolean z) {
        String str2 = "'.";
        if (str == null) {
            return z;
        }
        try {
            int identifier = this.b.getResources().getIdentifier(str, "bool", Lg.a(this.b));
            if (identifier != 0) {
                return this.b.getResources().getBoolean(identifier);
            }
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml boolean configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(z);
            sb.append(str2);
            Hg.a(str3, sb.toString());
            return z;
        } catch (Exception unused) {
            String str4 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml boolean configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(z);
            sb2.append(str2);
            Hg.a(str4, sb2.toString());
            return z;
        }
    }

    /* access modifiers changed from: protected */
    public int readIntegerResourceValue(String str, int i) {
        String str2 = "'.";
        if (str == null) {
            return i;
        }
        try {
            int identifier = this.b.getResources().getIdentifier(str, "integer", Lg.a(this.b));
            if (identifier != 0) {
                return this.b.getResources().getInteger(identifier);
            }
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml integer configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(i);
            sb.append(str2);
            Hg.a(str3, sb.toString());
            return i;
        } catch (Exception unused) {
            String str4 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml integer configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(i);
            sb2.append(str2);
            Hg.a(str4, sb2.toString());
            return i;
        }
    }

    /* access modifiers changed from: protected */
    public String[] readStringArrayResourceValue(String str, String[] strArr) {
        String str2 = "'.";
        if (str == null) {
            return strArr;
        }
        try {
            int identifier = this.b.getResources().getIdentifier(str, "array", Lg.a(this.b));
            if (identifier != 0) {
                return this.b.getResources().getStringArray(identifier);
            }
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml string array configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(Arrays.toString(strArr));
            sb.append(str2);
            Hg.a(str3, sb.toString());
            return strArr;
        } catch (Exception unused) {
            String str4 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml string array configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(Arrays.toString(strArr));
            sb2.append(str2);
            Hg.a(str4, sb2.toString());
            return strArr;
        }
    }

    /* access modifiers changed from: protected */
    public String readStringResourceValue(String str, String str2) {
        String str3 = "'.";
        if (str == null) {
            return str2;
        }
        try {
            int identifier = this.b.getResources().getIdentifier(str, "string", Lg.a(this.b));
            if (identifier != 0) {
                return this.b.getResources().getString(identifier);
            }
            String str4 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml string configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(str2);
            sb.append(str3);
            Hg.a(str4, sb.toString());
            return str2;
        } catch (Exception unused) {
            String str5 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml string configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(str2);
            sb2.append(str3);
            Hg.a(str5, sb2.toString());
            return str2;
        }
    }
}
