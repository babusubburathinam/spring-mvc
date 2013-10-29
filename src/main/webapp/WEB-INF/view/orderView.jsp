<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>

<form:form commandName="orderModel" action="/order/persist" method="POST">
    <form:input type="hidden" path="key"/>
    user i.d.: <form:input path="initiatingUserId"/>
    value: <form:input path="value"/>
    <input type="submit"/>
</form:form>