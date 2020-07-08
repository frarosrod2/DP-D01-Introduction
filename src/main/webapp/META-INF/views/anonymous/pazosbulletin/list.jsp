<%@ page language="java"%>

<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.moment" path="moment" width="5%"/>
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.author" path="author" width="5%"/>
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.text" path="text" width="5%"/>
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.contact" path="contact" width="5%"/>
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.foodHandler" path="foodHandler" width="5%"/>
	
	<acme:list-column code="anonymous.pazosbulletin.list.label.experience" path="experience" width="5%"/>
	
</acme:list>