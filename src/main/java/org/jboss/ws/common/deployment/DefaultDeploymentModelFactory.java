/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.ws.common.deployment;

import org.jboss.wsf.spi.deployment.ArchiveDeployment;
import org.jboss.wsf.spi.deployment.Deployment;
import org.jboss.wsf.spi.deployment.DeploymentModelFactory;
import org.jboss.wsf.spi.deployment.Endpoint;
import org.jboss.wsf.spi.deployment.UnifiedVirtualFile;

/**
 * @author Heiko.Braun@jboss.com
 *         Created: Jul 18, 2007
 */
public class DefaultDeploymentModelFactory extends DeploymentModelFactory
{
   public Deployment newDeployment(String simpleName, ClassLoader classLoader, UnifiedVirtualFile rootFile)
   {
      return new DefaultDeployment(simpleName, classLoader);
   }

   public Endpoint newHttpEndpoint(String targetBean)
   {
      return new DefaultHttpEndpoint(targetBean);
   }
   
   public Endpoint newJMSEndpoint(String targetBean) 
   {
      return new DefaultJMSEndpoint(targetBean);
   }

   public Deployment newDeployment(ArchiveDeployment parent, String simpleName, ClassLoader classLoader, UnifiedVirtualFile rootFile)
   {
      throw new UnsupportedOperationException();
   }
}
