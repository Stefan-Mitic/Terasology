/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.i18n.assets;

import java.util.Locale;
import java.util.Map;

import org.terasology.assets.Asset;
import org.terasology.assets.AssetType;
import org.terasology.assets.ResourceUrn;
import org.terasology.engine.Uri;

/**
 * TODO Type description
 */
public abstract class Translation extends Asset<TranslationData> {

    protected Translation(ResourceUrn urn, AssetType<?, TranslationData> assetType) {
        super(urn, assetType);
    }

    public abstract Uri getProjectUri();

    public abstract Locale getLocale();

    public abstract Map<String, String> getTranslations();
}
