/*
 * Password Management Servlets (PWM)
 * http://code.google.com/p/pwm/
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2012 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

/**
 * PasswordManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package password.pwm.ws.client.novell.pwdmgt;

public class PasswordManagementServiceLocator extends org.apache.axis.client.Service implements PasswordManagementService {

    public PasswordManagementServiceLocator() {
    }


    public PasswordManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PasswordManagementServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PasswordManagementPort
    private String PasswordManagementPort_address = "http://172.17.2.91:8080/IDM/pwdmgt/service";

    public String getPasswordManagementPortAddress() {
        return PasswordManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String PasswordManagementPortWSDDServiceName = "PasswordManagementPort";

    public String getPasswordManagementPortWSDDServiceName() {
        return PasswordManagementPortWSDDServiceName;
    }

    public void setPasswordManagementPortWSDDServiceName(String name) {
        PasswordManagementPortWSDDServiceName = name;
    }

    public PasswordManagement getPasswordManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PasswordManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPasswordManagementPort(endpoint);
    }

    public PasswordManagement getPasswordManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PasswordManagementBindingStub _stub = new PasswordManagementBindingStub(portAddress, this);
            _stub.setPortName(getPasswordManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPasswordManagementPortEndpointAddress(String address) {
        PasswordManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PasswordManagement.class.isAssignableFrom(serviceEndpointInterface)) {
                PasswordManagementBindingStub _stub = new PasswordManagementBindingStub(new java.net.URL(PasswordManagementPort_address), this);
                _stub.setPortName(getPasswordManagementPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("PasswordManagementPort".equals(inputPortName)) {
            return getPasswordManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.novell.com/pwdmgt/service", "PasswordManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.novell.com/pwdmgt/service", "PasswordManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("PasswordManagementPort".equals(portName)) {
            setPasswordManagementPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
