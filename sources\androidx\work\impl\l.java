package androidx.work.impl;

import androidx.room.t.b;
import androidx.room.v.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: WorkDatabase_Impl */
class l extends a {
    final /* synthetic */ WorkDatabase_Impl b;

    l(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.b = workDatabase_Impl;
        super(i);
    }

    public void a(Ud ud) {
        ud.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ud.g("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        ud.g("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        ud.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        ud.g("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        ud.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ud.g("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        ud.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ud.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ud.g("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        ud.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ud.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
    }

    public void b(Ud ud) {
        ud.g("DROP TABLE IF EXISTS `Dependency`");
        ud.g("DROP TABLE IF EXISTS `WorkSpec`");
        ud.g("DROP TABLE IF EXISTS `WorkTag`");
        ud.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        ud.g("DROP TABLE IF EXISTS `WorkName`");
    }

    /* access modifiers changed from: protected */
    public void c(Ud ud) {
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).a(ud);
            }
        }
    }

    public void d(Ud ud) {
        this.b.a = ud;
        ud.g("PRAGMA foreign_keys = ON");
        this.b.a(ud);
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).b(ud);
            }
        }
    }

    public void e(Ud ud) {
    }

    public void f(Ud ud) {
        Md.a(ud);
    }

    /* access modifiers changed from: protected */
    public void g(Ud ud) {
        Ud ud2 = ud;
        HashMap hashMap = new HashMap(2);
        String str = "TEXT";
        String str2 = "work_spec_id";
        hashMap.put(str2, new a(str2, str, true, 1));
        String str3 = "prerequisite_id";
        hashMap.put(str3, new a(str3, str, true, 2));
        HashSet hashSet = new HashSet(2);
        String str4 = "id";
        b bVar = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
        hashSet.add(bVar);
        b bVar2 = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str4}));
        hashSet.add(bVar2);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{str2})));
        hashSet2.add(new d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{str3})));
        String str5 = "Dependency";
        Od od = new Od(str5, hashMap, hashSet, hashSet2);
        Od a = Od.a(ud2, str5);
        String str6 = "\n Found:\n";
        if (od.equals(a)) {
            HashMap hashMap2 = new HashMap(23);
            hashMap2.put(str4, new a(str4, str, true, 1));
            String str7 = "state";
            String str8 = "INTEGER";
            hashMap2.put(str7, new a(str7, str8, true, 0));
            String str9 = "worker_class_name";
            hashMap2.put(str9, new a(str9, str, true, 0));
            String str10 = "input_merger_class_name";
            hashMap2.put(str10, new a(str10, str, false, 0));
            String str11 = "BLOB";
            hashMap2.put("input", new a("input", str11, true, 0));
            hashMap2.put("output", new a("output", str11, true, 0));
            hashMap2.put("initial_delay", new a("initial_delay", str8, true, 0));
            hashMap2.put("interval_duration", new a("interval_duration", str8, true, 0));
            hashMap2.put("flex_duration", new a("flex_duration", str8, true, 0));
            hashMap2.put("run_attempt_count", new a("run_attempt_count", str8, true, 0));
            hashMap2.put("backoff_policy", new a("backoff_policy", str8, true, 0));
            hashMap2.put("backoff_delay_duration", new a("backoff_delay_duration", str8, true, 0));
            hashMap2.put("period_start_time", new a("period_start_time", str8, true, 0));
            hashMap2.put("minimum_retention_duration", new a("minimum_retention_duration", str8, true, 0));
            String str12 = "schedule_requested_at";
            hashMap2.put(str12, new a(str12, str8, true, 0));
            hashMap2.put("required_network_type", new a("required_network_type", str8, false, 0));
            hashMap2.put("requires_charging", new a("requires_charging", str8, true, 0));
            hashMap2.put("requires_device_idle", new a("requires_device_idle", str8, true, 0));
            hashMap2.put("requires_battery_not_low", new a("requires_battery_not_low", str8, true, 0));
            hashMap2.put("requires_storage_not_low", new a("requires_storage_not_low", str8, true, 0));
            hashMap2.put("trigger_content_update_delay", new a("trigger_content_update_delay", str8, true, 0));
            hashMap2.put("trigger_max_content_delay", new a("trigger_max_content_delay", str8, true, 0));
            hashMap2.put("content_uri_triggers", new a("content_uri_triggers", str11, false, 0));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{str12})));
            Od od2 = new Od("WorkSpec", hashMap2, hashSet3, hashSet4);
            Od a2 = Od.a(ud2, "WorkSpec");
            if (od2.equals(a2)) {
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new a("tag", str, true, 1));
                hashMap3.put(str2, new a(str2, str, true, 2));
                HashSet hashSet5 = new HashSet(1);
                b bVar3 = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                hashSet5.add(bVar3);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{str2})));
                Od od3 = new Od("WorkTag", hashMap3, hashSet5, hashSet6);
                Od a3 = Od.a(ud2, "WorkTag");
                if (od3.equals(a3)) {
                    HashMap hashMap4 = new HashMap(2);
                    hashMap4.put(str2, new a(str2, str, true, 1));
                    hashMap4.put("system_id", new a("system_id", str8, true, 0));
                    HashSet hashSet7 = new HashSet(1);
                    b bVar4 = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                    hashSet7.add(bVar4);
                    Od od4 = new Od("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    Od a4 = Od.a(ud2, "SystemIdInfo");
                    if (od4.equals(a4)) {
                        HashMap hashMap5 = new HashMap(2);
                        hashMap5.put("name", new a("name", str, true, 1));
                        hashMap5.put(str2, new a(str2, str, true, 2));
                        HashSet hashSet8 = new HashSet(1);
                        b bVar5 = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                        hashSet8.add(bVar5);
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{str2})));
                        Od od5 = new Od("WorkName", hashMap5, hashSet8, hashSet9);
                        Od a5 = Od.a(ud2, "WorkName");
                        if (!od5.equals(a5)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                            sb.append(od5);
                            sb.append(str6);
                            sb.append(a5);
                            throw new IllegalStateException(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    sb2.append(od4);
                    sb2.append(str6);
                    sb2.append(a4);
                    throw new IllegalStateException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                sb3.append(od3);
                sb3.append(str6);
                sb3.append(a3);
                throw new IllegalStateException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb4.append(od2);
            sb4.append(str6);
            sb4.append(a2);
            throw new IllegalStateException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
        sb5.append(od);
        sb5.append(str6);
        sb5.append(a);
        throw new IllegalStateException(sb5.toString());
    }
}
