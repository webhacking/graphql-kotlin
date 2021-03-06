/*
 * Copyright 2020 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.expediagroup.graphql.exceptions

import com.expediagroup.graphql.generator.extensions.getSimpleName
import kotlin.reflect.KType

/**
 * Thrown when schema object type does not expose any fields. Since GraphQL always requires you to select fields down to scalar values, an object type without any defined fields cannot be accessed
 * in any way in a query.
 *
 * @see [Issue 568](https://github.com/graphql/graphql-spec/issues/568)
 */
class EmptyObjectTypeException(ktype: KType) : GraphQLKotlinException("Invalid ${ktype.getSimpleName()} object type - object does not expose any fields.")
