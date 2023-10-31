/*
 * Copyright (C) Red Gate Software Ltd 2010-2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.license;

import org.flywaydb.core.internal.util.FlywayDbWebsiteLinks;

/**
 * Thrown when an attempt was made to use a Flyway Teams Edition feature not supported by
 * Flyway Community Edition.
 */
public class FlywayRedgateEditionRequiredException extends FlywayLicensingException {
    public FlywayRedgateEditionRequiredException(String feature) {
        super("Flyway Redgate Edition Required: " + feature + " is not supported by OSS Edition\n" +
                      "Download Redgate Edition for free: " + FlywayDbWebsiteLinks.REDGATE_EDITION_DOWNLOAD);
    }
}