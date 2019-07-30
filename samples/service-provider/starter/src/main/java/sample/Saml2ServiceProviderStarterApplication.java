/*
 * Copyright 2002-2019 the original author or authors.
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
 *
 */
package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import boot.saml2.config.Saml2SampleBootConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SpringBootApplication
@Import({ Saml2SampleBootConfiguration.class })
public class Saml2ServiceProviderStarterApplication {

	public static void main(String[] args) {
		Log log = LogFactory.getLog(Saml2ServiceProviderStarterApplication.class);
		log.info("Starting SAML 2 Sample Application");
		SpringApplication.run(
			Saml2ServiceProviderStarterApplication.class, args
		);
	}

}
