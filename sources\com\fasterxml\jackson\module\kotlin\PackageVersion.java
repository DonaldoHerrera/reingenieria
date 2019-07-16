package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.util.VersionUtil;

public final class PackageVersion implements Versioned {
    public static final Version VERSION = VersionUtil.parseVersion("2.9.6", "com.fasterxml.jackson.module", "jackson-module-kotlin");
}
