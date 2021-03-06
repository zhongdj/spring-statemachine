/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.statemachine.transition;

import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.guard.Guard;
import org.springframework.statemachine.security.SecurityRule;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.trigger.Trigger;

import java.util.Collection;

public class DefaultInternalTransition<S, E> extends AbstractInternalTransition<S, E> {

	/**
	 * Instantiates a new default internal transition.
	 *
	 * @param source the source
	 * @param actions the actions
	 * @param event the event
	 * @param guard the guard
	 * @param trigger the trigger
	 */
	public DefaultInternalTransition(State<S, E> source, Collection<Action<S, E>> actions, E event, Guard<S, E> guard,
			Trigger<S, E> trigger) {
		super(source, actions, event, guard, trigger);
	}

	/**
	 * Instantiates a new default internal transition.
	 *
	 * @param source the source
	 * @param actions the actions
	 * @param event the event
	 * @param guard the guard
	 * @param trigger the trigger
	 * @param securityRule the security rule
	 */
	public DefaultInternalTransition(State<S, E> source, Collection<Action<S, E>> actions, E event, Guard<S, E> guard,
			Trigger<S, E> trigger, SecurityRule securityRule) {
		super(source, actions, event, guard, trigger, securityRule);
	}
}
