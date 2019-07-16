package bo.app;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class el implements eh {
    private static final String a = Hg.a(el.class);
    private ey b;
    private String c;
    private int d;
    private Object e;

    /* renamed from: bo.app.el$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ey.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            a[ey.STRING.ordinal()] = 1;
            a[ey.BOOLEAN.ordinal()] = 2;
            a[ey.DATE.ordinal()] = 3;
            try {
                a[ey.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    el(ey eyVar, String str, int i) {
        this.b = eyVar;
        this.c = str;
        this.d = i;
    }

    private boolean b(Object obj) {
        boolean z = false;
        if (!(obj instanceof Boolean)) {
            if (this.d == 2) {
                z = true;
            }
            return z;
        }
        int i = this.d;
        if (i == 1) {
            return obj.equals(this.e);
        }
        if (i != 2) {
            return false;
        }
        return !obj.equals(this.e);
    }

    private boolean c(Object obj) {
        boolean z = false;
        if (!(obj instanceof String)) {
            int i = this.d;
            if (i == 2 || i == 17) {
                z = true;
            }
            return z;
        }
        int i2 = this.d;
        if (i2 == 1) {
            return obj.equals(this.e);
        }
        if (i2 == 2) {
            return !obj.equals(this.e);
        }
        if (i2 == 10) {
            return ((String) obj).matches((String) this.e);
        }
        if (i2 != 17) {
            return false;
        }
        return !((String) obj).matches((String) this.e);
    }

    public boolean a(fb fbVar) {
        boolean z = false;
        if (!(fbVar instanceof fc)) {
            return false;
        }
        C1782vg f = ((fc) fbVar).f();
        Object obj = null;
        if (f != null) {
            try {
                obj = f.forJsonPut().opt(this.c);
            } catch (Exception e2) {
                Hg.b(a, "Caught exception checking property filter condition.", e2);
                return false;
            }
        }
        if (obj == null) {
            if (this.d == 12 || this.d == 17 || this.d == 2) {
                z = true;
            }
            return z;
        } else if (this.d == 11) {
            return true;
        } else {
            if (this.d == 12) {
                return false;
            }
            int i = AnonymousClass1.a[this.b.ordinal()];
            if (i == 1) {
                return c(obj);
            }
            if (i == 2) {
                return b(obj);
            }
            if (i == 3) {
                return a(obj, fbVar.c());
            }
            if (i != 4) {
                return false;
            }
            return a(obj);
        }
    }

    protected el(JSONObject jSONObject) {
        this((ey) du.a(jSONObject, "property_type", ey.class, ey.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        String str = "property_value";
        if (!jSONObject.has(str)) {
            return;
        }
        if (this.b.equals(ey.STRING)) {
            this.e = jSONObject.getString(str);
        } else if (this.b.equals(ey.BOOLEAN)) {
            this.e = Boolean.valueOf(jSONObject.getBoolean(str));
        } else if (this.b.equals(ey.NUMBER)) {
            this.e = Double.valueOf(jSONObject.getDouble(str));
        } else if (this.b.equals(ey.DATE)) {
            this.e = Long.valueOf(jSONObject.getLong(str));
        }
    }

    private boolean a(Object obj, long j) {
        Date a2 = obj instanceof String ? dn.a((String) obj, s.LONG) : null;
        boolean z = true;
        if (a2 == null) {
            if (this.d != 2) {
                z = false;
            }
            return z;
        }
        long a3 = dn.a(a2);
        long longValue = ((Number) this.e).longValue();
        int i = this.d;
        if (i == 15) {
            if (a3 >= j + longValue) {
                z = false;
            }
            return z;
        } else if (i != 16) {
            switch (i) {
                case 1:
                    if (a3 != longValue) {
                        z = false;
                    }
                    return z;
                case 2:
                    if (a3 == longValue) {
                        z = false;
                    }
                    return z;
                case 3:
                    if (a3 <= longValue) {
                        z = false;
                    }
                    return z;
                case 4:
                    if (a3 < j - longValue) {
                        z = false;
                    }
                    return z;
                case 5:
                    if (a3 >= longValue) {
                        z = false;
                    }
                    return z;
                case 6:
                    if (a3 > j - longValue) {
                        z = false;
                    }
                    return z;
                default:
                    return false;
            }
        } else {
            if (a3 <= j + longValue) {
                z = false;
            }
            return z;
        }
    }

    private boolean a(Object obj) {
        boolean z = false;
        if ((obj instanceof Integer) || (obj instanceof Double)) {
            double doubleValue = ((Number) obj).doubleValue();
            double doubleValue2 = ((Number) this.e).doubleValue();
            int i = this.d;
            if (i == 1) {
                if (doubleValue == doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i == 2) {
                if (doubleValue != doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i == 3) {
                if (doubleValue > doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i != 5) {
                return false;
            } else {
                if (doubleValue < doubleValue2) {
                    z = true;
                }
                return z;
            }
        } else {
            if (this.d == 2) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.b.equals(ey.UNKNOWN)) {
                jSONObject.put("property_type", this.b.toString());
            }
            jSONObject.put("property_key", this.c);
            jSONObject.put("comparator", this.d);
            jSONObject.put("property_value", this.e);
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating property filter Json.", e2);
        }
        return jSONObject;
    }
}
