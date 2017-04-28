/*
 * Copyright 2017 Schibsted ASA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.echo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

import java.util.Map;

public class Artifact {

    @JsonProperty
    @NonNull String name;

    @JsonProperty
    @NonNull String type;

    @JsonProperty
    @NonNull String version;

    @JsonProperty
    @NonNull
    String reference;

    @JsonProperty
    Map<String, String> metadata;
}
