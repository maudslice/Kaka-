<%
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie c : cookies) {
		String name = c.getName();
		String Value = c.getValue();
		out.println(name + ":" + Value);
	} 
}else {
	out.println("No Cookie!");
}
%>