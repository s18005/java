<%@ page contentType="text/html;charset=utf-8" %>
<%! String title = "サーバサイドJavaの学習"; %>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title><%=title %></title>
</head>
<body>
<%
for (int i = 0; i < 5; i++) {
    out.println(title + "<br />");
}
%>

</body>
</html>
