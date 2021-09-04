<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>

<head>
    <style>
        h1 {
            color: brown;
            font-weight: bold;
        }
    </style>
</head>

<body>
    <h1>
        Result
    </h1>
        <% List result=(List) request.getAttribute("lottery"); Iterator it=result.iterator();
        out.println("<br>We have <br><br>");
        while(it.hasNext()){
            out.println(it.next()+"<br>");
        }
        %>
</body>

</html>