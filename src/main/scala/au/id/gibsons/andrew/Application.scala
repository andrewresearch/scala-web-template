/*
 * Copyright (c) 2014.
 *
 * Reflection Analytics Pty Ltd ("COMPANY") CONFIDENTIAL
 * All Rights Reserved.
 * NOTICE:  All information contained herein is, and remains the property of COMPANY.
 * The intellectual and technical concepts contained herein are proprietary to COMPANY and may be covered by
 * Australian and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior
 * written permission is obtained from COMPANY.  Access to the source code contained herein is hereby forbidden
 * to anyone except current COMPANY employees, managers or contractors who have executed Confidentiality and
 * Non-disclosure agreements explicitly covering such access.
 * The copyright notice above does not evidence any actual or intended publication or disclosure  of  this
 * source code, which includes information that is confidential and/or proprietary, and is a trade secret, of
 * COMPANY.
 * ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH USE  OF
 * THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION
 * OF APPLICABLE LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED
 * INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO
 * MANUFACTURE, USE, OR SELL ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.
 */

package au.id.gibsons.andrew

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{SpringBootApplication, EnableAutoConfiguration}
import org.springframework.context.annotation.{ComponentScan, Configuration}

/**
 * Application - this is the main object that spring-boot calls to run the app
 * Created by Andrew Gibson on 26/05/2014.
 */



@SpringBootApplication
class Application


object Application extends App {
  SpringApplication.run(classOf[Application])


}