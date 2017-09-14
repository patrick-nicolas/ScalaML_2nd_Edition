/**
 * Copyright (c) 2013-2017  Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * The source code in this file is provided by the author for the sole purpose of illustrating the
 * concepts and algorithms presented in "Scala for Machine Learning".
 * ISBN: 978-1-783355-874-2 Packt Publishing.
 *
 * Version 0.99.2
 */
package org.scalaml.reinforcement

/**
 * This package object encapsulates the skeleton for the implementation of the
 * extended learning classifiers (XCS) using the following classes:
 *
 * - Actions triggered following the matching and selection of the most
 * appropriate rules '''XcsAction'''
 *
 * - Rules defined as {predicate, action} and comprising the search space or
 * knowledge base '''XcsRule'''
 *
 * - Singleton to generate new rule (predicate, action) if no match for the current
 * state/condition (predicate) of the environment exists  '''XcsCover'''
 *
 * - Sensor or input event (condition met) generated by the environment '''XcsSensor'''
 *
 * - Skeleton of the implementation of the XCS algorithm '''Xcs'''
 * @see Scala for Machine Learning Chapter 11 Reinforcement learning / Extended Learning
 *  classifiers system
 */
package object xcs {}
// ---------------------------------------  EOF -----------------------------------------