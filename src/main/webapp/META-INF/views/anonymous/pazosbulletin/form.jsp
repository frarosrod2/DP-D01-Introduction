<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.pazosbulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.pazosbulletin.form.label.text" path="text"/>
	<acme:form-textarea code="anonymous.pazosbulletin.form.label.contact" path="contact"/>
	<acme:form-checkbox code="anonymous.pazosbulletin.form.label.foodHandler" path="foodHandler"/>
	<acme:form-checkbox code="anonymous.pazosbulletin.form.label.experience" path="experience"/>
	<acme:form-submit code="anonymous.pazosbulletin.form.button.create" action="/anonymous/pazosbulletin/create"/>
	<acme:form-return code="anonymous.pazosbulletin.form.button.return"/>
	
</acme:form>