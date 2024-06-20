<%@page contentType=>

<%@include file="../header.html"%>





<%@include file="/footer.html">

<P>Hello!</p>
<p>こんにちは！

<select>
<% for(int i=0; i<values. length; i++){ %>

<option value="<%= values[i] %>"> <%= strs[i] %> </option>

<% } %>
</select>



