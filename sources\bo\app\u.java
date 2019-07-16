package bo.app;

import java.util.HashMap;
import java.util.Map;

public enum u implements C1294fg<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE("p"),
    PUSH_NOTIFICATION_TRACKING("pc"),
    PUSH_NOTIFICATION_ACTION_TRACKING("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    CARD_IMPRESSION("ci"),
    CARD_CLICK("cc"),
    GEOFENCE("g"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se");
    
    private static final Map<String, u> w = null;
    private final String v;

    static {
        int i;
        u[] values;
        HashMap hashMap = new HashMap();
        for (u uVar : values()) {
            hashMap.put(uVar.v, uVar);
        }
        w = new HashMap(hashMap);
    }

    private u(String str) {
        this.v = str;
    }

    public static u a(String str) {
        if (w.containsKey(str)) {
            return (u) w.get(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown String Value: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean b(u uVar) {
        return uVar.equals(PUSH_NOTIFICATION_TRACKING);
    }

    public static boolean a(u uVar) {
        return b(uVar) || uVar.equals(PUSH_NOTIFICATION_ACTION_TRACKING);
    }

    /* renamed from: a */
    public String forJsonPut() {
        return this.v;
    }
}
