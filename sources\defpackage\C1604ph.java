package defpackage;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ph reason: default package and case insensitive filesystem */
/* compiled from: FirebaseAnalyticsEventMapper */
public class C1604ph {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    private Bundle b(Bh bh) {
        Bundle bundle = new Bundle();
        String str = "itemType";
        String str2 = "item_category";
        String str3 = "itemName";
        String str4 = "itemId";
        String str5 = "itemPrice";
        String str6 = "value";
        String str7 = "item_name";
        String str8 = "item_id";
        String str9 = "currency";
        if ("purchase".equals(bh.g)) {
            a(bundle, str8, (String) bh.h.get(str4));
            a(bundle, str7, (String) bh.h.get(str3));
            a(bundle, str2, (String) bh.h.get(str));
            a(bundle, str6, b(bh.h.get(str5)));
            a(bundle, str9, (String) bh.h.get(str9));
        } else {
            if ("addToCart".equals(bh.g)) {
                a(bundle, str8, (String) bh.h.get(str4));
                a(bundle, str7, (String) bh.h.get(str3));
                a(bundle, str2, (String) bh.h.get(str));
                a(bundle, "price", b(bh.h.get(str5)));
                a(bundle, str6, b(bh.h.get(str5)));
                a(bundle, str9, (String) bh.h.get(str9));
                bundle.putLong("quantity", 1);
            } else {
                if ("startCheckout".equals(bh.g)) {
                    a(bundle, "quantity", Long.valueOf((long) ((Integer) bh.h.get("itemCount")).intValue()));
                    a(bundle, str6, b(bh.h.get("totalPrice")));
                    a(bundle, str9, (String) bh.h.get(str9));
                } else {
                    String str10 = "contentName";
                    String str11 = "contentId";
                    String str12 = "contentType";
                    String str13 = "content_type";
                    if ("contentView".equals(bh.g)) {
                        a(bundle, str13, (String) bh.h.get(str12));
                        a(bundle, str8, (String) bh.h.get(str11));
                        a(bundle, str7, (String) bh.h.get(str10));
                    } else {
                        if ("search".equals(bh.g)) {
                            a(bundle, "search_term", (String) bh.h.get("query"));
                        } else {
                            String str14 = "method";
                            if ("share".equals(bh.g)) {
                                a(bundle, str14, (String) bh.h.get(str14));
                                a(bundle, str13, (String) bh.h.get(str12));
                                a(bundle, str8, (String) bh.h.get(str11));
                                a(bundle, str7, (String) bh.h.get(str10));
                            } else {
                                String str15 = "rating";
                                if (str15.equals(bh.g)) {
                                    a(bundle, str15, String.valueOf(bh.h.get(str15)));
                                    a(bundle, str13, (String) bh.h.get(str12));
                                    a(bundle, str8, (String) bh.h.get(str11));
                                    a(bundle, str7, (String) bh.h.get(str10));
                                } else {
                                    if ("signUp".equals(bh.g)) {
                                        a(bundle, str14, (String) bh.h.get(str14));
                                    } else {
                                        if ("login".equals(bh.g)) {
                                            a(bundle, str14, (String) bh.h.get(str14));
                                        } else {
                                            if ("invite".equals(bh.g)) {
                                                a(bundle, str14, (String) bh.h.get(str14));
                                            } else {
                                                if ("levelStart".equals(bh.g)) {
                                                    a(bundle, "level_name", (String) bh.h.get("levelName"));
                                                } else {
                                                    if ("levelEnd".equals(bh.g)) {
                                                        a(bundle, "score", a(bh.h.get("score")));
                                                        a(bundle, "level_name", (String) bh.h.get("levelName"));
                                                        a(bundle, "success", b((String) bh.h.get("success")));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a(bundle, bh.f);
        return bundle;
    }

    private String c(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        if (a.contains(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(replaceAll);
            replaceAll = sb2.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    public C1573oh a(Bh bh) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = b.CUSTOM.equals(bh.c) && bh.e != null;
        boolean z3 = b.PREDEFINED.equals(bh.c) && bh.g != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = b(bh);
        } else {
            bundle = new Bundle();
            Map<String, Object> map = bh.f;
            if (map != null) {
                a(bundle, map);
            }
        }
        if (z3) {
            String str2 = (String) bh.h.get("success");
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = a(bh.g, z);
        } else {
            str = c(bh.e);
        }
        C5328TMa.e().d("Answers", "Logging event into firebase...");
        return new C1573oh(str, bundle);
    }

    private String a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            sb.append("fabric_");
            sb.append(replaceAll);
            replaceAll = sb.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r11.equals(r1) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    private String a(String str, boolean z) {
        char c;
        char c2 = 0;
        String str2 = "purchase";
        String str3 = "signUp";
        String str4 = "login";
        if (z) {
            int hashCode = str.hashCode();
            if (hashCode != -902468296) {
                if (hashCode != 103149417) {
                    if (hashCode == 1743324417 && str.equals(str2)) {
                        c = 0;
                        if (c != 0) {
                            return "failed_ecommerce_purchase";
                        }
                        if (c == 1) {
                            return "failed_sign_up";
                        }
                        if (c == 2) {
                            return "failed_login";
                        }
                    }
                } else if (str.equals(str4)) {
                    c = 2;
                    if (c != 0) {
                    }
                }
            } else if (str.equals(str3)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        String str5 = "share";
        String str6 = "search";
        String str7 = "invite";
        switch (str.hashCode()) {
            case -2131650889:
                if (str.equals("levelEnd")) {
                    c2 = 11;
                    break;
                }
            case -1183699191:
                if (str.equals(str7)) {
                    c2 = 9;
                    break;
                }
            case -938102371:
                if (str.equals("rating")) {
                    c2 = 6;
                    break;
                }
            case -906336856:
                if (str.equals(str6)) {
                    c2 = 4;
                    break;
                }
            case -902468296:
                if (str.equals(str3)) {
                    c2 = 7;
                    break;
                }
            case -389087554:
                if (str.equals("contentView")) {
                    c2 = 3;
                    break;
                }
            case 23457852:
                if (str.equals("addToCart")) {
                    c2 = 1;
                    break;
                }
            case 103149417:
                if (str.equals(str4)) {
                    c2 = 8;
                    break;
                }
            case 109400031:
                if (str.equals(str5)) {
                    c2 = 5;
                    break;
                }
            case 196004670:
                if (str.equals("levelStart")) {
                    c2 = 10;
                    break;
                }
            case 1664021448:
                if (str.equals("startCheckout")) {
                    c2 = 2;
                    break;
                }
            case 1743324417:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return "ecommerce_purchase";
            case 1:
                return "add_to_cart";
            case 2:
                return "begin_checkout";
            case 3:
                return "select_content";
            case 4:
                return str6;
            case 5:
                return str5;
            case 6:
                return "rate_content";
            case 7:
                return "sign_up";
            case 8:
                return str4;
            case 9:
                return str7;
            case 10:
                return "level_start";
            case 11:
                return "level_end";
            default:
                return c(str);
        }
    }

    private void a(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    private void a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    private void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private void a(Bundle bundle, String str, Double d) {
        Double a2 = a((Object) d);
        if (a2 != null) {
            bundle.putDouble(str, a2.doubleValue());
        }
    }

    private Double a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    private void a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String a2 = a((String) entry.getKey());
            if (value instanceof String) {
                bundle.putString(a2, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(a2, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(a2, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(a2, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    private Integer b(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    private Double b(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(Qg.c).doubleValue());
    }
}
