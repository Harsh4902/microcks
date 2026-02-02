/*
 * Copyright The Microcks Authors.
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
package io.github.microcks.task;

import io.github.microcks.domain.Request;
import io.github.microcks.repository.RequestRepository;
import io.github.microcks.repository.WebhookRegistrationRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author laurent
 */
@Component
public class TriggerWebhookTask {

   /** A simple logger for diagnostic messages. */
   private static final Logger log = LoggerFactory.getLogger(TriggerWebhookTask.class);

   private final WebhookRegistrationRepository webhookRegistrationRepository;
   private final RequestRepository requestRepository;

   public TriggerWebhookTask(WebhookRegistrationRepository webhookRegistrationRepository,
         RequestRepository requestRepository) {
      this.webhookRegistrationRepository = webhookRegistrationRepository;
      this.requestRepository = requestRepository;
   }

   @Scheduled(fixedRateString = "3s")
   public void triggerWebhook() {


   }
}
