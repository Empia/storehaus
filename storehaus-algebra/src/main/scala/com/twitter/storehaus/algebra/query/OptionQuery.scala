/*
 * Copyright 2013 Twitter Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twitter.storehaus.algebra.query

/**
 * This is for rollups: None means total sum, Some(q) is exact match
 */
class OptionQuery[T] extends AbstractQueryStrategy[Option[T], T, Option[T]] {
  def query(q: Option[T]) = Set(q)
  def index(key: T) = Set(Some(key), None)
}
